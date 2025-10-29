package lektion3;

public class schaltjahr {
    public static void main(String[] args) {
        int jahr = 2004;

        if ((jahr % 4) == 0) {
            System.out.println("Durch 4 teilbar.");
            if ((jahr % 100) == 0) {
                System.out.println("Durch 100 teilbar also ist "+jahr+" kein Schaltjahr!");
            }
        }
        else {
            System.out.println("Nicht durch 4 teilbar.");
        }
    }
}