package lektion6;

import java.util.Scanner;

public class fakultaetMitSchleife {
    public static double fakultaet(int x){
        double ergebnis = 1;
        int faktor = x;
        for (int i = 1; i <= x; i++) {
            ergebnis *= faktor;
            faktor--;
        }
        return ergebnis;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl für Fakultät einlesen: ");
        int zahl = scanner.nextInt();
        double ergebnis = fakultaet(zahl);
        System.out.println(zahl+" Fakultät ergibt: "+ergebnis);
    }
}
