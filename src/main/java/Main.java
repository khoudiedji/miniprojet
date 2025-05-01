/* Lien GitHub : https://github.com/khoudiedji/miniprojet  */

public class Main {
    public static void main(String[] args) {
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international");
        Aeroport jfk = new Aeroport("JFK", "New York", "Aéroport international");

        Vol vol1 = new Vol("AF001", cdg, jfk, "2025-06-01 10:00", "2025-06-01 14:00");

        Pilote pilote = new Pilote(1, "Jean Dupont", "Paris", "0600000000", "EMP001", "2020-01-01", "FR1234", 1500);
        PersonnelCabine cabine1 = new PersonnelCabine(2, "Marie Curie", "Paris", "0611111111", "EMP002", "2021-01-01", "Hôtesse");
        PersonnelCabine cabine2 = new PersonnelCabine(3, "Albert Einstein", "Paris", "0622222222", "EMP003", "2022-01-01", "Steward");

        pilote.affecterVol(vol1);
        cabine1.affecterVol(vol1);
        cabine2.affecterVol(vol1);

        Passager passager1 = new Passager(10, "Alice Martin", "Lyon", "0633333333", "FR987654");
        passager1.reserverVol(vol1);
        passager1.obtenirReservations();

        Avion avion1 = new Avion("F-GSPS", "Boeing 777", 300);
        avion1.affecterVol(vol1);

        cdg.affecterVol(vol1);

        passager1.annulerReservation("RES1");
        passager1.obtenirReservations();
    }
}