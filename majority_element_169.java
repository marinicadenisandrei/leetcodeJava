/* Leetcode - 169. Majority Element (Java language) - Easy */

import java.util.HashMap;
import java.util.Map;

public class majority_element_169 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 169. Majority Element (Java language) - ") + green("Easy"));

        int[][] nums = {{3,2,3},{2,2,1,1,1,2,2}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(majorityElement(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int majorityElement(int[] numsVar) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : numsVar) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxElement = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxElement;
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
