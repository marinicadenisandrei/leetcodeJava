/* Leetcode - 239. Sliding Window Maximum (Java language) - Hard */

import java.util.Arrays;

public class sliding_window_maximum_239 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 239. Sliding Window Maximum (Java language) - ") + red("Hard"));

        int[][] nums = {{1,3,-1,-3,5,3,6,7},{1}}; 
        int k[] = {3,1};

        for (int test = 0; test < k.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(maxSlidingWindow(nums[test], k[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] maxSlidingWindow(int[] numsVar, int kVar) {
        int[] result = new int[numsVar.length - kVar + 1];
        int resultSize = 0;

        for (int i = 0; i <= numsVar.length - kVar; i++) {
            int max = 0;

            for (int j = i; j < i + kVar; j++) {
                max = ((max < numsVar[j]) ? numsVar[j] : max);
            }

            result[resultSize++] = max;
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
