package lektion3;

public class wuerfelWurf {
    public static void main(String[] args) {

        int wuerfelZahl = 1 + (int) (Math.random()*6);

        if (wuerfelZahl == 1) {
            System.out.println("Eins gewürfelt");
        }
        else if (wuerfelZahl == 2) {
            System.out.println("Zwei gewürfelt.");
        }
        else if (wuerfelZahl == 3) {
            System.out.println("Drei gewürfelt.");
        }
        else if (wuerfelZahl == 4) {
            System.out.println("Vier gewürfelt.");
        }
        else if (wuerfelZahl == 5) {
            System.out.println("Fünf gewürfelt.");
        }
        else if (wuerfelZahl == 6) {
            System.out.println("Sechs gewürfelt.");
        }

    }
}
