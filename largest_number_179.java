/* Leetcode - 179. Largest Number (Java language) - Medium */

import java.util.Arrays;
import java.util.Comparator;

public class largest_number_179 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 179. Largest Number (Java language) - Medium"));

        int[][] nums = {{10, 2},{3, 30, 34, 5, 9}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(largestNumber(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrs, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (numStrs[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : numStrs) {
            result.append(s);
        }

        return result.toString();
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
