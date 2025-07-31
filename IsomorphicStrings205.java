/* Leetcode - 205. Isomorphic Strings (Java language) - Easy */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 205. Isomorphic Strings (Java language) - ") + green("Easy"));
        
        String[] s = {"egg","foo","paper"};
        String[] t = {"add","bar","title"};

        for (int test = 0; test < t.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isIsomorphic(s[test], t[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> forward = new HashMap<>();
        Map<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (forward.containsKey(c1)) {
                if (forward.get(c1) != c2) return false;
            } else {
                if (reverse.containsKey(c2)) return false;

                forward.put(c1, c2);
                reverse.put(c2, c1);
            }
        }

        return true;
    }

    public static int divide(int dividendVar, int divisorVar) {
        return (int) dividendVar / divisorVar;
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
