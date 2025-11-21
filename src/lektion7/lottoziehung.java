package lektion7;

import java.util.Arrays;

public class lottoziehung {
    public static int lottozahl(){
        int zufallsZahl = 1+ (int) (Math.random()*49);
        return zufallsZahl;
    }

    public static int[] lottoZiehung() {
        int[] lottozahlen = new int[6];
        for (int i = 0; i < lottozahlen.length; i++) {
            int zufallsZahl = lottozahl();
            for (int j = 0; j < lottozahlen.length; j++) {
                while (lottozahlen[j] == zufallsZahl) zufallsZahl=lottozahl();
            }
        lottozahlen[i] = zufallsZahl;
        }
        return  lottozahlen;
    }

    public static int[] minsort(int[] eingabe){
        for (int i = 0; i < eingabe.length; i++) {
            int minIndex=i;
            for (int j = i; j < eingabe.length; j++) {
                if (eingabe[j] < eingabe[minIndex]) {
                    minIndex = j;
                }
            }
            int zwischenSpeicher = eingabe[i];
            eingabe[i] = eingabe[minIndex];
            eingabe[minIndex] = zwischenSpeicher;
        }
        return eingabe;
    }

    public static void main(String[] args) {
        int[] lottoZahlen = lottoZiehung();
        System.out.println(Arrays.toString(lottoZahlen));
        System.out.println(Arrays.toString(minsort(lottoZahlen)));
    }
}
