/* Leetcode - 66. Plus One (Java language) - Easy */

import java.util.Arrays;

public class plus_one_66 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 66. Plus One (Java language) - ") + green("Easy"));
        
        int[][] digits = {{1,2,3},{4,3,2,1},{9}};

        for (int test = 0; test < digits.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(plusOne(digits[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int[] plusOne(int[] digitsVar) {
        int[] result = new int[10];
        int resultSize = 0; 
        
        int multiplyVar = 1;
        int number = 0;

        for (int i = 0; i < digitsVar.length - 1; i++) {
            multiplyVar *= 10;
        }

        for (int i = 0; i < digitsVar.length; i++) {
            number += (digitsVar[i] * multiplyVar);
            multiplyVar /= 10;
        }

        String numberString = Integer.toString(number + 1);
        for (int i = 0; i < numberString.length(); i++) {
            result[resultSize++] = (int) (numberString.charAt(i) - '0');
        }

        result = Arrays.copyOf(result, resultSize);
        return result;
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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
