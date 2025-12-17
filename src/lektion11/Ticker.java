package lektion11;

public class Ticker {
    private char[] nachricht;

    public Ticker(int groessePuffer) {
        if (groessePuffer <= 0) groessePuffer = 200;
        this.nachricht = new char[groessePuffer];
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = ' ';
        }
    }
    public int getGroesse() {
        return this.nachricht.length;
    }
    public void setNachricht(char[] nachricht) {
        for (int i = 0; i < nachricht.length; i++) {
            this.nachricht[i] = nachricht[i];
            }
        for (int i = nachricht.length; i < this.nachricht.length; i++) {
            this.nachricht[i] = '+';
        }
        }

    public char[] getNachricht() {
        return this.nachricht;
    }
    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = zeichen;
        }
    }
    public void resetNachricht() {
        resetNachricht('+');
    }
    public void rotateNachricht(int distance){
        if (distance < 0 || distance >= this.nachricht.length) return;
        char[] zwischenSpeicher = new char[distance];
        char[] alteNachricht = this.getNachricht();
        char[] neueNachricht = new char[this.nachricht.length];
        for (int i = 0; i < distance; i++) {
            zwischenSpeicher[i] = alteNachricht[i];
        }
        for (int i = 0; i < alteNachricht.length-distance; i++) {
            neueNachricht[i] = alteNachricht[i+distance];
        }
        for (int i = 0; i < distance; i++) {
            neueNachricht[i+ neueNachricht.length-distance] = zwischenSpeicher[i];
        }
        this.setNachricht(neueNachricht);
    }
}
