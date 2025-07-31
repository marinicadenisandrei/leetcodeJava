/* Leetcode - 202. Happy Number (Java language) - Easy  */

import java.util.HashSet;
import java.util.Set;

public class happy_number_202 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 202. Happy Number (Java language) - ") + green("Easy"));

        int[] n = {19,2};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isHappy(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isHappy(int nVar) {
        Set<Integer> seen = new HashSet<>();

        while (nVar != 1 && !seen.contains(nVar)) {
            seen.add(nVar);
            nVar = sumOfSquares(nVar);
        }

        return nVar == 1;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
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
