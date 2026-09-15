/* Leetcode - 342. Power of Four (Java language) - Easy */

public class power_of_four_342 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 342. Power of Four (Java language) - ") + green("Passed"));

        int[] n = {16, 5, 1};

        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isPowerOfFour(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean isPowerOfFour(int nVar) {
        if (nVar <= 0) {
            return false;
        }

        while (nVar > 1) {
            if (nVar % 4 != 0) {
                return false;
            }

            nVar /= 4;
        }

        return true;
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