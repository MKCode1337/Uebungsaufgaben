package lektion6;

import java.util.Scanner;

public class primzahlMethode {
    public static boolean istPrimzahl(int zahl) {
        boolean istPrimzahl = true;
        for (int i = 2; i < zahl; i++) {    //Mit allen Zahlen von 2 bis eins kleiner als die Zahl abgleichen
            if (zahl % i == 0) {            //Falls Modulo = 0 -> keine Primzahl und beenden
                istPrimzahl = false;
                break;
            }
        }
        return istPrimzahl;                 //Wenn nie Modulo 0 herauskam immernoch true
    }
    public static void main(String[] args) {
        System.out.println(istPrimzahl(47));
    }
}
