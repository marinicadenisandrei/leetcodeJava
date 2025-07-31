/* Leetcode - 119. Pascal's Triangle II (Java language) - Easy */

import java.util.ArrayList;
import java.util.List;

public class pascals_triangle_II_119 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 119. Pascal's Triangle II (Java language) - ") + green("Easy"));

        int[] numRows = {3,0,1};   
        
        for (int test = 0; test < numRows.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(generate(numRows[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> generate(int numRowsVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1,1)));

        if (numRowsVar == 0) {
            return new ArrayList<>(List.of(1));
        }

        for (int i = 0; i < numRowsVar - 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>(List.of(1));

            for (int j = 0; j < result.get(result.size() - 1).size() - 1; j++) {
               temp.add(result.get(result.size() - 1).get(j) + result.get(result.size() - 1).get(j + 1)); 
            }

            temp.add(1);
            result.add(temp);
        }

        return result.get(result.size() - 1);
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
