import java.util.List;

public class PersonnelCabine extends Employe {
    private Vol volAffecte;
    private String qualificaion;
    public PersonnelCabine(int identifiant, String nom, String adresse, String contact,
                           String numeroEmployee, String dateEmbauche, String qualificaion) {
        super(identifiant, nom, adresse, contact, numeroEmployee, dateEmbauche);
        this.qualificaion = qualificaion;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de cabine";
    }

    public void affecterVol(Vol vol) {
        this.volAffecte = vol;
        System.out.println("Vol " + vol.getNumeroVol() + " affecté au personnel cabine.");
    }

    public Vol obtenirVol() {
        return volAffecte;
    }
}
