package lektion2;

import java.time.LocalTime;

public class zeitBerechnen {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();       // erzeugt Variable "Time", die mit Methoden abrufbar ist

        int stunden = time.getHour();           // Abruf von getHour() von time
        int minuten = time.getMinute();
        int sekunden = time.getSecond();

        int sekundenAmTag = 86400;
        int verbleibendeSekunden = sekundenAmTag - ( (stunden*60*60) + (minuten*60) + sekunden );

        System.out.println("Der Tag hat noch " + verbleibendeSekunden +" Sekunden übrig.");

        float prozentVomTag = 100 - ( (float)verbleibendeSekunden / (float)sekundenAmTag) * 100;

        System.out.printf("Es sind bereits %.2f%% des Tages vergangen.", prozentVomTag);    /* mit printf Ausgabe auf 2 Nachkommestellen
                                                                                               begrenzt im Platzhalter %.2f% */
    }
}