/* Leetcode - 34. Find First and Last Position of Element in Sorted Array (Java language) - Medium */

import java.util.Arrays;

public class find_first_and_last_position_of_element_in_sorted_array_34 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 34. Find First and Last Position of Element in Sorted Array (Java language) - Medium"));

        int nums[][] = {{5,7,7,8,8,10},{5,7,7,8,8,10},{}}; 
        int target[] = {8,6,0};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(searchRange(nums[test], target[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int[] searchRange(int[] numsVar, int targetVar) {
        int[] findElements = new int[numsVar.length];
        int findElementsSize = 0;

        for (int i = 0; i < numsVar.length; i++) {
            if (numsVar[i] == targetVar) {
                findElements[findElementsSize++] = i; 
            }
        }

        int[] result = new int[2];

        if (findElementsSize > 1) {
            result[0] = findElements[0];
            result[1] = findElements[findElementsSize - 1];
        }
        else
        {
            return new int[] {-1,-1};
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
