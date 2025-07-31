/* Leetcode - 178. Rank Scores (Java language) - Medium */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class rank_scores_178 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 178. Rank Scores (Java language) - Medium"));
        
        float[] score = {3.5f, 3.65f, 4.0f, 3.85f, 4.0f, 3.65f, 3.5f};

        System.out.println(green("Test 1: "));
        rankScores(score);
        System.out.println(green("Passed"));
    }

    public static void rankScores(float[] scoreVar) {
        int[] ranking = new int[scoreVar.length];
        int rankingSize = 1;
        int starter = 1;

        ranking[0] = 1;

        Arrays.sort(scoreVar);
        List<Float> reversed = new LinkedList<>();

        for (int i = scoreVar.length - 1; i > 0; i--) {
            if (scoreVar[i] == scoreVar[i - 1]) {
                ranking[rankingSize++] = starter;
            }
            else
            {
                starter++;
                ranking[rankingSize++] = starter;
            }

            reversed.add(scoreVar[i]);
        }

        for (int i = 0; i < ranking.length - 1; i++) {
            System.out.println("score: " + reversed.get(i) + " | rank: " + ranking[i]);
        }

        System.out.print(" | ");
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
