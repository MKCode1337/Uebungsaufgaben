package lektion10;

public class Uhr {
    private int stunden;
    private int minuten;
    private int sekunden;

    public Uhr(int std, int min, int sek) {
        if (checkInput(std, min, sek)) {
            this.stunden = std;
            this.minuten = min;
            this.sekunden = sek;
        }
        else {
            this.stunden = 12;
            this.minuten = 0;
            this.sekunden = 0;
        }
    }

    public void printTime() {
        System.out.print(stunden + ":" + minuten + ":" +sekunden+" Uhr");
    }

    public void naechsteSek() {
        if (this.sekunden == 60) {
            this.sekunden =  0;
            if (this.minuten == 60) {
                this.minuten = 0;
                if (this.stunden == 24) {
                    this.stunden = 0;
                }
                else this.stunden++;
            }
            else this.minuten++;
        }
        else this.sekunden++;
    }

    public void setUhr(int std, int min, int sek) {
        if (checkInput(std, min, sek)) {
            this.stunden = stunden;
            this.minuten = minuten;
            this.sekunden = sekunden;
        }
        else {
            System.out.println("Ungültige Eingaben!");
        }
    }
    public int getStd() {

        return stunden;
    }
    public int getMin() {
        return minuten;
    }
    public int getSek() {
        return sekunden;
    }

    public static boolean checkInput(int std, int min, int sek) {
                if (std <= 24 && std >= 0 && min <= 60 && min >= 0 && sek <= 60 && sek >= 0 ) {
                    return true;
                }
                else return false;
    }
}
