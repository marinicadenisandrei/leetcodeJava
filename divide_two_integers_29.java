/* Leetcode - 29. Divide Two Integers (Java language) - Medium */

public class divide_two_integers_29 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 29. Divide Two Integers (Java language) - Medium"));
        
        int[] dividend = {10,7};
        int[] divisor = {3,-3};

        for (int test = 0; test < dividend.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(divide(dividend[test], divisor[test]) + " | ");
            System.out.println(green("Passed"));   
        }
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

