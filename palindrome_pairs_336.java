/* Leetcode - 336. Palindrome Pairs (Java language) - Hard */

import java.util.ArrayList;
import java.util.List;

public class palindrome_pairs_336 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 336. Palindrome Pairs (Java language) - ") + red("Hard"));
        
        String[][] words = {{"abcd","dcba","lls","s","sssll"},{"bat","tab","cat"},{"a",""}};
        
        for (int test = 0; test < words.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                palindromePairs(words[test]) + 
                " | " + 
                green("Passed")
            );
        }
    }

    public static List<List<Integer>> palindromePairs(String[] wordsVar) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < wordsVar.length; i++) {
            for (int j = 0; j < wordsVar.length; j++) {
                if (i != j) {
                    String temp = wordsVar[i] + wordsVar[j];

                    if (isPalindrome(temp)) {
                        result.add(List.of(i, j));
                    }
                }
            }
        }

        return result;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
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
