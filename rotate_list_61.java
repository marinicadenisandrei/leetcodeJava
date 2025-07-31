/* Leetcode - 61. Rotate List (Java language) - Medium */

import java.util.ArrayList;

public class rotate_list_61 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 61. Rotate List (Java language) - Medium"));

        int[][] head = {{1,2,3,4,5},{0,1,2}}; 
        int[] k = {2,4};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(rotateRight(head[test], k[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<Integer> rotateRight(int[] headVar, int kVar) {
        ArrayList<Integer> headVarArray = new ArrayList<>();

        for (int i = 0; i < headVar.length; i++) {
            headVarArray.add(headVar[i]);
        }

        while (kVar > 0) {
            headVarArray.add(0, headVarArray.get(headVar.length - 1));
            headVarArray.remove(headVar.length);
            kVar--;
        }

        return headVarArray;
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
