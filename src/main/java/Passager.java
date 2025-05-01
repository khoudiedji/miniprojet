import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne{
    String passeport;

    private List<Reservation> reservations = new ArrayList<>();

    public Passager(int identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol(Vol vol) {
        Reservation res = new Reservation("RES" + (reservations.size() + 1), vol);
        reservations.add(res);
        vol.ajouterPassager(this);
        System.out.println("Réservation effectuée pour le vol " + vol.getNumeroVol());
    }

    public void annulerReservation(String numeroReservation) {
        boolean trouve = false;
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getNumeroReservation().equals(numeroReservation)) {
                reservations.get(i).annulerReservation();
                reservations.remove(i);
                System.out.println("Réservation " + numeroReservation + " annulée.");
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Réservation " + numeroReservation + " introuvable.");
        }
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }
}
