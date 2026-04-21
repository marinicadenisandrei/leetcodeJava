/* Leetcode - 316. Remove Duplicate Letters (Java language) - Medium */

import java.util.stream.Collectors;

public class remove_duplicate_letters_316 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 316. Remove Duplicate Letters (Java language) - Medium"));

        String[] s = {"bcabc", "cbacdcbc"};

        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) +": ") +
                removeDuplicateLetters(s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static String removeDuplicateLetters(String sVar) {
        String result = sVar.chars()
            .distinct()
            .sorted()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());

        return result;
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
    }

    public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
    }

    public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
    }

    public static String reset(String var0) {
        return "\u001b[0m" + var0;
    }
}