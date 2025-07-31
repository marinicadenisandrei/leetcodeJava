/* Leetcode - 72. Edit Distance (Java language) - Medium */

import java.util.Arrays;

public class edit_distance_72 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 72. Edit Distance (Java language) - Medium"));
        String[] word1 = {"horse","intention"};
        String[] word2 = {"ros","execution"};
        
        for (int test = 0; test < word2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minDistance(word1[test], word2[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int minDistance(String word1Var, String word2Var) {
        int count = 0;

        if (word2Var.length() < word1Var.length()) {
            int[] candidates = new int[word1Var.length()];
            int candidatesSize = 0;

            for (int i = 0; i < word2Var.length(); i++) {
                candidates[candidatesSize++] = word1Var.indexOf(word2Var.charAt(i));
            }

            candidates = Arrays.copyOf(candidates, candidatesSize);

            for (int i = 0; i < candidates.length - 1; i++) {
                if (candidates[i] > candidates[i + 1]) {
                    count++;
                }
            }
        }
        else if (word1Var.length() == word2Var.length()) {
            for (int i = 0; i < word1Var.length(); i++) {
                if (word1Var.charAt(i) != word2Var.charAt(i)) {
                    count++;
                }
            }
        }
        else
        {
            int[] candidates = new int[word1Var.length()];
            int candidatesSize = 0;

            for (int i = 0; i < word1Var.length(); i++) {
                candidates[candidatesSize++] = word2Var.indexOf(word1Var.charAt(i));
            }

            candidates = Arrays.copyOf(candidates, candidatesSize);
            
            for (int i = 0; i < candidates.length - 1; i++) {
                if (candidates[i] > candidates[i + 1]) {
                    count++;
                }
            }
        }
        
        
        count += Math.abs(word1Var.length() - word2Var.length());

        return count;
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
