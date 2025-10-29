package lektion3;

import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        float x = scanner.nextFloat();

        System.out.println("Ergebnis Modulo: " + (x%7));    // Modulo liefert Restwert
        boolean ergebnisMod = ((x % 7)==0) ? true : false; //Wenn Modulo 0 true, sonst false

        if (ergebnisMod) {
            System.out.printf("Die Zahl ist ganzzahlig durch 7 teilbar.");
        }
        else {
            System.out.println("Die Zahl ist nicht ganzzahlig durch 7 teilbar.");
        }
        scanner.close();
    }
}
