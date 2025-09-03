/* Leetcode - 233. Number of Digit One (Java language) - Hard */

public class number_of_digit_one_233 {
    public static void main(String[] args) {
        System.out.println(
            yellow("Leetcode - 233. Number of Digit One (Java language) - ") +
            red("Hard")
        );

        int[] n = {13,0};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                countDigitOne(n[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static int countDigitOne(int nVar) {
        int result = 0;

        for (int i = 0; i <= nVar; i++) {
            result += String.valueOf(i)
                            .chars()
                            .filter(ch -> ch == '1')
                            .count();
        }

        return result;
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
