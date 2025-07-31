/* Leetcode - 131. Palindrome Partitioning (Java language) - Medium */

import java.util.ArrayList;

public class palindrome_partitioning_131 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 131. Palindrome Partitioning (Java language) - Medium"));

        String[] s = {"aab","a"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Partition(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<String> Partition(String sVar) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < sVar.length(); i++) {
            for (int j = i; j <= sVar.length(); j++) {
                String substr = sVar.substring(i, j);
                
                if (isPal(substr) && substr.length() > 0) {
                    result.add(substr);
                }
            }
        }

        return result;
    }

    public static boolean isPal(String stringVar) {
        for (int i = 0; i < stringVar.length() / 2; i++) {
            if (stringVar.charAt(i) != stringVar.charAt(stringVar.length() - 1 - i)) {
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
