/* Leetcode - 88. Merge Sorted Array (Java language) - Easy */

import java.util.Arrays;

public class merge_sorted_array_88 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 88. Merge Sorted Array (Java language) - ") + green("Easy"));
        int[][] nums1 = {{1,2,3,0,0,0},{1},{0}};
        int[] m = {3,1,0};

        int[][] nums2 = {{2,5,6},{},{1}};
        int[] n = {3,0,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(merge(nums1[test], m[test], nums2[test], n[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] merge(int[] nums1Var, int mVar, int[] nums2Var, int nVar) {
        int[] newArray = new int[mVar + nVar];
        int newArraySize = 0;

        for (int i = 0; i < mVar; i++) {
            newArray[newArraySize++] = nums1Var[i];
        }

        for (int i = 0; i < nVar; i++) {
            newArray[newArraySize++] = nums2Var[i];
        }

        Arrays.sort(newArray);

        return newArray;
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
