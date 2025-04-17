import java.util.List;

public class PersonnelCabine extends Employe {
    private List<Vol> volsAffectes;
    public PersonnelCabine(int identifiant, String nom, String adresse, String contact,
                           int numeroEmployee, String dateEmbauche) {
        super(identifiant, nom, adresse, contact, numeroEmployee, dateEmbauche);
    }

    @Override
    public String ObtenirRole() {
        return "Personnel de cabine";
    }

    public void affecterVol(Vol vol) {
        vol.ajouterPersonnel(this);
        System.out.println("Personnel " + getNom() + " affecté au vol " + vol.getNumeroVol());
    }
}
