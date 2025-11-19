package lektion7;

import java.util.Scanner;

public class sinusBerechnung {
        public static double sin(double x) {
        double zaehler = 1.0 * x;
        double nenner = 1.0;
        double summe = x;
        double summand = 1.0;
        for (int i = 3; summand > 1E-15 || summand < -1E-15; i=i+2) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i - 1);
            summand = zaehler / nenner;
            summe = summe + summand;
        }
        return summe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie den Wert für x ein: ");
        double x = sc.nextDouble();
        System.out.println("Der Sinus von x beträgt: "+sin(x));
    }

}
