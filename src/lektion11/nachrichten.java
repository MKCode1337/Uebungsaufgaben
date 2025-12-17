package lektion11;

public class nachrichten {
    public static void main(String[] args) {
        Ticker testnachricht = new Ticker(45);
        String text = "Wettervorhersage: Schnee in Wuerzburg";
        char[] textChar = text.toCharArray();
        testnachricht.setNachricht(textChar);
        System.out.print(testnachricht.getNachricht());
        System.out.println();
        testnachricht.rotateNachricht(14);
        System.out.print(testnachricht.getNachricht());
    }
}
