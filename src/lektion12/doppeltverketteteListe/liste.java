package lektion12.doppeltverketteteliste;

import lektion12.doppeltverketteteListe.personenknoten;

public class liste {
    personenknoten start; // Startknoten (head)

    public liste() {
        start = null;
    }

    // ------------------------------------------------------------
    // a) Sortiertes Einfügen nach Alter (aufsteigend)
    // ------------------------------------------------------------
    public void sortiertEinfuegen(personenknoten neu) {

        // Fall 1: liste ist leer
        if (start == null) {
            start = neu;
            return;
        }

        // Fall 2: Neuer Knoten kommt vor dem aktuellen Startknoten
        if (neu.alter <= start.alter) {
            neu.nachfolger      = start;
            start.vorgaenger    = neu;
            start               = neu;
            return;
        }

        // Fall 3: Richtige Position in der liste suchen
        personenknoten aktuell = start;
        while (aktuell.nachfolger != null && aktuell.nachfolger.alter < neu.alter) {
            aktuell = aktuell.nachfolger;
        }

        // neu zwischen aktuell und aktuell.nachfolger einfügen
        neu.nachfolger = aktuell.nachfolger;
        neu.vorgaenger = aktuell;

        if (aktuell.nachfolger != null) {
            aktuell.nachfolger.vorgaenger = neu;
        }
        aktuell.nachfolger = neu;
    }

    // ------------------------------------------------------------
    // b) Suche nach Nachname – gibt ersten Treffer zurück
    // ------------------------------------------------------------
    public personenknoten sucheNachNachname(String nachname) {
        personenknoten aktuell = start;
        while (aktuell != null) {
            if (aktuell.nachname.equalsIgnoreCase(nachname)) {
                return aktuell;
            }
            aktuell = aktuell.nachfolger;
        }
        return null; // nicht gefunden
    }

    // ------------------------------------------------------------
    // c) Vorwärts-Ausgabe und Rückwärts-Ausgabe
    // ------------------------------------------------------------
    public void ausgabeVorwaerts() {
        System.out.println("--- Vorwärts ---");
        personenknoten aktuell = start;
        personenknoten letzter = null;
        int pos = 1;
        while (aktuell != null) {
            System.out.printf("  [%d] %s%n", pos++, aktuell);
            letzter = aktuell;
            aktuell = aktuell.nachfolger;
        }
        System.out.println("--- Ende der liste ---\n");
        ausgabeRueckwaerts(letzter);
    }

    void ausgabeRueckwaerts(personenknoten letzter) {
        System.out.println("--- Rückwärts ---");
        personenknoten aktuell = letzter;
        int pos = 1;
        while (aktuell != null) {
            System.out.printf("  [%d] %s%n", pos++, aktuell);
            aktuell = aktuell.vorgaenger;
        }
        System.out.println("--- Anfang der liste ---\n");
    }
}