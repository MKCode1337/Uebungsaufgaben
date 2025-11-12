package lektion6;

public class runden {
    public static int runden(double x) {
        int ergebnis = (int) x;
        if (x-ergebnis>=0.5){
            ergebnis++;
            return ergebnis;
        }
        else{
            return ergebnis;
        }
    }

    public static double aufStellenRunden(double zahl, int stellen) {
        double faktor = 1;

        for (int i = 0; i < stellen; i++) {
            faktor *= 10;
            //Bei 2 Stellen Faktor = 1*10*10=100
        }
        double verschobeneZahl = zahl*faktor;
        int gerundeteZahl = runden(verschobeneZahl);

        double ergebnisZahl = gerundeteZahl/faktor;
        return ergebnisZahl;
    }

    public static void main(String[] args) {
        double zahl = 17.5765;
        int stellen = 3;
        System.out.println(aufStellenRunden(zahl, stellen));
    }
}