/* Leetcode - 307. Range Sum Query - Mutable (Java language) - Medium */

class NumArray {
    private final int[] numArray; 

    public NumArray(int[] nums) {
        numArray = new int[nums.length + 1];

        System.arraycopy(nums, 0, numArray, 0, nums.length);
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += numArray[i];
        }

        return sum;
    }

    public void update(int index, int x) {
        numArray[index] = x;
    }
}

public class range_sum_query_mutable_307 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 307. Range Sum Query - Mutable (Java language) - Medium"));

        int[] arr = new int[]{1,3,5};

        NumArray numArray = new NumArray(arr);
        
        System.out.print(green("Test 1: "));
        System.out.print(numArray.sumRange(0, 2) + " ");
        numArray.update(1, 2);
        System.out.print(numArray.sumRange(0, 2) + " ");
        System.out.print("| " + green("Passed"));

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
