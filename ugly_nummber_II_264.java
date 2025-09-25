/* Leetcode - 264. Ugly Number II (Java language) - Medium */

public class ugly_nummber_II_264 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 264. Ugly Number II (Java language) - Medium"));

        int[] n = {10,1};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                nthUglyNumber(n[test]) + 
                " | " + 
                green("Passed")
            );
        }
    }

    public static int nthUglyNumber(int nVar) {
        int result = 0;
        int candidate = 1;
        int counter = 0;

        while (counter < nVar) {
            if (isUgly(candidate)) {
                result = candidate;
                counter++;
            }

            candidate++;
        }

        return result;
    }

    public static boolean isUgly(int nVar) {
        while (nVar % 2 == 0) nVar /= 2;
        while (nVar % 3 == 0) nVar /= 3;
        while (nVar % 5 == 0) nVar /= 5;

        return nVar == 1;
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
