package lektion2;

public class pqFormel {
    public static void main(String args[]) {

        double p = 6;
        double q = 5;

        double x1 = -p/2.0 + (Math.sqrt( Math.pow((p/2.0),2)-q));   // Wenn Ergebnis negativ wird ist x=NaN
        double x2 = -p/2.0 - (Math.sqrt( Math.pow((p/2.0),2)-q));

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}