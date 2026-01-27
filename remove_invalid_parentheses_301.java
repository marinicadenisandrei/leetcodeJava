/* Leetcode - 301. Remove Invalid Parentheses (Java language) - Hard */

import java.util.ArrayList;

public class remove_invalid_parentheses_301 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 301. Remove Invalid Parentheses (Java language) - ") + red("Hard"));

        String[] s = {"()())()", "(a)())()", ")("};

        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                removeInvalidParentheses(s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<String> removeInvalidParentheses(String sVar) {
        int counter = 0;
        String sVar_copy = sVar;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < sVar.length(); i++) {
            char ch = sVar.charAt(i);

            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                if (counter > 0) {
                    counter--;
                } else {
                    sVar = sVar.substring(0, i) + sVar.substring(i + 1);
                    i--; 
                }
            }
        }

        if (counter > 0) {
            for (int i = sVar.length() - 1; i >= 0 && counter > 0; i--) {
                if (sVar.charAt(i) == '(') {
                    sVar = sVar.substring(0, i) + sVar.substring(i + 1);
                    counter--;
                }
            }
        }

        result.add(sVar);

        for (int i = 0; i < sVar_copy.length(); i++) {
            char ch = sVar_copy.charAt(i);
            if (ch != '(' && ch != ')') continue; 

            String temp = sVar_copy.substring(0, i) + sVar_copy.substring(i + 1);

            if (checkAllParentheses(temp)) {
                if (!result.contains(temp)) {
                    result.add(temp);
                }
            }
        }

        return result;
    }

    public static boolean checkAllParentheses(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                if (counter > 0) {
                    counter--;
                } else {
                    return false;
                }
            }
        }

        return counter == 0;
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

