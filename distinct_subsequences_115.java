/* Leetcode - 115. Distinct Subsequences (Java language) - Hard */

import java.util.LinkedHashSet;

public class distinct_subsequences_115 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 115. Distinct Subsequences (Java language) - ") + red("Hard"));

        String[] s = {"rabbbit","babgbag"};
        String[] t = {"rabbit","bag"};

        for (int test = 0; test < t.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(numDistinct(s[test], t[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }   

    public static int numDistinct(String sVar, String tVar) {
        int counter = 0;

        String S_noDuplicates = removeDuplicates(sVar);
        int[] occS = new int[S_noDuplicates.length()];

        String T_noDuplicates = removeDuplicates(tVar);
        int[] occT = new int[T_noDuplicates.length()];

        for (int i = 0; i < occS.length; i++) {
            char c = S_noDuplicates.charAt(i);
            occS[i] = sVar.length() - sVar.replace(String.valueOf(c), "").length();
        }        

        for (int i = 0; i < occS.length; i++) {
            char c = T_noDuplicates.charAt(i);
            occT[i] = tVar.length() - tVar.replace(String.valueOf(c), "").length();
        }

        for (int i = 0; i < occT.length; i++) {
            counter += Math.abs((occS[i] * occT[i]) - occT[i]);
        }

        return ((allZeros(occT)) ? counter + 1 : counter - 1);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static boolean allZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                return false;
            }
        }

        return true;
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
