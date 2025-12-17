package lektion11;

public class Dokument {
        private char[][] text;

        public Dokument(char[][] text) {
            this.text= text;
        }

        public void printDoc(){
            for (int i = 0; i < this.text.length; i++) {
                System.out.print(this.text[i]);
                System.out.println();
            }
        }
        public void fuegeEinTextdokument(char[][] einfuegText, int position){
            if (position > this.text.length-1 ){
                throw new RuntimeException("Gewünschte Zeilenposition außerhalb des Dokuments.");
            }
            else {
                //Text an Position einfuegen
            }
        }

    public boolean vertauscheZeilen(int index1, int index2){
        index1 = index1 -1;
        index2 = index2 -1;
        if(index1 > this.text.length || index2 > this.text.length) return false;
        else {
            char[] zwischenspeicher = this.text[index1];
            this.text[index1] = this.text[index2];
            this.text[index2] = zwischenspeicher;
            return true;
        }
    }
    public int zaehleZeichen() {
        int counter = 0;
        for (int i = 0; i < this.text.length; i++) {
            for (int j = 0; j < this.text[i].length; j++) {
                if (this.text[i][j] != ' ') counter++;
            }
        }
        return counter;
    }
}
