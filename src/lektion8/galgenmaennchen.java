package lektion8;

import java.util.Arrays;
import java.util.Scanner;

public class galgenmaennchen {
    public static void main(String[] args) {
        String[] wort = {"PROGRAMMIERSPRACHE", "TEST"};
        int zufallsIndex = (int) (Math.random()* wort.length);
        char[] rateWort = wort[zufallsIndex].toCharArray();
        System.out.println(Arrays.toString(rateWort));
        char[] eingabeN = new char[15];
        char[] loesung = new char[rateWort.length];
        int versucheCounter=0;
        for (int i = 0; i < 15; i++) {
            // Wort anzeigen
            for (int n = 0; n < rateWort.length; n++) {
                char ausgabe = '_';
                for (int j = 0; j < eingabeN.length; j++) {
                    if (rateWort[n] == eingabeN[j]) {
                        ausgabe = rateWort[n];
                        loesung[n] = rateWort[n];
                        break;
                    }
                }
                System.out.print(ausgabe+" ");
            }
            System.out.println("\n");


            //Gewinnbedingung prüfen
            String loesungswort = String.valueOf(rateWort);
            String eingabeWort = String.valueOf(loesung);
            if (loesungswort.equals(eingabeWort)) {
                System.out.println("Gewonnen!!!");
                break;
            }
            else eingabeN[i] = eingabeLesen();
            versucheCounter++;
        }
        if (versucheCounter == 15) System.out.println("Leider verloren!!!");
    }

    public static char eingabeLesen() {
        Scanner input = new Scanner(System.in);
        System.out.println("Buchstabe eingeben: ");
        String eingabe = input.nextLine();
        return eingabe.toUpperCase().charAt(0);
    }
}
