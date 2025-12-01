package lektion9;

public class Pizza {
    String name;
    int[] durchmesser;
    float[] preis;

    public Pizza(String name, int[] durchmesser, float[] preis) {
        this.name = name;
        int anzahlDurchmesser = durchmesser.length;
        this.durchmesser = new int[anzahlDurchmesser];
        this.preis = new float[anzahlDurchmesser];
        for (int i = 0; i < anzahlDurchmesser; i++) {
            this.durchmesser[i] = durchmesser[i];
            this.preis[i] = preis[i];
        }
    }

    public void getBestePreisLeistung() {
        float bestePreisLeistung = 0;
        int anzahlDurchmesser = this.durchmesser.length;
        int besterDurchmesser = 0;
        for (int i = 0; i < anzahlDurchmesser; i++) {
            float flaechePizza = (float) (Math.PI * Math.pow((this.durchmesser[i] / 2), 2));
            float preisLeistung = flaechePizza/preis[i];
            if (preisLeistung > bestePreisLeistung) {
                bestePreisLeistung = preisLeistung;
                besterDurchmesser = this.durchmesser[i];
            }
        }
        System.out.printf("Das beste Preis/Leistungsverhältnis gibt es bei einem Durchmesser von "+besterDurchmesser+"cm mit %.2f cm^2 pro Euro!", bestePreisLeistung);
    }
}

