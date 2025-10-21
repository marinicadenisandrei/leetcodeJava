/* Leetcode - 283. Move Zeroes (Java language) - Easy */

import java.util.Arrays;

public class move_zeroes_283 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 283. Move Zeroes (Java language) - ") + green("Easy"));

        int[][] nums = {{0,1,0,3,12},{0}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(moveZeroes(nums[test])) +
                " | " +
                green("Passed")
            );
        }
    }
    public static int[] moveZeroes(int[] numsVar) {
        int[] result = new int[numsVar.length];
        int resultSize = 0;

        for (int i = 0; i < numsVar.length; i++) {
            if (numsVar[i] != 0) {
                result[resultSize++] = numsVar[i];
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
