package lektion12;

/**
 * Klasse Baum – binärer Suchbaum für Wörterbucheinträge.
 * Sortierkriterium: lexikografische Ordnung der Wörter (ignoriert Groß-/Kleinschreibung).
 *
 * Methoden:
 *   insert(Knoten k)   – sortiertes Einfügen
 *   print()            – in-order-Ausgabe (alphabetisch)
 *   search(String w)   – Suche; gibt Bedeutung zurück oder null
 *   delete(Knoten k)   – Löschen eines Knotens (optional)
 */
public class Baum {

    private Knoten wurzel;

    public Baum() {
        wurzel = null;
    }

    // ------------------------------------------------------------------ insert
    public void insert(Knoten k) {
        if (wurzel == null) {
            wurzel = k;
        } else {
            insertRekursiv(wurzel, k);
        }
    }

    private void insertRekursiv(Knoten aktuell, Knoten neu) {
        int cmp = neu.getWort().compareToIgnoreCase(aktuell.getWort());

        if (cmp < 0) {
            if (aktuell.links == null) {
                aktuell.links = neu;
            } else {
                insertRekursiv(aktuell.links, neu);
            }
        } else if (cmp > 0) {
            if (aktuell.rechts == null) {
                aktuell.rechts = neu;
            } else {
                insertRekursiv(aktuell.rechts, neu);
            }
        } else {
            // Wort bereits vorhanden – hier: überschreiben wäre möglich,
            // wir geben stattdessen eine Meldung aus.
            System.out.println("Hinweis: Das Wort \"" + neu.getWort()
                    + "\" ist bereits im Wörterbuch vorhanden.");
        }
    }

    // ------------------------------------------------------------------ print (in-order)
    public void print() {
        if (wurzel == null) {
            System.out.println("Das Wörterbuch ist leer.");
            return;
        }
        System.out.println("=== Wörterbuch (alphabetisch) ===");
        inOrder(wurzel);
        System.out.println("=================================");
    }

    private void inOrder(Knoten k) {
        if (k == null) return;
        inOrder(k.links);
        System.out.println("  " + k);
        inOrder(k.rechts);
    }

    // ------------------------------------------------------------------ search
    /**
     * Sucht das Wort w im Baum.
     * @return Bedeutung des Wortes oder null, falls nicht gefunden.
     */
    public String search(String w) {
        return searchRekursiv(wurzel, w);
    }

    private String searchRekursiv(Knoten aktuell, String w) {
        if (aktuell == null) return null;

        int cmp = w.compareToIgnoreCase(aktuell.getWort());
        if (cmp == 0) {
            return aktuell.getBedeutung();
        } else if (cmp < 0) {
            return searchRekursiv(aktuell.links, w);
        } else {
            return searchRekursiv(aktuell.rechts, w);
        }
    }

    // ------------------------------------------------------------------ delete (optional)
    /**
     * Löscht den Knoten mit demselben Wort wie k aus dem Baum.
     */
    public void delete(Knoten k) {
        wurzel = deleteRekursiv(wurzel, k.getWort());
    }

    private Knoten deleteRekursiv(Knoten aktuell, String w) {
        if (aktuell == null) {
            System.out.println("Hinweis: Das Wort \"" + w + "\" wurde nicht gefunden.");
            return null;
        }

        int cmp = w.compareToIgnoreCase(aktuell.getWort());

        if (cmp < 0) {
            aktuell.links = deleteRekursiv(aktuell.links, w);
        } else if (cmp > 0) {
            aktuell.rechts = deleteRekursiv(aktuell.rechts, w);
        } else {
            // Knoten gefunden – drei Fälle:

            // Fall 1: Blatt (keine Kinder)
            if (aktuell.links == null && aktuell.rechts == null) {
                return null;
            }
            // Fall 2a: nur rechtes Kind
            if (aktuell.links == null) {
                return aktuell.rechts;
            }
            // Fall 2b: nur linkes Kind
            if (aktuell.rechts == null) {
                return aktuell.links;
            }
            // Fall 3: zwei Kinder – in-order-Nachfolger (kleinstes Element im rechten Teilbaum)
            Knoten nachfolger = findeMin(aktuell.rechts);
            // Wir ersetzen den zu löschenden Knoten durch einen neuen Knoten
            // mit den Daten des Nachfolgers ...
            Knoten ersatz = new Knoten(nachfolger.getWort(), nachfolger.getBedeutung());
            ersatz.links  = aktuell.links;
            ersatz.rechts = deleteRekursiv(aktuell.rechts, nachfolger.getWort());
            return ersatz;
        }
        return aktuell;
    }

    /** Hilfsmethode: kleinstes Element im Teilbaum ab k */
    private Knoten findeMin(Knoten k) {
        while (k.links != null) k = k.links;
        return k;
    }
}
