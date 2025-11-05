package lektion5;

import java.util.Scanner;

public class quadratwurzel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl für x ein: ");
        int x = input.nextInt();
        double y = 1;
        double yErgebnis = y;
        int i=1;
        do {
            y = ((((double) x / y) + y) / 2);
            if (i == 10 || i == 100 || i == 1000 || i == 10000) {
                System.out.println("Ergebnis nach " +i+ " Durchläufen: " + y + "\nErgebnis von Math.sqrt = " + Math.sqrt(x));
            }
            i++;
        }
        while (i <= 10000);
        input.close();
    }
}
