/* Leetcode - 217. Contains Duplicate (Java language) - Easy */

import java.util.HashSet;

public class contains_duplicate_217 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 217. Contains Duplicate (Java language) - ") + green("Easy"));
        int[][] nums = {{1,2,3,1},{1,2,3,4},{1,1,1,3,3,4,3,2,4,2}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(containsDuplicate(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean containsDuplicate (int[] numsVar) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : numsVar) {
            if (seen.contains(num)) {
                return true;
            }
            else {
                seen.add(num);
            }
        }

        return false;
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

