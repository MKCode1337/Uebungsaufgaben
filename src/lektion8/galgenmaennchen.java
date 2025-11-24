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

        for (int i = 0; i < 15; i++) {
            wortAnzeigen(rateWort, eingabeN);
            System.out.println("\n");
            eingabeN[i] = eingabeLesen();

            //Gewinnbedingung prüfen
            String loesungswort = String.valueOf(rateWort);
            String eingabeWort = String.valueOf(eingabeN);
            if (loesungswort.equals(eingabeWort)) {
                System.out.println("Gewonnen!!!");
                break;
            }
        }

    }
    public static char eingabeLesen() {
        Scanner input = new Scanner(System.in);
        System.out.println("Buchstabe eingeben: ");
        String eingabe = input.nextLine();
        return eingabe.toUpperCase().charAt(0);
    }

    public static void wortAnzeigen(char[] rateWort, char[] eingabeN) {
        for (int i = 0; i < rateWort.length; i++) {
            char ausgabe = '_';
            for (int j = 0; j < eingabeN.length; j++) {
                if (rateWort[i] == eingabeN[j]) {
                    ausgabe = rateWort[i];
                    break;
                }
            }
            System.out.print(ausgabe+" ");
        }
    }


}
