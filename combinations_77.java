/* Leetcode - 77. Combinations (Java language) - Medium */

import java.util.ArrayList;

public class combinations_77 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 77. Combinations (Java language) - Medium"));
        int[] n = {4,1};
        int[] k = {2,1};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(combine(n[test], k[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> combine(int nVar, int kVar) {
        ArrayList<Integer> acumulation = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (nVar == 1) {
            result.add(new ArrayList<>(1));
            result.get(0).add(1);
            return result;
        }

        for (int i = 1; i <= nVar; i++) {
            acumulation.add(i);
        }

        for (int i = 0; i < acumulation.size(); i++) {
            for (int j = i + 1; j < acumulation.size(); j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(acumulation.get(i));
                temp.add(acumulation.get(j));
                result.add(temp);
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
