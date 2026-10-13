/* Leetcode - 347. Top K Frequent Elements (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class top_k_frequent_elements_347 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 347. Top K Frequent Elements (Java language) - Medium"));

        int[][] nums = {{1,1,1,2,2,3},{1},{1,2,1,2,1,2,3,1,3,2}};
        int[] k = {2,1,2};

        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(topKFrequent(nums[test], k[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] topKFrequent(int[] numsVar, int kVar) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : numsVar) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[kVar];

        for (int i = 0; i < kVar; i++) {
            result[i] = list.get(i).getKey();
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
