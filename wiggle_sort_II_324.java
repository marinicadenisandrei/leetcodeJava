/* Leetcode - 324. Wiggle Sort II (Java language) - Medium */

import java.util.Arrays;

public class wiggle_sort_II_324 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 324. Wiggle Sort II (Java language) - Medium"));

        int[][] nums = {{1,5,1,1,6,4},{1,3,2,2,3,1}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(wiggleSort(nums[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            if (i % 2 == 1 && nums[i] < nums[i - 1]) {
                swap(nums, i, i - 1);
            }

            if (i % 2 == 0 && nums[i] > nums[i - 1]) {
                swap(nums, i, i - 1);
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
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
