package lektion4;

import java.util.Scanner;

public class primzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte zu untersuchende Zahl eingeben: ");
        int zahl = scanner.nextInt();
        String istPrimzahl = zahl+" ist eine Primzahl!";;
        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                istPrimzahl = zahl + " ist keine Primzahl!";
            }
        }
        System.out.println(istPrimzahl);
    }
}
