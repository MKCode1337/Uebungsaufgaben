package lektion10;

public class weltuhr {
    public static void main(String[] args) {
        Uhr weltzeit[] = new Uhr[24];
        for (int i=0; i<24; i++) {
            weltzeit[i] = new Uhr(i, 23, 07);
            weltzeit[i].printTime();
            System.out.println();
        }
        for (int i=0; i<24; i++) {
            weltzeit[i].naechsteSek();
            weltzeit[i].printTime();
            System.out.println();
        }
    }
}
