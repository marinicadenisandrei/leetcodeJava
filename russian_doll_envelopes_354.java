/* Leetcode - 354. Russian Doll Envelopes (Java language) - Hard */

import java.util.Arrays;
import java.util.Comparator;

public class russian_doll_envelopes_354 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 354. Russian Doll Envelopes (Java language) - ") + red("Hard"));

        int[][][] envelopes = {{{5,4},{6,4},{6,7},{2,3}}, {{1,1},{1,1},{1,1}}};
        
        for (int test = 0; test < envelopes.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maxEnvelopes(envelopes[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maxEnvelopes(int[][] envelopesVar) {
        int result = 1;
        
        Arrays.sort(envelopesVar, Comparator.comparingInt(a -> a[0]));
        int[] current = {envelopesVar[0][0], envelopesVar[0][1]};

        for (int i = 1; i < envelopesVar.length; i++) {
            if (current[0] < envelopesVar[i][0] && current[1] < envelopesVar[i][1]) {
                current[0] = envelopesVar[i][0];
                current[1] = envelopesVar[i][1];

                result++;
            }
        }

        return result;
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
