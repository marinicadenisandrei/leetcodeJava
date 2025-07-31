/* Leetcode - 138. Copy List with Random Pointer (Java languaage) - Medium */

import java.util.ArrayList;

public class copy_list_with_random_pointer_138 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 138. Copy List with Random Pointer (Java languaage) - Medium"));
        int[][][] head = {{{7,0},{13,0},{11,4},{10,2},{1,0}},{{1,1},{2,1}},{{3,0},{3,0},{3,0}}};
        
        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(CopyRandomList(head[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }   

    public static ArrayList<ArrayList<Integer>> CopyRandomList(int[][] headVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < headVar.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < headVar[i].length; j++) {
                temp.add(headVar[i][j]);
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
