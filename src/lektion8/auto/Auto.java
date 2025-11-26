package lektion8.auto;

public class Auto {
    String Marke;
    String Modell;
    String Farbe;
    int Hubraum;
    int ps;
    String Getriebe;

    public String toString() {
        return "Marke: "+Marke+"\n"+"Modell: "+Modell+"\n"+"Farbe: "+Farbe+"\n"+"Hubraum in l: "+Hubraum+"\n"+"PS: "+ps+"\n"+"Getriebe: "+Getriebe;
    }
}
