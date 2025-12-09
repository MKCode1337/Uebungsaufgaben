package lektion9;

public class Pizza {
    private String name;
    private int[] durchmesser;
    private float[] preis;

    public Pizza(String name, int[] durchmesser, float[] preis) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;                 // Array wird schon im Konstruktor initialisiert

//        int anzahlDurchmesser = durchmesser.length;
//        this.durchmesser = new int[anzahlDurchmesser];
//        this.preis = new float[anzahlDurchmesser];
//        for (int i = 0; i < anzahlDurchmesser; i++) {
//            this.durchmesser[i] = durchmesser[i];
//            this.preis[i] = preis[i];
//        }
    }

    public String getBestePreisLeistung() {
        float bestePreisLeistung = 0;
//        int anzahlDurchmesser = this.durchmesser.length;
        int besterDurchmesser = 0;
        for (int i = 0; i < this.durchmesser.length; i++) {
            float flaechePizza = (float) (Math.PI * Math.pow((this.durchmesser[i] / 2), 2));
            float preisLeistung = flaechePizza/preis[i];
            if (preisLeistung > bestePreisLeistung) {
                bestePreisLeistung = preisLeistung;
                besterDurchmesser = this.durchmesser[i];
            }
        }
        return System.out.printf("Das beste Preis/Leistungsverhältnis für Pizza "+this.name+" gibt es bei "+besterDurchmesser+"cm mit %.2f cm^2 pro Euro!", bestePreisLeistung).toString();
    }
}

