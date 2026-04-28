/* Leetcode - 318. Maximum Product of Word Lengths (Java language) - Medium */

public class maximum_product_of_word_lengths_318 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 318. Maximum Product of Word Lengths (Java language) - Medium"));
        
        String[][] words = {{"abcw","baz","foo","bar","xtfn","abcdef"},{"a","ab","abc","d","cd","bcd","abcd"},{"a","aa","aaa","aaaa"}};
        
        for (int test = 0; test < words.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maxProduct(words[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maxProduct(String[] wordsVar) {
        int max = 0;

        for (int i = 0; i < wordsVar.length; i++) {
            for (int j = 0; j < wordsVar.length; j++) {
                if (i != j & !(hasCommonLetter(wordsVar[i], wordsVar[j]))) {
                    int tempProduct = wordsVar[i].length() * wordsVar[j].length(); 
                    max = ((tempProduct > max) ? tempProduct : max);
                }
            }
        }

        return max;
    }

    public static boolean hasCommonLetter(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1) {
                return true;
            }
        }

        return false;
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
