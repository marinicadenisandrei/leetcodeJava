/* Leetcode - 89. Gray Code (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class gray_code_89 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 89. Gray Code (Java language) - Medium"));

        int[] n = {2,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(grayCode(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static List<Integer> grayCode(int nVar) {
        List<Integer> result = new ArrayList<>();
        int totalNumbers = 1 << nVar;

        for (int i = 0; i < totalNumbers; i++) {
            int grayCode = i ^ (i >> 1);
            result.add(grayCode);
        }

        return result;
    }

    public static int divide(int dividendVar, int divisorVar) {
        return (int) dividendVar / divisorVar;
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
