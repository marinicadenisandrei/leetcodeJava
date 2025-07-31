/* Leetcode - 41. First Missing Positive (Java language) - Hard */

import java.util.Arrays;

public class first_missing_positive_41 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 41. First Missing Positive (Java language) - ") + red("Hard"));
        int[][] nums = {{1,2,0},{3,4,-1,1},{7,8,9,11,12}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(firstMissingPositive(nums[test]) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int firstMissingPositive(int[] numsVar) {
        Arrays.sort(numsVar);

        if (numsVar[0] > 1) {
            return 1;
        }

        for (int i = 0; i < numsVar.length - 1; i++) {
            if (numsVar[i] < 1 || numsVar[i + 1] < 1) {
                continue;
            }

            if (numsVar[i + 1] - numsVar[i] > 1) {
                return numsVar[i] + 1;
            }
        }

        return numsVar[numsVar.length - 1] + 1;
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
