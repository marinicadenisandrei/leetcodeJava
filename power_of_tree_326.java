/* Leetcode - 326. Power of Three (Java language) - Easy */

public class power_of_tree_326 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 326. Power of Three (Java language) - ") + green("Easy"));
        
        int[] n = {27,0,-1};

        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isPowerOfThree(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean  isPowerOfThree(int nVar) {
        while (nVar > 1) {
            nVar /= 3;
        }

        return (int) nVar == 1;
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
