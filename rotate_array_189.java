/* Leetcode - 189. Rotate Array (Java language) - Medium */

import java.util.Arrays;

public class rotate_array_189 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 189. Rotate Array (Java language) - Medium"));

        int[][] nums = {{1,2,3,4,5,6,7},{-1,-100,3,99}}; 
        int[] k = {3,2};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(rotate(nums[test], k[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] rotate(int[] numsVar, int kVar) {
        int[] newArray = new int[numsVar.length];
        int newArraySize = 0;

        for (int i = numsVar.length - kVar; i < newArray.length; i++) {
            newArray[newArraySize++] = numsVar[i];
        }

        for (int i = 0; i < numsVar.length - kVar; i++) {
            newArray[newArraySize++] = numsVar[i];
        }

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
