/* Leetcode - 20. Valid Parentheses (Java language) - Easy */

import java.util.Arrays;

public class valid_parentheses_20 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 20. Valid Parentheses (Java language) - ") + green("Easy"));

        String[] s = {"()","()[]{}","(]","([])"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isValid(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static Boolean isValid(String sVar) {
        char[] charArray = sVar.toCharArray();
        Arrays.sort(charArray);

        for (int i = 0; i < charArray.length; i += 2) {
            if ((charArray[i] == '(' && charArray[i + 1] != ')') || (charArray[i] == '[' && charArray[i + 1] != ']') || (charArray[i] == '{' && charArray[i + 1] != '}')) {
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
