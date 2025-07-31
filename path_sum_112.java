/* Leetcode - 112. Path Sum (Java language) - Easy */

import java.util.ArrayList;

public class path_sum_112 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 112. Path Sum (Java language) - ") + green("Easy"));
        
        int[][] root = {{5,4,8,11,0,13,4,7,2,0,0,0,1},{1,2,3},{}};
        int[] targetSum = {22,5,0};

        for (int test = 0; test < targetSum.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(hasPathSum(root[test], targetSum[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean hasPathSum(int[] rootVar, int targetSumVar) {
        ArrayList<ArrayList<Integer>> candidates = new ArrayList<>();

        int index = 0;
        int counter = 0;
        int step = 8;

        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < 8; j++) {   
                temp.add(index);
                counter++;

                if (counter == step) {
                    counter = 0;
                    index++;
                }
            }

            step /= 2;
            candidates.add(temp);
        }

        for (int i = 0; i < candidates.get(0).size(); i++) {
            int sumVar = 0;

            for (int j = 0; j < candidates.size(); j++) {
                sumVar+= candidates.get(j).get(i); 
            }

            if (sumVar == targetSumVar) {
                return true;
            }
        }

        return false;
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
