/* Leetcode - 153. Find Minimum in Rotated Sorted Array (Java language) - Medium */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class find_minimum_in_rotated_sorted_array_153 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 153. Find Minimum in Rotated Sorted Array (Java language) - Medium"));

        int[][] nums = {{3,4,5,1,2},{4,5,6,7,0,1,2},{11,13,15,17}};
        
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
