package lektion5;

import java.util.Scanner;

public class piRechtecknaeherung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Anzahl Rechtecke für Annaehrung eingeben: ");
        int anzahlRechtecke = input.nextInt();

        double rechteckeBruch = 1.0 / anzahlRechtecke;
        double flaecheRGesamt =0;
        double x = 1.0;

        for (int i = 0; i < anzahlRechtecke; i++) {
            if(anzahlRechtecke== 1) {
                flaecheRGesamt = 1*rechteckeBruch;
                continue;
            }
            double flaecheRechtesR;
            x = Math.sqrt(1-Math.pow(rechteckeBruch*(i), 2));
            flaecheRechtesR = x * rechteckeBruch;
            flaecheRGesamt += flaecheRechtesR;
        }

        double piAnnaeherung = flaecheRGesamt * 4;
        System.out.println("Die Annaeherung von PI ist: " + piAnnaeherung);
    }
}
