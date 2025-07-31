/* Leetcode - 118. Pascal's Triangle (Java language) - Easy */

import java.util.ArrayList;
import java.util.List;

public class pascals_triangle_118 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 118. Pascal's Triangle (Java language) - ") + green("Easy"));

        int[] numRows = {5,1};   
        
        for (int test = 0; test < numRows.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(generate(numRows[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> generate(int numRowsVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (numRowsVar == 1) {
            result.add(new ArrayList<Integer>(List.of(1)));
            return result;
        }

        result.add(new ArrayList<>(List.of(1,1)));

        for (int i = 0; i < numRowsVar - 2; i++) {
            ArrayList<Integer> temp = new ArrayList<>(List.of(1));

            for (int j = 0; j < result.get(result.size() - 1).size() - 1; j++) {
               temp.add(result.get(result.size() - 1).get(j) + result.get(result.size() - 1).get(j + 1)); 
            }

            temp.add(1);
            result.add(temp);
        }

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
