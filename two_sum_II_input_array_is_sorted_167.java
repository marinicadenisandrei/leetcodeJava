/* Leetcode - 167. Two Sum II - Input Array Is Sorted (Java language) - Medium */

import java.util.Arrays;

public class two_sum_II_input_array_is_sorted_167 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 167. Two Sum II - Input Array Is Sorted (Java language) - Medium"));

        int[][] numbers = {{2,7,11,15},{2,3,4},{-1,0}}; 
        int[] target = {9,6,-1};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(twoSum(numbers[test], target[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] twoSum(int[] numbersVar, int targetVar) {
        for (int i = 0; i < numbersVar.length; i++) {
            for (int j = 0; j < numbersVar.length; j++) {
                if (i != j && numbersVar[i] + numbersVar[j] == targetVar) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return new int[] {};
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
