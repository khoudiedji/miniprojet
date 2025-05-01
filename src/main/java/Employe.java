public class Employe extends Personne{
    protected String NumeroEmploye;
    protected String DateEmbauche;

    public Employe(int identifiant, String nom,String adresse, String contact, String NumeroEmploye, String DateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.NumeroEmploye = NumeroEmploye;
        this.DateEmbauche = DateEmbauche;
    }
    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Numéro employé: " + NumeroEmploye);
        System.out.println("Date embauche: " + DateEmbauche);
    }
    public String obtenirRole() {
        return "Employé";
    }
}
