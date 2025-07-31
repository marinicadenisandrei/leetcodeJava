/* Leetcode - 54. Spiral Matrix (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix54 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 54. Spiral Matrix (Java language) - Medium"));
        
        int[][][] matrix = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
        };
        
        for (int test = 0; test < matrix.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(spiralOrder(matrix[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] spiralOrder(int[][] matrixVar) {
        if (matrixVar == null || matrixVar.length == 0) {
            return new int[0];
        }

        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        int[] result = new int[matrixVar[0].length * matrixVar.length];
        int resultSize = 0;

        for (int i = 0; i < matrixVar.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixVar[i].length; j++) {
                row.add(matrixVar[i][j]);
            }
            twoDList.add(row);
        }

        while (!twoDList.isEmpty()) {
            for (int i = 0; i < twoDList.get(0).size(); i++) {
                result[resultSize++] = twoDList.get(0).get(i);
            }
            twoDList.remove(0);

            if (twoDList.isEmpty()) break; 

            for (int i = 0; i < twoDList.size(); i++) {
                result[resultSize++] = twoDList.get(i).get(twoDList.get(i).size() - 1);
                twoDList.get(i).remove(twoDList.get(i).size() - 1);
            }

            if (twoDList.isEmpty()) break; 

            for (int i = twoDList.get(twoDList.size() - 1).size() - 1; i >= 0; i--) {
                result[resultSize++] = twoDList.get(twoDList.size() - 1).get(i);
            }
            twoDList.remove(twoDList.size() - 1);

            if (twoDList.isEmpty()) break; 

            for (int i = twoDList.size() - 1; i >= 0; i--) {
                result[resultSize++] = twoDList.get(i).get(0);
                twoDList.get(i).remove(0);
            }
        }

        return result;
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
