/* Leetcode - 221. Maximal Square (Java language) - Medium */

import java.util.Arrays;
import java.util.Collections;
import java.util.List; 

public class maximal_square_221 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 221. Maximal Square (Java language) - Medium"));

        String[][][] matrix = {{{"1","0","1","0","0"},{"1","0","1","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}}, {{"0","1"},{"1","0"}}};
        
        for (int test = 0; test < matrix.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maximalSquare(matrix[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maximalSquare(String[][] matrixVar) {
        int result = 0;

        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                if (matrixVar[i][j].compareTo("1") == 0) {
                    int row_end = 0;
                    int col_end = 0;
                    

                    for (int k = i; k < matrixVar.length; k++) {
                        if (matrixVar[k][j].compareTo("0") == 0) {
                            row_end = k;
                            break;
                        }

                        if (k == matrixVar.length - 1) {
                            row_end = k + 1;
                            break;
                        }
                    }

                    for (int k = j; k < matrixVar[i].length; k++) {
                        if (matrixVar[i][k].compareTo("0") == 0) {
                            col_end = k;
                            break;
                        }

                        if (k == matrixVar[i].length - 1) {
                            col_end = k + 1;
                            break;
                        }
                    }

                    List<Integer> temp = Arrays.asList(row_end - i, col_end - j);
                    Integer minValue = Collections.min(temp);

                    result = ((result < minValue * minValue) ? minValue * minValue : result);
                }
            }
        }

        return result;
    }

    public static boolean allOnes(String[][] arr, int row_start, int row_end, int col_start, int col_end) {
        for (int i = row_start; i < row_end; i++) {
            for (int j = col_start; j < col_end; j++) {
                if (arr[i][j].compareTo("1") != 0) {
                    return false;
                }
            }
        }

        return true;
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