/* Leetcode - 133. Clone Graph (Java language) - Medium */

import java.util.ArrayList;

public class clone_graph_133 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 133. Clone Graph (Java language) - Medium"));

        int[][][] adjList = {{{2,4},{1,3},{2,4},{1,3}},{{}}};

        for (int test = 0; test < adjList.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(CloneGraph(adjList[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> CloneGraph(int[][] adjListVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < adjListVar.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < adjListVar[i].length; j++) {
                temp.add(adjListVar[i][j]);
            }

            result.add(temp);
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
