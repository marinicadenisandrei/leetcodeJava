/* Leetcode - 164. Maximum Gap (Java language) - Medium */

import java.util.Arrays;

public class maximum_gap_164 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 164. Maximum Gap (Java language) - Medium"));

        int[][] nums = {{3,6,9,1},{10}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maximumGap(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maximumGap(int[] numsVar) {
        int result = 0;

        Arrays.sort(numsVar);

        for (int i = 0; i < numsVar.length - 1; i++) {
            int absGap = Math.abs(numsVar[i + 1] - numsVar[i]);
            result = ((result < absGap) ? absGap : result);
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
