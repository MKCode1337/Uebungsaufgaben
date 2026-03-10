package lektion12;

import java.util.Random;

public class echteLottoziehung {

    // -------------------------------------------------------
    // Innere Klasse: Knoten der einfach verketteten Liste
    // -------------------------------------------------------
    static class Knoten {
        int wert;
        Knoten next;

        Knoten(int wert) {
            this.wert = wert;
            this.next = null;
        }
    }

    // -------------------------------------------------------
    // Innere Klasse: Einfach verkettete Liste
    // -------------------------------------------------------
    static class verketteteListe {
        Knoten head;
        int size;

        verketteteListe() {
            head = null;
            size = 0;
        }

        /** Fügt eine neue Zahl am Ende der Liste hinzu. */
        void add(int wert) {
            Knoten newKnoten = new Knoten(wert);
            if (head == null) {
                head = newKnoten;
            } else {
                Knoten current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newKnoten;
            }
            size++;
        }

        /**
         * Entfernt den Knoten an Position index (0-basiert)
         * und gibt seinen Wert zurück.
         */
        int removeAt(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Ungültiger Index: " + index);
            }

            int removedwert;

            if (index == 0) {
                // Erstes Element entfernen
                removedwert = head.wert;
                head = head.next;
            } else {
                // Vorgängerknoten suchen
                Knoten previous = head;
                for (int i = 0; i < index - 1; i++) {
                    previous = previous.next;
                }
                // Knoten ausketten
                Knoten toRemove = previous.next;
                removedwert = toRemove.wert;
                previous.next = toRemove.next;
            }

            size--;
            return removedwert;
        }
    }

    // -------------------------------------------------------
    // Hauptprogramm
    // -------------------------------------------------------
    public static void main(String[] args) {

        // 1) Liste mit den Zahlen 1–49 befüllen
        verketteteListe kugeln = new verketteteListe();
        for (int i = 1; i <= 49; i++) {
            kugeln.add(i);
        }

        // 2) 6 Kugeln zufällig aus der Liste ausketten
        Random random = new Random();
        int[] gezogen = new int[6];

        System.out.println("=== Lottoziehung 6 aus 49 ===\n");
        System.out.println("Ziehungsreihenfolge:");

        for (int i = 0; i < 6; i++) {
            // Zufälligen Index im noch verbleibenden Bereich wählen
            int zufallsIndex = random.nextInt(kugeln.size);

            // Zahl an diesem Index ausketten
            int kugel = kugeln.removeAt(zufallsIndex);
            gezogen[i] = kugel;

            System.out.printf("  %d. Ziehung (aus %2d Kugeln): %2d%n",
                    i + 1, kugeln.size + 1, kugel);
        }

        // 3) Gezogene Zahlen sortieren (einfaches Insertion Sort)
        for (int i = 1; i < gezogen.length; i++) {
            int key = gezogen[i];
            int j = i - 1;
            while (j >= 0 && gezogen[j] > key) {
                gezogen[j + 1] = gezogen[j];
                j--;
            }
            gezogen[j + 1] = key;
        }

        // 4) Sortiertes Ergebnis ausgeben
        System.out.println("\nSortierte Lottozahlen:");
        System.out.print("  ");
        for (int i = 0; i < gezogen.length; i++) {
            System.out.printf("%2d", gezogen[i]);
            if (i < gezogen.length - 1) {
                System.out.print("  -  ");
            }
        }
        System.out.println();
    }
}
