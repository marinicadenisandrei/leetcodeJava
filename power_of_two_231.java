/* Leetcode - 231. Power of Two (Java language) - Easy */

public class power_of_two_231 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 231. Power of Two (Java language) - ") + green("Easy"));

        int[] n = {1,16,3};

        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                isPowerOfTwo(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean isPowerOfTwo(int nVar) {
        int start = 1;
        int power = 0;
        
        while (power < nVar) {
            if ((start * start) == nVar) {
                return true;
            }

            power = start * start;
            start++;
        }

        return false;
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
