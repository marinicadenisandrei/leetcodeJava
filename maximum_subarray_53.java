/* Leetcode - 53. Maximum Subarray (Java language) - Medium */

import java.util.Arrays;

public class maximum_subarray_53 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 53. Maximum Subarray (Java language) - Medium"));
        int[][] nums = {{-2,1,-3,4,-1,2,1,-5,4},{1},{5,4,-1,7,8}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(maxSubArray(nums[test])) + " | ");
            System.out.println(green("Passed")); 
        }
    }

    public static int[] maxSubArray(int[] numsVar) {
        if (numsVar.length < 2) {
            return numsVar;
        }

        int[] resultArray = new int[numsVar.length];
        int sumVar = 0;
        
        for (int i = 0; i < numsVar.length; i++) {
            int[] tempArr = new int[numsVar.length];
            int tempArrSize = 0;

            for (int j = i; j < numsVar.length; j++) {
                tempArr[tempArrSize++] = numsVar[j];

                if (sumOfArrayElkements(tempArr) > sumVar && tempArrSize > 1) {
                    resultArray = Arrays.copyOf(tempArr, tempArrSize);
                    sumVar = sumOfArrayElkements(tempArr);
                }
            }
        }

        return resultArray;
    }

    public static int sumOfArrayElkements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
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
