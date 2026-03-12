package lektion13;

public class Schachbrett {
    boolean[][] brett = new boolean[8][8];

    public void setzeTurm(int x, int y) {
        // Alle Felder in der gleichen Zeile markieren
        for (int i = 0; i < 8; i++) {
            brett[y][i] = true;
        }
        // Alle Felder in der gleichen Spalte markieren
        for (int i = 0; i < 8; i++) {
            brett[i][x] = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                sb.append(brett[row][col] ? "x" : "o");
                if (col < 7) sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Schachbrett s = new Schachbrett();
        s.setzeTurm(5, 6);
        System.out.println(s);
    }
}
