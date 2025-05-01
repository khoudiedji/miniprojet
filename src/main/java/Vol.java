import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
    private String numeroVol;
    private Aeroport origine;
    private Aeroport destination;
    private Date dateDepart;
    private Date dateArrivee;
    private String etat;
    private List<Passager> passagers = new ArrayList<>();

    public Vol(String numeroVol, Aeroport origine, Aeroport destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.etat = "Planifié";
    }

    public void planifierVol() {
        this.etat = "Planifié";
        System.out.println("Vol planifié.");
    }

    public void annulerVol() {
        this.etat = "Annulé";
        System.out.println("Vol annulé.");
    }

    public void modifierVol(Date nouvelleDateDep, Date nouvelleDateArr) {
        this.dateDepart = nouvelleDateDep;
        this.dateArrivee = nouvelleDateArr;
        System.out.println("Horaires du vol modifiés.");
    }

    public void ajouterPassager(Passager p) {
        passagers.add(p);
    }

    public List<Passager> listingPassager() {
        return passagers;
    }

    public String getNumeroVol() {
        return numeroVol;
    }
    public Date getDateDepart() {return dateDepart;}
    public Date getDateArrivee() {return dateArrivee;}

}