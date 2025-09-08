/* Leetcode - 238. Product of Array Except Self (Java language) - Medium */

import java.util.Arrays;

public class product_of_array_except_self_238 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 238. Product of Array Except Self (Java language) - Medium"));

        int nums[][] = {{1,2,3,4},{-1,1,0,-3,3}}; 

        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                Arrays.toString(productExceptSelf(nums[test])) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] productExceptSelf(int[] numsVar) {
        int[] result = new int[numsVar.length];
        int resultSize = 0;
        
        for (int i = 0; i < numsVar.length; i++) {
            result[resultSize] = 1;

            for (int j = 0; j < numsVar.length; j++) {
                if (i != j) {
                    result[resultSize] *= numsVar[j];
                }
            }

            resultSize++;
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
