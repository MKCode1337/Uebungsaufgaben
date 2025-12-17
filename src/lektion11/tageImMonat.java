package lektion11;

import java.util.Scanner;

public class tageImMonat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean fehler = false;
        do {
            try {
                System.out.println("Monat eingeben: ");
                String monat = input.nextLine();
                System.out.println(tageImMonat(monat));
                fehler = false;
            } catch (RuntimeException e) {
                System.out.println("Fehlerhafte Eingabe!");
                fehler = true;
            }
        }
        while (fehler);
        input.close();
    }

    public static int tageImMonat(String monat)
    {
        int tage = switch(monat)
        {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                 "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }
}
