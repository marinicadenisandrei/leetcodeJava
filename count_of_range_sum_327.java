/* Leetcode - 327. Count of Range Sum (Java language) - Hard */

public class count_of_range_sum_327 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 327. Count of Range Sum (Java language) - ") + red("Hard"));

        int[][] nums = {{-2,5,-1},{0}};
        int[] lower = {-2,0};
        int[] upper = {2,0};

        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                countRangeSum(nums[test], lower[test], upper[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static int countRangeSum(int[] numsVar, int lowerVar, int upperVar) {
        int result = 0;

        for (int i = 0; i < numsVar.length; i++) {
            int tempSum = 0;

            for (int j = i; j < numsVar.length; j++) {
                tempSum += numsVar[j];

                if (lowerVar <= tempSum && upperVar >= tempSum) {
                    result++;
                }
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
