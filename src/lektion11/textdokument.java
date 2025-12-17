package lektion11;


public class textdokument {
    public static void main(String[] args) {
//        char[][] text= {{'H','e','l','l','o', ' ', 'W','o','r','l','d'},{'Z','e','i','l','e',' ','2'}};
        String zeile1 = "Hello World";
        String zeile2 = "Zeile 2";
        Dokument text = new Dokument(new char[][]{zeile1.toCharArray(), zeile2.toCharArray()});
        System.out.println(text.zaehleZeichen());
        text.printDoc();
        text.vertauscheZeilen(1, 2);
        text.printDoc();
    }
}