public class Personne {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected String contact;

    public Personne(int identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }
    public void ObtenirInfos(){
        System.out.println("Identifiant : " + identifiant + "\nNom : " + nom + "\nAdresse : " + adresse + "\nContact : " + contact);
    }

    public int getIdentifiant() { return identifiant; }
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public String getContact() { return contact; }
}
