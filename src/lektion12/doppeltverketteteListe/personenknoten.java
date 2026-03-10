package lektion12.doppeltverketteteListe;

public class personenknoten {
    public int alter;
    public String nachname;

    public personenknoten vorgaenger;
    public personenknoten nachfolger;

    personenknoten(int alter, String nachname) {
        this.alter      = alter;
        this.nachname   = nachname;
        this.vorgaenger = null;
        this.nachfolger = null;
    }

    @Override
    public String toString() {
        return String.format("%-15s (Alter: %3d)", nachname, alter);
    }
}
