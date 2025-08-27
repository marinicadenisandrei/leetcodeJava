/* Leetcode - 230. Kth Smallest Element in a BST (Java language) - Medium */

import java.util.Arrays;

public class kth_smallest_element_in_a_bst_230 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 230. Kth Smallest Element in a BST (Java language) - Medium"));

        int[][] root = {{3,1,4,0,2},{5,3,6,2,4,0,0,1}};
        int[] k = {1,3};

        for (int test = 0; test < k.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                kthSmallest(root[test], k[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int kthSmallest(int[] rootVar, int kVar) {
        Arrays.sort(rootVar);
        int[] noNull = Arrays.stream(rootVar).filter(num -> num != 0).toArray();

        return noNull[kVar - 1];
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
