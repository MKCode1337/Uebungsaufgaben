package lektion3;

import java.util.Scanner;

public class matrikelNummer {
    public static void main(String[] args) {

        String matrikelNummer = "5172345";
        char ersteStelle = matrikelNummer.charAt(0);
        char zweiteStelle = matrikelNummer.charAt(1);

        if (matrikelNummer.length() == 7) {
            if ((ersteStelle == 53) && (zweiteStelle == (48)) || (ersteStelle == 53) && (zweiteStelle == (49)) || (ersteStelle == 54) && (zweiteStelle == (49)) ) {
                System.out.println("Die Matrikelnummer ist gültig");
            }
            else
                System.out.println("Ungültige Matrikelnummer");
        }
        else
            System.out.println("Matrikelnummer muss 7-Stellig sein!");

        }
}
