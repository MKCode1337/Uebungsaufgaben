package lektion5;

import java.util.Scanner;

public class potenz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Potenz ein:");
        int n = input.nextInt();
        System.out.println("Geben Sie eine Basis ein:");
        double b = input.nextDouble();
        double ergebnis = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ergebnis *= b;
            }
        }
        else if (n == 0) {
            ergebnis = 1;
        }
        else if (n < 0){
            double zwischenergebnis = 1;
            for (int i = n; i < 0; i++) {
                zwischenergebnis *= b;
                ergebnis = 1.0/zwischenergebnis;
            }
        }
        System.out.println(b + " hoch " + n + " macht " + ergebnis);
    }
}
