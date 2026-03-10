package lektion12.doppeltverketteteListe;

// ----------------------------------------------------------------
// Hauptprogramm
// ----------------------------------------------------------------
public class doppelteListe {

    public static void main(String[] args) {

        lektion12.doppeltverketteteliste.liste liste = new lektion12.doppeltverketteteliste.liste();

        // c) Fünf personenknoten anlegen und sortiert einfügen
        liste.sortiertEinfuegen(new personenknoten(34, "Müller"));
        liste.sortiertEinfuegen(new personenknoten(19, "Schmidt"));
        liste.sortiertEinfuegen(new personenknoten(52, "Wagner"));
        liste.sortiertEinfuegen(new personenknoten(27, "Fischer"));
        liste.sortiertEinfuegen(new personenknoten(45, "Becker"));

        // Vorwärts- und Rückwärts-Ausgabe
        System.out.println("===========================================");
        System.out.println("  Doppelt verkettete Personenliste");
        System.out.println("===========================================\n");
        liste.ausgabeVorwaerts();

        // b) Suche nach Nachname
        System.out.println("===========================================");
        System.out.println("  Suche nach Nachname");
        System.out.println("===========================================\n");

        String[] suchNamen = { "Fischer", "Becker", "Maier" };

        for (String name : suchNamen) {
            personenknoten gefunden = liste.sucheNachNachname(name);
            if (gefunden != null) {
                System.out.printf("  ✔ \"%s\" gefunden: %s%n", name, gefunden);
            } else {
                System.out.printf("  ✘ \"%s\" nicht in der liste.%n", name);
            }
        }
        System.out.println();
    }
}
