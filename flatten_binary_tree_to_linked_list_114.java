/* Leetcode - 114. Flatten Binary Tree to Linked List (Java language) - Medium */

import java.util.LinkedList;

public class flatten_binary_tree_to_linked_list_114 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 114. Flatten Binary Tree to Linked List (Java language) - Medium"));

        int[][] root = {{1,2,5,3,4,0,6},{},{0}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(flatten(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static LinkedList<Integer> flatten(int[] root) {
        LinkedList<Integer> result = new LinkedList<>();

        if (root.length == 1) {
            result.add(root[0]);
        }

        for (int num : root) {
            if (num != 0) {
                result.add(num);
                result.add(0);
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
