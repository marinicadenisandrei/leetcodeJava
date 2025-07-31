/* Leetcode - 15. 3Sum (Java language) - Medium */

import java.util.Arrays;

public class threesum_15 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 15. 3Sum (Java language) - Medium"));

        int[][] nums = {{-1,0,1,2,-1,-4},{0,1,1},{0,0,0}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(threeSum(nums[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int[][] threeSum(int[] numsVar) {
        int[][] result = new int[10][3];
        int resultSize = 0;

        int[] temp = new int[3];

        for (int[] arr : result) {
            Arrays.fill(arr, 1);
        }

        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                for (int j2 = 0; j2 < numsVar.length; j2++) {
                    if (i != j && j != j2 & i != j2 & numsVar[i] + numsVar[j] + numsVar[j2] == 0) {
                        temp[0] = numsVar[i];
                        temp[1] = numsVar[j];
                        temp[2] = numsVar[j2];

                        Arrays.sort(temp);

                        if (!isArrayIn2DArray(temp, result)) {
                            result[resultSize++] = Arrays.copyOf(temp, 3);
                        }
                    }
                }
            }
        }

        result = Arrays.copyOf(result, resultSize);
        return result;
    }

    public static Boolean isArrayIn2DArray(int[] arr, int[][] arr2D) {
        for (int[] row : arr2D) {
            if (areArraysEqual(arr, row)) {
                return true;
            }
        }

        return false;
    }

    public static Boolean areArraysEqual(int[] arr1, int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
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

