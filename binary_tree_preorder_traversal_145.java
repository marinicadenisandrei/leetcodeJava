/* Leetcode - 145. Binary Tree Postorder Traversal (Java language) - Easy */

import java.util.ArrayList;
import java.util.List;

public class binary_tree_preorder_traversal_145 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 145. Binary Tree Postorder Traversal (Java language) - ") + green("Easy"));

        int root[][] = {{1,0,2,3},{1,2,3,4,5,0,8,0,0,6,7,9},{}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(postorderTraversal(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static List<Integer> postorderTraversal(int[] rootVar) {
        List<Integer> newRoot = new ArrayList<>();

        for (int i = rootVar.length - 1; i >= 0; i--) {
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