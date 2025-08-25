/* Leetcode - 228. Summary Ranges (Java language) - Easy */

import java.util.ArrayList;

public class summary_ranges_228 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 228. Summary Ranges (Java language) - ") + green("Easy"));

        int[][] nums = {{0,1,2,4,5,7},{0,2,3,4,6,8,9}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                summaryRanges(nums[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<String> summaryRanges(int[] numsVar) {
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        int start = numsVar[0];

        for (int i = 1; i < numsVar.length; i++) {
            if (numsVar[i] - numsVar[i - 1] > 1) {
                temp = start + "->" + numsVar[i - 1];
                result.add(temp);
                start = numsVar[i];
            }

            if (i == numsVar.length - 1) {
                temp = start + "->" + numsVar[i];
                result.add(temp);
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
