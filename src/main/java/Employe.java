public class Employe extends Personne{
    protected int NumeroEmploye;
    protected String DateEmbauche;

    public Employe(int identifiant, String nom,String adresse, String contact, int NumeroEmploye, String DateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.NumeroEmploye = NumeroEmploye;
        this.DateEmbauche = DateEmbauche;
    }
    @Override
    public void ObtenirInfos() {
        super.ObtenirInfos();
        System.out.println("Numéro employé: " + NumeroEmploye);
        System.out.println("Date embauche: " + DateEmbauche);
    }
    public String ObtenirRole() {
        return "Employé";
    }
}
