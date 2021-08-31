package JavaPatternPrograms;

public class SpiralPattern {
    static int dem = 0;
    static int m = 5;
    static int n = 10;
    

    static void topRight(int[][] matrix, int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            matrix[y1][i] = dem++;
        }
        for (int i = y1 + 1; i <= y2; i++) {
            matrix[i][x2] = dem++;
        }
        if (x2 - x1 > 0 && y2 - y1 > 0) {
            y1++;
            x2--;
            bottomLeft(matrix, x1, y1, x2, y2);
        }
    }

    static void bottomLeft(int matrix[][], int x1, int y1, int x2, int y2) {
        for (int i = x2; i >= x1; i--) {
            matrix[y2][i] = dem++;
        }
        for (int i = y2 - 1; i >= y1; i--) {
            matrix[i][x1] = dem++;
        }
        if (x2 - x1 > 0 && y2 - y1 > 0) {
            y2--;
            x1++;
            topRight(matrix, x1, y1, x2, y2);
        }

    }

    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[m][n];
        topRight(matrix, 0, 0, n - 1, m - 1);
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.printf("%5d", j);
            }
            System.out.println("");
        }
    }
}
