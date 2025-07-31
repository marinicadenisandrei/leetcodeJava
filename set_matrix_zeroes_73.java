/* Leetcode - 73. Set Matrix Zeroes (Java language) - Medium */

import java.util.Arrays;

public class set_matrix_zeroes_73 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 73. Set Matrix Zeroes (Java language) - Medium"));
        
        int[][][] matrix = {{{1,1,1},{1,0,1},{1,1,1}},{{0,1,2,0},{3,4,5,2},{1,3,1,5}}};
        
        for (int test = 0; test < matrix.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(setZeroes(matrix[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[][] setZeroes(int[][] matrixVar) {
        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                if (matrixVar[i][j] == 0) {

                    for (int j2 = 0; j2 < matrixVar.length; j2++) {
                        if (matrixVar[i][j2] != 0) {
                            matrixVar[i][j2] = -1;
                        }
                    }

                    for (int j2 = 0; j2 < matrixVar.length; j2++) {
                        if (matrixVar[j2][j] != 0) {
                            matrixVar[j2][j] = -1;
                        }
                    }

                }
            }
        }

        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                if (matrixVar[i][j] == -1 || matrixVar[i][j] == 0) {
                    matrixVar[i][j] = 0;
                }
            }
        }

        return matrixVar;
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
