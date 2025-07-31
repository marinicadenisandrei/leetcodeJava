/* Leetcode - 216. Combination Sum III (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 216. Combination Sum III (Java language) - Medium"));

        int[] k = {3,3,4};
        int[] n = {7,9,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(combinationSum3(k[test], n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);

        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> combination, int k, int remainingSum, int start) {
        if (combination.size() > k || remainingSum < 0) {
            return;
        }

        if (combination.size() == k && remainingSum == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= 9; i++) {
            combination.add(i); 
            backtrack(result, combination, k, remainingSum - i, i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    public static String red(String var0) {
      return "\u001b[31m" + var0 + "\u001b[0m";
   }

   public static String yellow(String var0) {
      return "\u001b[33m" + var0 + "\u001b[0m";
   }

   public static String green(String var0) {
      return "\u001b[32m" + var0 + "\u001b[0m";
   }

   public static String reset(String var0) {
      return "\u001b[0m" + var0;
   }
}