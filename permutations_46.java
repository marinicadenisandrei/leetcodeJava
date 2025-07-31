/* Leetcode - 46. Permutations (Java language) - Medium */

import java.util.Arrays;

public class permutations_46 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 46. Permutations (Java language) - Medium"));

        int[][] nums = {{1,2,3},{0,1},{1}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test: " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(permute(nums[test])) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int[][] permute(int[] numsVar) {
        if (numsVar.length <= 1) {
            return new int[][] {numsVar};
        }

        int depth = 1;
        int index1 = 0;
        int index2 = 1;
        int temp = 0;

        for (int i = 1; i <= numsVar.length; i++) {
            depth *= i;
        }

        int[][] result = new int[depth][numsVar.length];
        int resultSize = 0;

        do {
            if (index2 < numsVar.length - 1) {
                temp = numsVar[index1];
                numsVar[index1] = numsVar[index2];
                numsVar[index2] = temp;
            }
            else
            {
                temp = numsVar[0];
                numsVar[0] = numsVar[index2];
                numsVar[index2] = temp;

                index1 = -1;
                index2 = 0;
            }

            index1++;
            index2++;
            depth--;
            
            result[resultSize++] = Arrays.copyOf(numsVar, 3);
        } while (depth > 0);

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
