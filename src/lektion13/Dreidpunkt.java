package lektion13;

public class Dreidpunkt {
    private double a;
    private double b;
    private double c;

    public Dreidpunkt(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double berechneAbstand() {
        return Math.sqrt(a * a + b * b + c * c);
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }

    public static void main(String[] args) {
        Dreidpunkt p = new Dreidpunkt(2, 5, 7);
        System.out.println(p);
        System.out.println("Abstand zum Ursprung: " + p.berechneAbstand());
    }
}
