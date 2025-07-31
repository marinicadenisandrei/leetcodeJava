/* Leetcode - 215. Kth Largest Element in an Array (Java language) - Medium */

import java.util.Arrays;

public class kth_largest_element_in_an_array_215 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 215. Kth Largest Element in an Array (Java language) - Medium"));
        
        int[][] nums = {{3,2,1,5,6,4},{3,2,3,1,2,4,5,5,6}};
        int[] k = {2,4};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + " : "));
            System.out.print(findKthLargest(nums[test], k[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int findKthLargest(int[] numsVar, int kVar) {
        Arrays.sort(numsVar);

        return numsVar[numsVar.length - kVar];
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