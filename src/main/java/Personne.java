public class Personne {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int contact;

    public Personne(int identifiant, String nom, String adresse, int contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }
    public String ObtenirInfos(){
        return ("Identifiant : " + identifiant + "\nNom : " + nom + "\nAdresse : " + adresse + "\nContact : " + contact);
    }
}
