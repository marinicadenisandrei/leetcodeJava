/* Leetcode - 240. Search a 2D Matrix II (Java language) - Medium */

public class search_in_2D_matrix_II_240 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 240. Search a 2D Matrix II (Java language) - Medium"));

        int[][][] matrix = {{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},
                        {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}};
        int[] target = {5,20};

        for (int test = 0; test < matrix.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                searchMatrix(matrix[test], target[test]) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean searchMatrix(int[][] matrixVar, int targetVar) {
        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                if (matrixVar[i][j] == targetVar) {
                    return true;
                }
            }
        }

        return false;
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
