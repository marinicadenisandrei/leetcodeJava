/* Leetcode - 22. Generate Parentheses (Java language) - Medium */

import java.util.Arrays;

public class generate_parentheses_22 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 22. Generate Parentheses (Java language) - Medium"));
        
        int n[] = {3,1};
        
        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(generateParenthesis(n[test])) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static String[] generateParenthesis(int nVar) {
        if (nVar == 1) {
            return new String[] {"()"};
        }
        
        String[] result = new String[10];
        int resultSize = 0;

        String temp = "";

        temp = "()".repeat(nVar);
        result[resultSize++] = temp;

        temp = "(" + "()".repeat(nVar - 1) + ")";
        result[resultSize++] = temp;

        temp = "(".repeat(nVar) + ")".repeat(nVar);
        result[resultSize++] = temp;

        int index1 = 0;
        int index2 = 1;

        for (int i = 0; i < nVar - 1; i++) {
            temp = "";

            for (int j = 0; j < nVar - 1; j++) {
                if (j == index1) {
                    temp += "(";
                }
                
                if (j == index2) {
                    temp += ")";
                }
                
                temp += "()";
            }

            if (index2 == nVar - 1) {
                temp += ")";
            }
            
            result[resultSize++] = temp;
            index1++;
            index2++;
        }

        result = Arrays.copyOf(result, resultSize);
        return result;
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
