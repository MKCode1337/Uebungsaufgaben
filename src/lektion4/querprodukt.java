package lektion4;

import java.util.Scanner;

public class querprodukt {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahl = 0;
        boolean istGueltig = false;

        while (!istGueltig) {
            System.out.println("Geben Sie bitte eine Zahl ein: ");
            zahl = sc.nextInt();

            if (zahl >= 1 && zahl <= 1000000) {
                istGueltig = true;
            }
            else {
                System.out.println("FEHLER - Zahl ist ungueltig");
            }

            int querprodukt = 1;

            for (int i = zahl; i > 0;i=i/10) {
                int letzteStelle = i%10;
                querprodukt *= letzteStelle;
            }
            System.out.println("Das Querprodukt der Zahl "+zahl+" betraegt "+querprodukt);
        }
    }
}
