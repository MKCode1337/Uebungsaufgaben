package lektion12;

import java.util.Scanner;

/**
 * Klasse Main – interaktives Menü für das Wörterbuch-Programm.
 *
 * Menüpunkte:
 *   1) Wort einfügen
 *   2) Wort suchen
 *   3) Wort löschen  (optional)
 *   0) Beenden
 */
public class Main {

    public static void main(String[] args) {

        Baum woerterbuch = new Baum();
        Scanner sc = new Scanner(System.in);

        // Einige Beispieleinträge vorab laden
        woerterbuch.insert(new Knoten("hello",
                "an expression or gesture of greeting – used interjectionally in greeting, " +
                        "in answering the telephone, or to express surprise"));
        woerterbuch.insert(new Knoten("apple",
                "the fleshy, usually rounded red, yellow, or green edible fruit of a tree"));
        woerterbuch.insert(new Knoten("zebra",
                "a large African wild horse with black-and-white stripes"));
        woerterbuch.insert(new Knoten("mango",
                "a fleshy, oval, yellow-red tropical fruit with a firm skin"));

        System.out.println("Willkommen beim Java-Wörterbuch!");
        System.out.println("(4 Beispielwörter wurden bereits geladen)\n");

        boolean laufen = true;

        while (laufen) {
            zeigeMenu();
            String eingabe = sc.nextLine().trim();

            switch (eingabe) {

                // ---- Einfügen ----
                case "1": {
                    System.out.print("Wort eingeben: ");
                    String wort = sc.nextLine().trim();
                    if (wort.isEmpty()) {
                        System.out.println("Kein Wort eingegeben.\n");
                        break;
                    }
                    System.out.print("Bedeutung eingeben: ");
                    String bedeutung = sc.nextLine().trim();
                    if (bedeutung.isEmpty()) {
                        System.out.println("Keine Bedeutung eingegeben.\n");
                        break;
                    }
                    woerterbuch.insert(new Knoten(wort, bedeutung));
                    System.out.println("\"" + wort + "\" wurde eingefügt.\n");
                    // kompletten Baum ausgeben
                    woerterbuch.print();
                    System.out.println();
                    break;
                }

                // ---- Suchen ----
                case "2": {
                    System.out.print("Zu suchendes Wort: ");
                    String suchwort = sc.nextLine().trim();
                    String ergebnis = woerterbuch.search(suchwort);
                    if (ergebnis != null) {
                        System.out.println("Gefunden!");
                        System.out.println("  " + suchwort + ": " + ergebnis);
                    } else {
                        System.out.println("\"" + suchwort + "\" wurde nicht gefunden.");
                    }
                    System.out.println();
                    break;
                }

                // ---- Löschen (optional) ----
                case "3": {
                    System.out.print("Zu löschendes Wort: ");
                    String loeschwort = sc.nextLine().trim();
                    if (loeschwort.isEmpty()) {
                        System.out.println("Kein Wort eingegeben.\n");
                        break;
                    }
                    // Prüfen ob vorhanden
                    if (woerterbuch.search(loeschwort) == null) {
                        System.out.println("\"" + loeschwort + "\" ist nicht im Wörterbuch.\n");
                        break;
                    }
                    woerterbuch.delete(new Knoten(loeschwort, ""));
                    System.out.println("\"" + loeschwort + "\" wurde gelöscht.\n");
                    woerterbuch.print();
                    System.out.println();
                    break;
                }

                // ---- Beenden ----
                case "0": {
                    laufen = false;
                    System.out.println("Auf Wiedersehen!");
                    break;
                }

                default: {
                    System.out.println("Ungültige Eingabe. Bitte 0–3 wählen.\n");
                }
            }
        }

        sc.close();
    }

    private static void zeigeMenu() {
        System.out.println("------- MENÜ -------");
        System.out.println(" 1) Wort einfügen");
        System.out.println(" 2) Wort suchen");
        System.out.println(" 3) Wort löschen");
        System.out.println(" 0) Beenden");
        System.out.print("Ihre Wahl: ");
    }
}
