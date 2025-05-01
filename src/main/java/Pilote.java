import java.util.List;

public class Pilote extends Employe{
    private String licence;
    private int heuresDeVol;
    private Vol volAffecte;
    public Pilote(int identifiant, String nom, String adresse, String contact,
                  String numeroEmployee, String dateEmbauche,
                  String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmployee, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Licence: " + licence);
        System.out.println("Heures de vol: " + heuresDeVol);
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }

    public Vol obtenirVol() {
        return volAffecte;
    }

    public void affecterVol(Vol vol) {
        this.volAffecte=vol;
        System.out.println("Pilote " + getNom() + " affecté au vol " + vol.getNumeroVol());
    }
}
