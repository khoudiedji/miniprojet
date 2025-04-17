import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Passager extends Personne{
    String passeport;

    private List<Reservation> reservations;

    public Passager(int identifiant, String nom, String adresse, String contact) {
        super(identifiant, nom, adresse, contact);
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Vol vol, String dateReservation) {
        Reservation reservation = new Reservation(generateReservationId(), this, vol, dateReservation);
        reservations.add(reservation);
        vol.ajouterReservation(reservation);
    }

    public void annulerReservation(String reservationId) {
        reservations.removeIf(r -> r.getNumeroReservation().equals(reservationId));
    }

    private String generateReservationId() {
        return "RES-" + UUID.randomUUID().toString().substring(0, 8);
    }
}
