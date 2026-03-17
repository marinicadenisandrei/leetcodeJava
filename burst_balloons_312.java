/* Leetcode - 312. Burst Balloons (Java language) - Hard */

import java.util.stream.IntStream;

public class burst_balloons_312 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 312. Burst Balloons (Java language) - ") + red("Hard"));
        int[][] nums = {{3,1,5,8},{1,5}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maxCoins(nums[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maxCoins(int[] numsVar) {
        int coins = 0;

        while (numsVar.length > 0) {
            final int removeIndex;

            if (numsVar.length > 2) {
                coins += numsVar[0] * numsVar[1] * numsVar[2];
                removeIndex = 1;
            } else if (numsVar.length == 2) {
                coins += numsVar[0] * numsVar[1];
                removeIndex = 0;
            } else {
                coins += numsVar[0];
                removeIndex = 0;
            }

            int[] current = numsVar;
            numsVar = IntStream.range(0, current.length)
                    .filter(i -> i != removeIndex)
                    .map(i -> current[i])
                    .toArray();
        }

        return coins;
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
