/* Leetcode - 226. Invert Binary Tree (Java language) - Easy */

import java.util.Arrays;

public class invert_binary_tree_226 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 226. Invert Binary Tree (Java language) - ") + green("Easy"));
        int[][] root = {{4,2,7,1,3,6,9},{2,1,3},{}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(invertTree(root[test])) + 
                " | " + 
                green("Passed")
            );
        }
    }

    public static int[] invertTree(int[] rootVar) {
        if (rootVar.length == 0) {
            return rootVar;
        }

        int[] reversed = new int[rootVar.length];
        int reversedSize = 1;

        int startIndex = 1;
        reversed[0] = rootVar[0];

        while ((startIndex * 2) < rootVar.length) {
            for (int i = startIndex * 2; i >= startIndex ; i--) {
                reversed[reversedSize++] = rootVar[i];
            }

            startIndex = (startIndex * 2) + 1;
        }

        return reversed;
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
