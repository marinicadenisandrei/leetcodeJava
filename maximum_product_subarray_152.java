/* Leetcode - 152. Maximum Product Subarray (Java language) - Medium */

public class maximum_product_subarray_152 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 152. Maximum Product Subarray (Java language) - Medium"));

        int[][] nums = {{2,3,-2,4},{-2,0,-1}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxProduct(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxProduct(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                result = ((result < product) ? product : result);
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
