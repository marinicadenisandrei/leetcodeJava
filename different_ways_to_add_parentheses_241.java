/* Leetcode - 241. Different Ways to Add Parentheses (Java language) - Medium */

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class different_ways_to_add_parentheses_241 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 241. Different Ways to Add Parentheses (Java language) - Medium"));

        String[] expression = {"2-1-1","2*3-4*5"};
        
        for (int test = 0; test < expression.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                diffWaysToCompute(expression[test]) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<Integer> diffWaysToCompute(String expressionVar) {
        ArrayList<Integer> result = new ArrayList<>();
        List<String> results = addParentheses(expressionVar);

        for (int i = 0; i < results.size(); i++) {
            result.add(evaluate(results.get(i)));
        }

        return result;
    }

    public static List<String> addParentheses(String expr) {
        return helper(expr);
    }

    private static List<String> helper(String expr) {
        List<String> result = new ArrayList<String>();
        boolean isNumber = true;

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                isNumber = false;

                List<String> left = helper(expr.substring(0, i));
                List<String> right = helper(expr.substring(i + 1));

                for (String l : left) {
                    for (String r : right) {
                        result.add("(" + l + c + r + ")");
                    }
                }
            }
        }

        // base case: expr is only a number
        if (isNumber) {
            result.add(expr);
        }

        return result;
    }

    public static int evaluate(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                values.push(num);
            }
            else if (c == '(') {
                ops.push(c);
            }
            else if (c == ')') {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop(); 
            }
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    private static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
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
