/* Leetcode - 32. Longest Valid Parentheses (Java language) - Hard */

import java.util.Arrays;

public class longest_valid_parentheses_32 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 32. Longest Valid Parentheses (Java language) - ") + red("Hard"));
        String[] s = {"(()",")()())",""};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(longestValidParentheses(s[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int longestValidParentheses(String sVar) {
        char[] characters = sVar.toCharArray();
        Arrays.sort(characters);
        sVar = new String(characters);
        int counter = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '(' && characters[characters.length - 1 -i] == ')') {
                counter++;
            }
            else
            {
                break;
            }
        }

        return counter * 2;
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
