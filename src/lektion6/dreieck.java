package lektion6;

public class dreieck {
    public static void dreieck(int zeilen){
        int anzahlSterne=1;
        int anzahlLeerzeichen=zeilen;
        for(int i=1;i<=zeilen;i++){
            for(int k=1;k<=anzahlLeerzeichen;k++){
                System.out.print(" ");  //So viele Leerzeichen wie Zeilen ausgeben
            }
            for(int j=1;j<=anzahlSterne;j++){
                System.out.print("* ");
            }
            anzahlSterne++;         //Pro Anzahl Zeilen ein Stern mehr
            anzahlLeerzeichen--;    //Ein Leerzeichen abziehen
            System.out.println(""); //Leere Zeile ausgeben
        }
    }

    public static void main(String[] args) {
        dreieck(5);
    }
}
