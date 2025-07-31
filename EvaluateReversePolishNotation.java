/* Leetcode - 150. Evaluate Reverse Polish Notation (Java language) - Medium */

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 150. Evaluate Reverse Polish Notation (Java language) - Medium"));

        String[][] tokens = {{"2", "1", "+", "3", "*"},{"4","13","5","/","+"},{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}};
        
        for (int test = 0; test < tokens.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(evalRPN(tokens[test]) + " | "); 
            System.out.println(green("Passed"));
        }
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b;
                }

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
     }
  
     public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
     }
  
     public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
     }
  
     public static String reset(String var0) {
        return "\u001b[0m" + var0;
     }
}
