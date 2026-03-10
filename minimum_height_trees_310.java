/* Leetcode - 310. Minimum Height Trees (Java language) - Medium */

import java.util.Arrays;

public class minimum_height_trees_310 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 310. Minimum Height Trees (Java language) - Medium"));
        
        int[] n = {4,6};
        int[][][] edges = {{{1,0},{1,2},{1,3}},{{3,0},{3,1},{3,2},{3,4},{5,4}}};
        
        for (int test = 0; test < edges.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(findMinHeightTrees(n[test], edges[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] findMinHeightTrees(int nVar, int[][] edgesVar) {
        int height = 1;
        int root = edgesVar[0][0];
        int[] lastNode = new int[2]; 

        for (int i = 0; i < edgesVar.length; i++) {
            if (edgesVar[i][0] != root && edgesVar[i - 1][1] == edgesVar[i][1]) {
                height++;
                lastNode = edgesVar[i - 1];
            }
        }

        return (height == 1) ? new int[]{root} : lastNode;
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
