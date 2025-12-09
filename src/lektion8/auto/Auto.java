package lektion8.auto;

public class Auto {
    private String marke;
    private String modell;
    private String farbe;
    public int hubraum;
    private int ps;
    private String getriebe;

    public String toString() {
        return "marke: "+marke+"\n"+"modell: "+modell+"\n"+"farbe: "+farbe+"\n"+"hubraum in l: "+hubraum+"\n"+"PS: "+ps+"\n"+"getriebe: "+getriebe;
    }

    public Auto(String marke, String modell, String farbe, int hubraum, int ps, String getriebe) {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        if (hubraum > 0) this.hubraum = hubraum;
        else this.hubraum = 1600;
        this.ps = ps;
        this.getriebe = getriebe;
    }

    public void sethubraum(int hubraum) {
        if (hubraum > 0) this.hubraum = hubraum;
    }
}