package lektion10;

import lektion8.auto.Auto;

public class Autofabrik {
    public int prodZaehler=0;
    Auto[] autos = new Auto[prodZaehler];

    public void produziere(String marke, String modell, String farbe, int hubraum, int ps, String getriebe) {
        autos[prodZaehler] = new Auto(marke, modell, farbe, hubraum, ps, getriebe);
        prodZaehler++;
        System.out.println("Produktionszähler: "+prodZaehler);
    }
}
