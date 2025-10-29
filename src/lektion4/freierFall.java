package lektion4;
import java.sql.SQLException;
import java.util.Scanner;

public class freierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Falldauer in Sekunden eingeben: ");
        int sekunden = scanner.nextInt();
        float g = 9.80665f;
        int fuenferZaehler = 5;

        for  (int i = 1; i <= sekunden; i++) {
            float fallStrecke = (float) (0.5*g*Math.pow(i, 2));

            if (fuenferZaehler%5==0) {
                System.out.println("Die Fallstrecke nach " + i + " Sekunden beträgt: " + fallStrecke + "m");
                Thread.sleep(1000);
            }
            fuenferZaehler++;

        }

    }
}
