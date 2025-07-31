/* Leetcode - 83. Remove Duplicates from Sorted List (Java language) - Easy */

import java.util.ArrayList;

public class remove_duplicates_from_sorted_list_83 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 83. Remove Duplicates from Sorted List (Java language) - ") + green("Easy"));
        int[][] head = {{1,1,2},{1,1,2,3,3}};
        
        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(deleteDuplicates(head[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> deleteDuplicates(int[] headVar) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < headVar.length; i++) {
            if (!result.contains(headVar[i])) {
                result.add(headVar[i]);
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
