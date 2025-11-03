package lektion5;

public class reihenwert {
    public static void main(String[] args) {
        double summe = 0;
        double zwischensumme = 0;
        int k=1;
        do {
            zwischensumme = 1.0/(Math.pow(k, 2));
            summe = 6*zwischensumme;
            System.out.println("Das Reihenergebnis lautet: " + summe);
            k++;
        }
        while (zwischensumme > 1E-5);
    }
}
