/* Leetcode - 2. Add Two Numbers (Java language) - Medium */

import java.math.BigInteger;
import java.util.Arrays;

public class add_two_numbers_2 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 2. Add Two Numbers (Java language) - Medium"));

        int[][] l1 = {{2, 4, 3},{0},{9,9,9,9,9,9,9}};
        int[][] l2 = {{5, 6, 4},{0},{9,9,9,9}};

        for (int test = 0; test < l2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(addTwoNumbers(l1[test], l2[test])) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int[] addTwoNumbers(int[] l1Var, int[] l2Var) {
        String number1 = "";
        String number2 = "";
        
        for (int i = l1Var.length - 1; i >= 0; i--) {
            number1 += Integer.toString(l1Var[i]);
        }

        for (int i = l2Var.length - 1; i >= 0; i--) {
            number2 += Integer.toString(l2Var[i]);
        }
        
        BigInteger num1 = new BigInteger(number1);
        BigInteger num2 = new BigInteger(number2);
        BigInteger result = num1.add(num2);
        
        String resultStr = result.toString();
        int[] output = new int[resultStr.length()];
        
        for (int i = 0; i < resultStr.length(); i++) {
            output[i] = resultStr.charAt(resultStr.length() - 1 - i) - '0';
        }

        return output;
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
