package lektion7;

import java.util.Scanner;

public class bSprache {
    public static boolean istVokal(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        }
        else if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            return true;
        }
        else return false;
    }

    public static String bSpracheUmwandeln(String eingabe){
        char[] eingabeArray = eingabe.toCharArray();
        int vokalZaehler = 0;

        for(int i = 0; i < eingabeArray.length; i++){
            if (istVokal(eingabeArray[i])) {
                vokalZaehler++;
            }
            else continue;
        }

        int laengeAusgabe = eingabeArray.length+(vokalZaehler*2);
        char[] ausgabeArray = new char[laengeAusgabe];

        int n=0;
        for(int i = 0; i < eingabeArray.length; i++){
            if (istVokal(eingabeArray[i])) {
                ausgabeArray[i+n] = eingabeArray[i];
                ausgabeArray[i+1+n] = 98;
                ausgabeArray[i+2+n] = eingabeArray[i];
                n=n+2;
            }
            else ausgabeArray[i+n] = eingabeArray[i];
        }

        String ausgabeString = String.valueOf(ausgabeArray);
        return ausgabeString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String eingabe = "spiel mit mir";
        System.out.println(bSpracheUmwandeln(eingabe));
    }
}
