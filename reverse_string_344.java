/* Leetcode - 344. Reverse String (Java language) - Easy */

import java.util.Arrays;

public class reverse_string_344 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 344. Reverse String (Java language) - ") + green("Easy"));
        
        String[][] s = {{"h","e","l","l","o"},{"H","a","n","n","a","h"}};
        
        for (int test = 0; test < s.length; test++) {
            reverseString(s[test]);
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static void reverseString(String[] sVar) {
        for (int i = 0; i < sVar.length / 2; i++) {
            String temp = sVar[i];
            sVar[i] = sVar[sVar.length - 1 - i];
            sVar[sVar.length - 1 - i] = temp;
        }
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