/* Leetcode - 209. Minimum Size Subarray Sum (Java language) - Medium */

public class minimum_size_subarray_sum_209 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 209. Minimum Size Subarray Sum (Java language) - Medium"));

        int[] target = {7,4,11};
        int[][] nums = {{2,3,1,2,4,3},{1,4,4},{1,1,1,1,1,1,1,1}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minSubArrayLen(target[test], nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int minSubArrayLen(int targetVar, int[] numsVar) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numsVar.length; i++) {
            int sum = 0;
            int index = i;
            int size = 0;

            while (index < numsVar.length) {
                if (sum < targetVar) {
                    sum += numsVar[index++];
                    size++;
                }
                else {
                    break;
                }
            }

            min = ((min > size && sum == targetVar) ? size : min);
        }

        return ((min == Integer.MAX_VALUE) ? 0 : min);
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
