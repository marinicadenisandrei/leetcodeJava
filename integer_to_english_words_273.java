/* Leetcode - 273. Integer to English Words (Java language) - Hard */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class integer_to_english_words_273 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 273. Integer to English Words (Java language) - " + red("Hard")));

        int[] num = {123,12345,1234567};
        
        for (int test = 0; test < num.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                numberToWords(num[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static String numberToWords(int numVar) {
        String result = "";
        int level = 0;

        List<String> numbers = new ArrayList<>(Arrays.asList(
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        ));

        List<String> zecimals = new ArrayList<>(Arrays.asList(
            "Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
        ));

        List<String> candidates = splitByThree(String.valueOf(numVar));
        
        for (int i = candidates.size() - 1; i > 0; i--) {
            String last = numbers.get((candidates.get(i).charAt(2) - '0') - 1);
            String middle = zecimals.get((candidates.get(i).charAt(1) - '0') - 1);
            String start = numbers.get((candidates.get(i).charAt(0) - '0') - 1);

            result = result + start + " Hundred " + middle + " " + last + " ";

            level++;
        }

        String last = "";
        String middle = "";
        String start = "";

        String nameOfLevel = ((level == 1) ? " Thousand " : (level == 2) ? " Million " : (level == 3) ? " Billion " : "");

        if (candidates.get(0).length() == 3) {
            last = numbers.get((candidates.get(0).charAt(2) - '0') - 1);
            middle = zecimals.get((candidates.get(0).charAt(1) - '0') - 1);
            start = numbers.get((candidates.get(0).charAt(0) - '0') - 1);

            result = result + start + " Hundred " + middle + " " + last + nameOfLevel;
        } else if (candidates.get(0).length() == 2) {
            if (candidates.get(0).compareTo("11") == 0) {
                result = " Eleven " + nameOfLevel + result;
            } else if (candidates.get(0).compareTo("12") == 0) {
                result = "Twelve " + nameOfLevel + result;
            } else {
                last = numbers.get((candidates.get(0).charAt(1) - '0') - 1);
                middle = zecimals.get((candidates.get(0).charAt(0) - '0') - 1);
                result = result + start + middle + " " + last + nameOfLevel;
            }
        } else {
            last = numbers.get((candidates.get(0).charAt(0) - '0') - 1);
            result = last + nameOfLevel + result;
        }

        return result;
    }

    public static List<String> splitByThree(String str) {
        List<String> parts = new ArrayList<>();
        int length = str.length();
        int rem = length % 3;
        int index = 0;

        if (rem != 0) {
            parts.add(str.substring(0, rem));
            index = rem;
        }
        
        while (index < length) {
            parts.add(str.substring(index, index + 3));
            index += 3;
        }
        
        return parts;
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
