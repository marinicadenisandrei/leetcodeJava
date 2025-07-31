/* Leetcode - 113. Path Sum II (Java language) - Easy */

import java.util.ArrayList;

public class path_sum_II_113 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 113. Path Sum II (Java language) - Medium"));
        
        int[][] root = {{5,4,8,11,0,13,4,7,2,0,0,0,0,5,1},{1,2,3},{1,2,0}};
        int[] targetSum = {22,5,0};

        for (int test = 0; test < targetSum.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(hasPathSum(root[test], targetSum[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> hasPathSum(int[] rootVar, int targetSumVar) {
        ArrayList<ArrayList<Integer>> candidates = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int index = 0;
        int counter = 0;
        int step = 8;

        int depth = 0;
        int power = 1;

        while (power < rootVar.length) {
            depth++;
            power *= 2;
        }

        for (int i = 0; i < depth; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < depth * 2; j++) {   
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
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < candidates.size(); j++) {
                sumVar+= rootVar[candidates.get(j).get(i)]; 
                temp.add(rootVar[candidates.get(j).get(i)]);
            }

            if (sumVar == targetSumVar) {
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
