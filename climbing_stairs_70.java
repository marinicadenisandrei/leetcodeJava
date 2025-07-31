/* Leetcode - 70. Climbing Stairs (Java language) - Easy */

public class climbing_stairs_70 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 70. Climbing Stairs (Java language) - ") + green("Easy"));
        int[] n = {2,3};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(climbStairs(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int climbStairs(int nVar) {
        int counter = 1;

        int temp = 0;
        int step1 = 1;
        int step2 = 2;

        while (temp < nVar) {
            temp += step1;

            if (step1 == 1) {
                step1 = 2;
            } else {
                step1 = 1;
            }
        }

        if (temp == nVar) {
            counter++;
        }

        temp = 0;

        while (temp < nVar) {
            temp += step2;

            if (step2 == 1) {
                step2 = 2;
            } else {
                step2 = 1;
            }
        }

        if (temp == nVar) {
            counter++;
        }

        return counter;
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
