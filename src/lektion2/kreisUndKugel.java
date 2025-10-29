package lektion2;

public class kreisUndKugel {

    public static void main(String[] args) {

        final float PI = 3.1414f;           // PI einfach mal als Konstante gespeichert, alternativ Math.PI
        double radius = 5;
        double kreisFlaeche = PI * radius * radius;
        double kreisUmfang = 2 * PI * radius;

        System.out.println("Der Umfang des Kreises mit Radius " + radius + " beträgt: " + kreisUmfang);
        System.out.println("Die Flaeche des Kreises mit Radius " + radius + " beträgt: " + kreisFlaeche);

        double kugelVolumen = 4.0/3.0 * PI * radius * radius * radius;
        System.out.println("Das Volumen einer Kugel mit Radius " + radius + " wäre: " + kugelVolumen);
    }
}