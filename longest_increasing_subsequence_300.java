/* Leetcode - 300. Longest Increasing Subsequence (Java language) - Medium */

public class longest_increasing_subsequence_300 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 300. Longest Increasing Subsequence (Java language) - Medium"));

        int[][] nums = {{10,9,2,5,3,7,101,18},{0,1,0,3,2,3},{7,7,7,7,7,7,7}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                lengthOfLIS(nums[test]) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int lengthOfLIS(int[] numsVar) {
        if (numsVar == null || numsVar.length == 0)
            return 0;

        int n = numsVar.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numsVar[j] < numsVar[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int result = 0;

        for (int val : dp) {
            result = Math.max(result, val);
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
