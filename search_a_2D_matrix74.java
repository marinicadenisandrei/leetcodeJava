/* Leetcode - 74. Search a 2D Matrix (JavaScript language) - Medium */

public class search_a_2D_matrix74 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 74. Search a 2D Matrix (JavaScript language) - Medium"));

        int[][][] matrix = {{{1,3,5,7},{10,11,16,20},{23,30,34,60}},{{1,3,5,7},{10,11,16,20},{23,30,34,60}}};
        int[] target = {3,13};

        for (int test = 0; test < matrix.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(searchMatrix(matrix[test], target[test]) + " | ");  
            System.out.println(green("Passed")); 
        }
    }

    public static boolean searchMatrix(int[][] matrixVar, int targetVar) {
        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar.length; j++) {
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
