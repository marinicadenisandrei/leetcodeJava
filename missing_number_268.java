/* Leetcode - 268. Missing Number (Java language) - Easy */

public class missing_number_268 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 268. Missing Number (Java language) - ") + green("Easy"));

        int[][] nums = {{3,0,1},{0,1},{9,6,4,2,3,5,7,0,1}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                missingNumber(nums[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int missingNumber(int[] numsVar) {
        int n = numsVar.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= numsVar[i];
        }

        return xor;
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