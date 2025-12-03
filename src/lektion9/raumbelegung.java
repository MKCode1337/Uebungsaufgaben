package lektion9;

public class raumbelegung {

    public static void belegungPruefen(Raum[] raeume) {
        for (Raum raum : raeume) {
            if (raum.belegt) System.out.println("Raum "+raum.getKennung()+" ist belegt.");
            else System.out.println("Raum "+raum.getKennung()+"  frei.");
        }
    }

    public static void main(String[] args) {
        Raum[] raeume =  new Raum[2];
        raeume[0] = new Raum("I.2.1", 30);
        raeume[1] = new Raum("I.2.15", 25);
        belegungPruefen(raeume);
        raeume[0].setBelegung(true);
        belegungPruefen(raeume);
    }
}
