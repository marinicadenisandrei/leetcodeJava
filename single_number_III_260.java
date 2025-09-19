/* Leetcode - 260. Single Number III (Java language) - Medium */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class single_number_III_260 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 260. Single Number III (Java language) - Medium"));

        int[][] nums = {{1,2,1,3,2,5},{-1,0},{0,1}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(singleNumber(nums[test])) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] singleNumber(int[] numsVar) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        int[] result = new int[numsVar.length];
        int resultSize = 0;

        for (int num : numsVar) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result[resultSize++] = entry.getKey();
            }
        }

        return Arrays.copyOf(result, resultSize);
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
