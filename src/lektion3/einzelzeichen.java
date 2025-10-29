package lektion3;
import java.util.Scanner;
public class einzelzeichen {
    public static void main(String[] args) {

        System.out.println("Geben Sie ein Zeichen ein:");
        Scanner scanner = new Scanner(System.in);

        String einzelZ = scanner.nextLine();
        //System.out.println("Stringinhalt: " + einzelZ);
        char charVoneinzelZ = einzelZ.charAt(0);
        int einzelAlsASCII = (int) charVoneinzelZ;
        boolean zeichenErkannt = false;
        //System.out.println("ASCII-Wert: " + einzelAlsASCII);

        //Großbuchstabe
        if (einzelAlsASCII >= 65 && einzelAlsASCII <= 90) {
            System.out.println("Großbuchstabe");
            zeichenErkannt = true;
        }
        //Hex-Zahl
        if ((einzelAlsASCII >= 48 && einzelAlsASCII <= 57) || (einzelAlsASCII >= 65 && einzelAlsASCII <= 70) || (einzelAlsASCII >= 97 && einzelAlsASCII <= 102)) {
            System.out.println("Hexadezimale Ziffer");
            zeichenErkannt = true;
        }

        //Binär-Zahl
        if (einzelAlsASCII == 48 || einzelAlsASCII == 49 ) {
            System.out.println("Binäre Ziffer");
            zeichenErkannt = true;
        }

        //Oktal-Zahl
        if (einzelAlsASCII >= 48 && einzelAlsASCII <= 55) {
            System.out.println("Oktale Ziffer");
            zeichenErkannt = true;
        }

        //Wenn nichts zutrifft
        if (zeichenErkannt == false) {
            System.out.println("Unbekanntes Zeichen");
        }
        scanner.close();
    }
}
