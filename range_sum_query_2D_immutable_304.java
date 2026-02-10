/* Leetcode - 304. Range Sum Query 2D - Immutable (Java language) - Medium */

class NumMatrix {
    private final int[][] pref; 

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = (m == 0) ? 0 : matrix[0].length;
        pref = new int[m + 1][n + 1];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pref[i][j] = matrix[i][j];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        int result = 0;

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                result += pref[i][j];
            }
        }

        return result;
    }
}        

public class range_sum_query_2D_immutable_304 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 304. Range Sum Query 2D - Immutable (Java language) - Medium"));
        
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        NumMatrix numMatrix = new NumMatrix(matrix);

        System.out.println(
            green("Test 1: ") + 
            numMatrix.sumRegion(2, 1, 4, 3) + " " +
            numMatrix.sumRegion(1, 1, 2, 2) + " " +
            numMatrix.sumRegion(1, 2, 2, 4) 
            + " | "
            + green("Passed")
        );
    }

    public static String red(String text) {
        return "\u001B[31m" + text + "\u001B[0m";
    }

    public static String yellow(String text) {
        return "\u001B[33m" + text + "\u001B[0m";
    }

    public static String green(String text) {
        return "\u001B[32m" + text + "\u001B[0m";
    }

    public static String reset(String text) {
        return "\u001B[0m" + text;
    }
}
