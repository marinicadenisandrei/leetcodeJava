/* Leetcode - 290. Word Pattern (Java language) - Easy */

import java.util.HashMap;

public class word_pattern_290 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 290. Word Pattern (Java language) - ") + green("Easy"));

        String[] pattern = {"abba","abba","aaaa"};
        String[] s = {"dog cat cat dog","dog cat cat fish","dog cat cat dog"};

        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                wordPattern(pattern[test], s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static Boolean wordPattern(String pattern, String s) {
        HashMap<String, String> patternsMap = new HashMap<>();
        String[] parts = s.split(" ");

        for (int i = 0; i < parts.length; i++) {
            String key = String.valueOf(pattern.charAt(i));
            if (patternsMap.containsKey(key)) {
                if (!patternsMap.get(key).equals(parts[i])) {
                    return false;
                }
            } else {
                patternsMap.put(key, parts[i]);
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
