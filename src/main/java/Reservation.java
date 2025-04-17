public class Reservation {
    private String numeroReservation;
    private Passager passager;
    private Vol vol;
    private String dateReservation;
    private boolean estAnnulee;

    public Reservation(String numeroReservation, Passager passager, Vol vol, String dateReservation) {
        this.numeroReservation = numeroReservation;
        this.passager = passager;
        this.vol = vol;
        this.dateReservation = dateReservation;
        this.estAnnulee = false;
    }

    public void annulerReservation() {
        this.estAnnulee = true;
        System.out.println("Réservation " + numeroReservation + " annulée");
    }

    public void obtenirReservations() {
        System.out.println("Réservation " + numeroReservation);
        System.out.println("Passager: " + passager.getNom());
        System.out.println("Vol: " + vol.getNumeroVol());
        System.out.println("Date réservation: " + dateReservation);
        System.out.println("Statut: " + (estAnnulee ? "Annulée" : "Confirmée"));
    }

    // Getters
    public String getNumeroReservation() { return numeroReservation; }
}