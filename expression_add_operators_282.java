/* Leetcode - 282. Expression Add Operators (Java language) - Hard */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class expression_add_operators_282 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 282. Expression Add Operators (Java language) - ") + red("Hard"));
        
        String[] num = {"123","232","3456237490"};
        int[] target = {6,8,9191};

        for (int test = 0; test < target.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                addOperators(num[test], target[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<String> addOperators(String numVar, int targetVar) {
        ArrayList<String> result = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < numVar.length(); i++) {
            temp += ((i < numVar.length() - 1) ? numVar.charAt(i) + "+" : numVar.charAt(i));
        }

        if (evalSimple(temp) == targetVar) {
            result.add(temp);
        }

        temp = "";

        for (int i = 0; i < numVar.length(); i++) {
            temp += ((i < numVar.length() - 1) ? numVar.charAt(i) + "*" : numVar.charAt(i));
        }

        if (evalSimple(temp) == targetVar) {
            result.add(temp);
        }

        temp = "";


        for (int i = 0; i < numVar.length(); i++) {
            temp += ((i < numVar.length() - 1) ? numVar.charAt(i) + ((i % 2 == 0) ? "*" : "+") : numVar.charAt(i));
        }

        if (evalSimple(temp) == targetVar) {
            result.add(temp);
        }

        temp = "";

        for (int i = 0; i < numVar.length(); i++) {
            temp += ((i < numVar.length() - 1) ? numVar.charAt(i) + ((i % 2 == 0) ? "+" : "*") : numVar.charAt(i));
        }

        if (evalSimple(temp) == targetVar) {
            result.add(temp);
        }

        return result;
    }

    public static int evalSimple(String expr) {
        long num = 0;
        char op = '+';
        Deque<Long> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!Character.isDigit(c) && c != ' ') || i == expr.length() - 1) {
                switch (op) {
                    case '+': stack.push(num); break;
                    case '-': stack.push(-num); break;
                    case '*': stack.push(stack.pop() * num); break;
                }
                op = c;
                num = 0;
            }
        }

        long result = 0;
        while (!stack.isEmpty()) result += stack.pop();
        return (int) result;
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
