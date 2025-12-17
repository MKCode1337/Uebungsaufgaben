package lektion11;

public class dreidtictactoe {
    public static void main(String[] args) {
        boolean[][][] spielfeld = new boolean[3][3][3];
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[0].length; j++) {
                for (int k = 0; k < spielfeld[0][0].length; k++) {
                    spielfeld[i][j][k] = zufallsWert();
                }
            }
        }
        for (int i = 0; i < spielfeld.length; i++) {
            System.out.println(i+1+". Ebene: ");
            for (int j = 0; j < spielfeld[0].length; j++) {
                for (int k = 0; k < spielfeld[0][0].length; k++) {
                    if (spielfeld[i][j][k]==false) System.out.print("o");
                    else System.out.print("x");
                }
                System.out.println();
            }
        }
    }

    public static boolean zufallsWert(){
        int zufallsWert = (int) Math.round(Math.random());
        if  (zufallsWert == 0) return false;
        else return true;
    }
}
