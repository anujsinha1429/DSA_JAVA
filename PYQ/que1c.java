package PYQ;

public class que1c {
    public static double[][] add(double a[][], double b[][]) {
        
        int rows = a.length;
        int cols = a[0].length;

        double arr[][] = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = a[i][j] + b[i][j];
            }
        }

        return arr;
    }
}
