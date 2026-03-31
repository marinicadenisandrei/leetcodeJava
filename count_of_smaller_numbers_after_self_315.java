/* Leetcode - 315. Count of Smaller Numbers After Self (Java language) - Hard */

import java.util.Arrays;

public class count_of_smaller_numbers_after_self_315 {
    public static void main(String[] args) {
        System.out.println(
            yellow("Leetcode - 315. Count of Smaller Numbers After Self (Java language) - ") +
            red("Hard")
        );

        int[][] numsVar = {{5,2,6,1},{-1},{-1,-1}};
        
        for (int test = 0; test < numsVar.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(countSmaller(numsVar[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] countSmaller(int[] numsVar) {
        int[] result = new int[numsVar.length];
        int resultSize = 0;

        for (int i = 0; i < numsVar.length - 1; i++) {
            result[resultSize] = 0;
            
            for (int j = i + 1; j < numsVar.length; j++) {
                if (numsVar[i] > numsVar[j]) {
                    result[resultSize]++;
                }
            }

            resultSize++;
        }

        return result;
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
    }

    public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
    }

    public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
    }

    public static String reset(String var0) {
        return "\u001b[0m" + var0;
    }
}
