/* Leetcode - 192. Word Frequency (Java language) - Medium */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class word_frequency_192 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 192. Word Frequency (Java language) - Medium"));

        String words = "the day is sunny the the\nthe sunny is is";

        System.out.println(green("Test 1:"));
        wordFrequency(words);
        System.out.print("| " + green("Passed"));
    }

    public static void wordFrequency(String wordsVar) {
        String[] wordsList = Arrays.stream(wordsVar.trim().split("\\s+"))
                                   .map(String::toLowerCase) 
                                   .toArray(String[]::new);

        Set<String> uniqueWordsSet = new LinkedHashSet<>(Arrays.asList(wordsList));
        String[] uniqueWordsArray = uniqueWordsSet.toArray(new String[0]);

        for (int i = 0; i < uniqueWordsArray.length; i++) {
            int c = 0;

            for (String word : wordsList) {
                c += ((word.compareTo(uniqueWordsArray[i]) == 0) ? 1 : 0);
            }

            System.out.println(uniqueWordsArray[i] + " " + c);
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
