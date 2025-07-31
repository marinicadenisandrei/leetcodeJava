/* Leetcode - 24. Swap Nodes in Pairs (Java language) - Medium */

import java.util.Arrays;

public class swap_nodes_in_pairs_24 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 24. Swap Nodes in Pairs (Java language) - Medium"));
        
        int[][] head = {{1,2,3,4},{},{1},{1,2,3}};

        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            
            swapPairs(head[test]);
            System.out.print(Arrays.toString(head[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static void swapPairs(int[] headVar) {
        if (headVar.length == 1) {
            return;
        }

        for (int i = 0; i < headVar.length - 1; i += 2) {
            int temp = headVar[i];
            headVar[i] = headVar[i + 1];
            headVar[i + 1] = temp;
        }
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