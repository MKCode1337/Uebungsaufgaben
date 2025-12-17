package lektion11;

public class betragsmethode {
    public static void main(String[] args) {
        long zahl = -16;
        System.out.println("Betrag: " + betrag(zahl));
    }

    public static int betrag(int zahl){
        double zahlDouble = betrag((double) zahl);
        return (int) zahlDouble;
    }
    public static short betrag(short zahl){
        double zahlDouble = betrag((double) zahl);
        return (short) zahlDouble;
    }
    public static long betrag(long zahl){
        double zahlDouble = betrag((double) zahl);
        return (long) zahlDouble;
    }
    public static float betrag(float zahl){
        double zahlDouble = betrag((double) zahl);
        return (float) zahlDouble;
    }
    public static double betrag(double zahl){
        if (zahl<0) return zahl*-1;
        else return zahl;
    }
}
