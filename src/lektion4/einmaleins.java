package lektion4;

public class einmaleins {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            for (int i = 1; i <= 10; i++) {
                int ergebnis = n * i;
                System.out.println(n + " x " + i + " = " + ergebnis);
            }
            System.out.printf("%n");        // %-zeigt Ausdruck an n-new line
        }
    }
}
