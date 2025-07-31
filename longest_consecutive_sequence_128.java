/* Leetcode - 28. Longest Consecutive Sequence (Java language) - Medium */

import java.util.Arrays;

public class longest_consecutive_sequence_128 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 28. Longest Consecutive Sequence (Java language) - Medium"));

        int[][] nums = {{100,4,200,1,3,2},{0,3,7,2,5,8,4,6,0,1},{1,0,1,2}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(LongestConsecutive(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int LongestConsecutive(int[] numsVar) {
        Arrays.sort(numsVar);
        
        int result = 0;
        int temp = 0;

        for (int i = 0; i < numsVar.length - 1; i++) {
            if (numsVar[i + 1] - numsVar[i] == 1) {
                temp++;
            }   
            else if (numsVar[i + 1] == numsVar[i])
            {
                continue;
            }
            else
            {
                result = ((result < temp) ? temp + 1 : result);
            }
        }

        return (result == 0 ? temp + 1 : result);
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

