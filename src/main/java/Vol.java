import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private Date dateDepart;
    private Date dateArrivee;
    private Pilote pilote;
    private List<PersonnelCabine> personnelCabine;
    private List<Reservation> reservations;

    public Vol(String numeroVol, String origine, String destination,
               Date dateDepart, Date dateArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.personnelCabine = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void affecterVol(Pilote pilote) {
        this.pilote = pilote;
    }

    public void ajouterPersonnel(PersonnelCabine personnel) {
        personnelCabine.add(personnel);
    }

    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void annulerVol() {
        System.out.println("Vol " + numeroVol + " annulé");
        for (Reservation res : reservations) {
            res.annulerReservation();
        }
    }

    public void obtenirVol() {
        System.out.println("Vol " + numeroVol);
        System.out.println("Trajet: " + origine + " -> " + destination);
        System.out.println("Date: " + dateDepart);
        if (pilote != null) {
            System.out.println("Pilote: " + pilote.getNom());
        }
        System.out.println("Nombre de réservations: " + reservations.size());
    }

    // Getters
    public String getNumeroVol() { return numeroVol;
    }
    public String getOrigine() { return origine; }
    public String getDestination() { return destination; }
    public Date getDateDepart() { return dateDepart; }
    public Date getDateArrivee() { return dateArrivee; }

}