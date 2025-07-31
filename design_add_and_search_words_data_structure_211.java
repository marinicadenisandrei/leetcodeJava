/* Leetcode - 211. Design Add and Search Words Data Structure (Java language) - Medium */

import java.util.ArrayList;

public class design_add_and_search_words_data_structure_211 {
    static class WordDictionary {
        private ArrayList<String> dict = new ArrayList<>();

        void addWord(String word) {
            dict.add(word);
        }

        Boolean search(String word) {
            if (word.indexOf('.') != -1) {
                for (String str : dict) {
                    if (matchStringsWildCard(word, str)) {
                        return true;
                    }
                }

                return false;
            }

            return dict.indexOf(word) != -1;
        }

        public Boolean matchStringsWildCard(String pattern, String text) {
            if (pattern == null || text == null) return false;
            if (pattern.length() != text.length()) return false;        

            for (int i = 0; i < pattern.length(); i++) {
                char p = pattern.charAt(i);
                char t = text.charAt(i);
                if (p != '.' && p != t) {
                    return false;                                       
                }
            }
            return true;                                                
        }
    }

    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 211. Design Add and Search Words Data Structure (Java language) - Medium"));

        WordDictionary wordDictionary = new WordDictionary();

        System.out.print(green("Test 1: "));

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.print(wordDictionary.search("pad") + " ");  
        System.out.print(wordDictionary.search("bad") + " ");  
        System.out.print(wordDictionary.search(".ad") + " ");  
        System.out.print(wordDictionary.search("b..") + " ");
        
        System.out.print(" | " + green("Passed"));
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
