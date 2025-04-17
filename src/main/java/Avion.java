import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Avion {
    private String numeroSerie;
    private String modele;
    private int capacite;
    private List<Vol> vols;

    public Avion(String numeroSerie, String modele, int capacite) {
        this.numeroSerie = numeroSerie;
        this.modele = modele;
        this.capacite = capacite;
        this.vols = new ArrayList<>();
    }

    public boolean verifierDisponibilite(Date dateDepart, Date dateArrivee) {
        for (Vol vol : vols) {
            if ((dateDepart.after(vol.getDateDepart()) && dateDepart.before(vol.getDateArrivee())) ||
                    (dateArrivee.after(vol.getDateDepart()) && dateArrivee.before(vol.getDateArrivee()))) {
                return false;
            }
        }
        return true;
    }

    public void affecterVol(Vol vol) {
        if (verifierDisponibilite(vol.getDateDepart(), vol.getDateArrivee())) {
            vols.add(vol);
        } else {
            System.out.println("L'avion n'est pas disponible pour cette plage horaire");
        }
    }
}