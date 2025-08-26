/* Leetcode - 229. Majority Element II (Java language) - Medium */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class majority_element_II_229 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 229. Majority Element II (Java language) - Medium"));

        int[][] nums = {{3,2,3},{1},{1,2}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                majorityElement(nums[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<Integer> majorityElement(int[] numsVar) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int maxOcc = 0;

        for (int num : numsVar) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxOcc) {
                maxOcc = count;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOcc) {
                result.add(entry.getKey());
            }
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
