package lektion4;

public class countdown {
    public static void main(String[] args) throws InterruptedException {
        int sekunden = 15;

        for (int i = sekunden; i >= 0 ; i--) {
            System.out.println(i + " Sekunden übrig.");
            Thread.sleep(1000);
        }
    }
}
