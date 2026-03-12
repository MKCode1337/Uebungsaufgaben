package lektion12;

public class Knoten {

    // --- Wörterbuch-Daten ---
    private String wort;
    private String bedeutung;

    // --- Baum-Verweise ---
    Knoten links;
    Knoten rechts;

    // Konstruktor
    public Knoten(String wort, String bedeutung) {
        this.wort      = wort;
        this.bedeutung = bedeutung;
        this.links     = null;
        this.rechts    = null;
    }

    // Getter / Setter
    public String getWort()      { return wort; }
    public String getBedeutung() { return bedeutung; }

    @Override
    public String toString() {
        return wort + ": " + bedeutung;
    }
}
