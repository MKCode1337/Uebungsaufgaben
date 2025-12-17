package lektion11;

public class zeilenmaxima {

    public static double[] zeilenMaxima(double[][] matrix) {
        double[] ergebnisMatrix = new double[matrix.length];
        double lokalesMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                lokalesMax = Math.max(matrix[i][j], matrix[i][j + 1]);
            }
            ergebnisMatrix[i] = lokalesMax;
        }
        return ergebnisMatrix;
    }

    public static void main (String[] args) {
        double matrix[][] = {{1.0,2,3},{4.0,5.9},{7.5,8,9.2}};
        double[] maxWerte = zeilenMaxima(matrix);
        for (int i = 0; i < maxWerte.length; i++) {
            System.out.println(maxWerte[i]);
        }
    }
}
