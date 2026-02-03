/* Leetcode - 303. Range Sum Query - Immutable (Java language) - Easy */

class NumArray {
    private final int[] prefix; 

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}

public class range_sum_query_303 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 303. Range Sum Query - Immutable (Java language) - ") + green("Easy"));

        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        
        System.out.println(
            green("Test 1: ") +
            numArray.sumRange(0, 2) + " " +
            numArray.sumRange(2, 5) + " " + 
            numArray.sumRange(0, 5) + " " +
            "| " +
            green("Passed")
        ); 
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
