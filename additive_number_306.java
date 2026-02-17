/* Leetcode - 306. Additive Number (Java language) - Medium */

public class additive_number_306 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 306. Additive Number (Java language) - Medium"));
        
        String[] s = {"112358","199100199"};

        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isAdditiveNumber(s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static Boolean isAdditiveNumber(String sVar) {
        int[] digits = sVar.chars().map(c -> c - '0').toArray();
        boolean flag = true;

        for (int i = 0; i < digits.length - 2; i++) {
            if (digits[i] + digits[i + 1] != digits[i + 2]) {
                flag = false;
            }
        }

        if (flag) {
            return true;
        }

        int[] acumulation = new int[sVar.length()];
        int acumulationSize = 0;

        int i = 0;
        int len = 1;

        while (i < sVar.length()) {
            int end = Math.min(i + len, sVar.length());
            String part = sVar.substring(i, end);

            acumulation[acumulationSize++] = Integer.parseInt(part);

            i = end;   
            len++;
        }


        for (int j = 0; j < acumulationSize - 2; j++) {
            if (acumulation[j] + acumulation[j + 1] != acumulation[j + 2]) {
                return false;
            }
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
