/* Leetcode - 144. Binary Tree Preorder Traversal (Java language) - Easy*/

import java.util.ArrayList;

public class binary_tree_preorder_traversal_144 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 144. Binary Tree Preorder Traversal (Java language) - ") + green("Easy"));

        int[][] root = {{1,0,2,3},{1,2,3,4,5,0,8,0,0,6,7,9},{},{1}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(PreorderTraversal(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> PreorderTraversal(int[] rootVar) {
        ArrayList<Integer> newRoot = new ArrayList<>();

        for (int i = 0; i < rootVar.length; i++) {
            if (rootVar[i] != 0) {
                newRoot.add(rootVar[i]);
            }
        }

        return newRoot;
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
