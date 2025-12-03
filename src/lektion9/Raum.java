package lektion9;

public class Raum {
    String kennung;
    int kapazitaet;
    boolean belegt;

    public Raum(String kennung, int kapazitaet) {
            this.kennung = kennung;
            this.kapazitaet = kapazitaet;
            this.belegt = false;
    }
    public String getKennung() {
        return kennung;
    }
    public int getKapazitaet() {
        return kapazitaet;
    }
    public void setBelegung(boolean belegt) {
        this.belegt = belegt;
    }
    public boolean isBelegt() {
        return this.belegt;
    }
}