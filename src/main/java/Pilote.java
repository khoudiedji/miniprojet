import java.util.List;

public class Pilote extends Employe{
    private String licence;
    private int heuresDeVol;
    private List<Vol> volsAffectes;

    public Pilote(int identifiant, String nom, String adresse, String contact,
                  int numeroEmployee, String dateEmbauche,
                  String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmployee, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public void ObtenirInfos() {
        super.ObtenirInfos();
        System.out.println("Licence: " + licence);
        System.out.println("Heures de vol: " + heuresDeVol);
    }

    @Override
    public String ObtenirRole() {
        return "Pilote";
    }

    public void affecterVol(Vol vol) {
        volsAffectes.add(vol);
        System.out.println("Pilote " + getNom() + " affecté au vol " + vol.getNumeroVol());
    }
}
