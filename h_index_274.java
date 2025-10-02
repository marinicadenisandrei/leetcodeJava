/* Leetcode - 274. H-Index (Java language) - Medium */

import java.util.Arrays;

public class h_index_274 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 274. H-Index (Java language) - Medium"));

        int[][] citations = {{3,0,6,1,5},{1,3,1}};
        
        for (int test = 0; test < citations.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                hIndex(citations[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int hIndex(int[] citationsVar) {
        Arrays.sort(citationsVar);
        int n = citationsVar.length;
        int h = 0;
        
        for (int i = 0; i < n; i++) {
            int papersWithAtLeast = n - i;  
            if (citationsVar[i] >= papersWithAtLeast) {
                h = papersWithAtLeast;
                break;
            }
        }
        return h;
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
