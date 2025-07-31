/* Leetcode - 151. Reverse Words in a String (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse_words_in_a_string_151 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 151. Reverse Words in a String (Java language) - Medium"));

        String[] s = {"the sky is blue","  hello world  ","a good   example"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(reverseWords(s[test]) + " | ");
            System.out.println(green("Test"));
        }
    }
    
    public static String reverseWords(String sVar) {
        List<String> words = new ArrayList<>(Arrays.asList(sVar.trim().split("\\s+")));

        Collections.reverse(words);
        
        return String.join(" ", words);
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
