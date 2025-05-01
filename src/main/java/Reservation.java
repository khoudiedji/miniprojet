public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut;
    private Vol vol;

    public Reservation(String numeroReservation, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = java.time.LocalDate.now().toString();
        this.statut = "En attente";
        this.vol = vol;
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("Réservation " + numeroReservation + " annulée.");
    }

    public void modifierReservation(String nouveauStatut) {
        this.statut = nouveauStatut;
        System.out.println("Statut de la réservation " + numeroReservation + " modifié.");
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public static String getNumeroReservation(String numeroReservation) {return numeroReservation;}
    public String getDateReservation() {return dateReservation;}
    public String getStatut() {return statut;}


}