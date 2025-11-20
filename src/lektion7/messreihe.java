package lektion7;

import java.util.Scanner;



public class messreihe {
    public static double standardabweichung(double[] werte, double mittelWert){
        double standardAbweichung = 0;
        for (int i=0;i<werte.length;i++){
            standardAbweichung += Math.pow((werte[i]-mittelWert),2);
        }
        int n = werte.length;
        standardAbweichung = Math.sqrt((1.0/n)*standardAbweichung);
        return standardAbweichung;
    }
    public static double minimum(double a, double b) {
        if (a < b)
            return a;
        else
            return b;
        }

    public static double maximum(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
        }

    public static double arithmetischesMittel(double[] werte) {
        double mittelWert = 0;
        for (int i = 0; i < werte.length; i++) {
            mittelWert += werte[i];
        }
        return mittelWert/werte.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anzahl = 0;
        do {
            System.out.println("Geben Sie die Anzahl der einzulesenden Werte ein: ");
            anzahl = input.nextInt();
            if (anzahl < 1) {
                System.out.println("Wert muss größer 0 sein!"+"\n");
            }
        } while (anzahl<1);

        double werte[] = new double[anzahl];
        for (int i = 0; i < anzahl; i++) {
            System.out.print(i+1+". Wert eingeben: ");
            werte[i] = input.nextDouble();
        }
        System.out.println("\n");
        for (int i = 0; i < anzahl; i++) {
            System.out.print(i+1+". Wert: "+werte[i]+"\n");
        }
        double minimum = werte[0];
        for (int i = 1; i < werte.length; i++) {
            minimum = minimum(minimum,werte[i]);
        }
        System.out.println("Kleinster Wert: "+minimum);

        double maximum = werte[0];
        for (int i = 1; i < werte.length; i++) {
            maximum = maximum(maximum,werte[i]);
        }
        System.out.println("Größter Wert: "+maximum);
        System.out.println("Arithemtisches Mittel: "+arithmetischesMittel(werte));
        System.out.println("Standardabweichung: "+standardabweichung(werte,arithmetischesMittel(werte)));
    }
}
