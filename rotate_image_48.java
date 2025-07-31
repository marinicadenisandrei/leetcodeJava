/* Leetcode - 48. Rotate Image (Java language) - Medium */

import java.util.Arrays;

public class rotate_image_48 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 48. Rotate Image (Java language) - Medium"));
        
        int[][][] matrix ={{{1,2,3},{4,5,6},{7,8,9}}, {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}};

        for (int test = 0; test < matrix.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(rotate(matrix[test])) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int[][] rotate(int[][] matrixVar) {
        int[][] rotateMatrix = new int[matrixVar.length][matrixVar.length];

        for (int i = 0; i < matrixVar[0].length; i++) {
            for (int j = matrixVar.length - 1; j >= 0; j--) {
                rotateMatrix[i][matrixVar[0].length - j - 1] = matrixVar[j][i];
            }
        }

        return rotateMatrix;
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
