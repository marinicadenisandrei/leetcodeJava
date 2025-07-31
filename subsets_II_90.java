/* Leetcode - 90. Subsets II (Java language) - Medium */

import java.util.ArrayList;

public class subsets_II_90 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 90. Subsets II (Java language) - Medium"));

        int[][] nums = {{1,2,2},{0}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(subsetsWithDup(nums[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] numsVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < numsVar.length - (numsVar.length == 1 ? 0 : 1); i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = i; j < numsVar.length; j++) {
                temp.add(numsVar[j]);
                result.add(new ArrayList<>(temp));
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
