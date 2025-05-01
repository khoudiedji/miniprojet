public class Aeroport {
    public String Nom;
    public String Ville;
    public String Description;

    public Aeroport(String nom, String ville, String description) {
        this.Nom = nom;
        this.Ville = ville;
        this.Description = description;
    }
    public void affecterVol(Vol vol) {
        System.out.println("Vol " + vol.getNumeroVol() + " affecté à l'aéroport " + Nom);
    }
}
