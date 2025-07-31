/* Leetcode - 154. Find Minimum in Rotated Sorted Array II (Java language) - Hard */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class find_minimum_in_rotated_sorted_array_II_154 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 154. Find Minimum in Rotated Sorted Array II (Java language) - ") + red("Hard"));

        int[][] nums = {{1,3,5},{2,2,2,0,1}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(findMin(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int findMin(int[] numsVar) {
        List<Integer> sortedNums = new ArrayList<>();
        for (int num : numsVar) {
            sortedNums.add(num);
        }

        Collections.sort(sortedNums);

        return sortedNums.get(0);
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
