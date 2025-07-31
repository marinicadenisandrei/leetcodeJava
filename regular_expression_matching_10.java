/* Leetcode - 10. Regular Expression Matching (Java language) - Hard */

import java.util.Arrays;

public class regular_expression_matching_10 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 10. Regular Expression Matching (Java language) - ") + red("Hard"));

        String[] s = {"aa","aa","ab"};
        String[] p = {"a","a*",".*"};

        for (int test = 0; test < p.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isMatch(s[test], p[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static boolean isMatch(String sVar, String pVar) {
        while (pVar.indexOf('*') != -1 || pVar.indexOf('.') != -1) {
            int[] restrictions = new int[10];
            Arrays.fill(restrictions, -1);
            int restrictionsSize = 0;

            if (pVar.indexOf('*') == pVar.length() - 1) {
                for (int i = pVar.indexOf('*'); i < pVar.length(); i++) {
                    restrictions[restrictionsSize++] = i;
                }
            }

            String newS = "";
            String newP = "";

            for (int i = 0; i < sVar.length(); i++) {
                if (!elementInArray(restrictions, restrictionsSize, i)) {
                    if (pVar.charAt(i) != '.') {
                        newS += sVar.charAt(i);
                        newP += pVar.charAt(i);
                    }
                    
                }
            }

            sVar = newS;
            pVar = newP;
        }

        return sVar.equals(pVar);
    }

    private static boolean elementInArray(int[] array, int arraySize, int elemenet) {
        for (int i = 0; i < array.length; i++) {
            if (elemenet == array[i]) {
                return true;
            }
        }

        return false;
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
