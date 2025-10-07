/* Leetcode - 279. Perfect Squares (Java language) - Medium */

import java.util.ArrayList;
import java.util.Collections;

public class perfect_squares_279 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 279. Perfect Squares (Java language) - Medium"));

        int[] n = {12,13};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                numSquares(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int numSquares(int nVar) {
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int starter = 4;
        int firstCheck = 1;

        while (starter < nVar) {
            if (isPerfectSquare(starter)) {
                perfectSquares.add(starter);
            }

            starter++;
        }

        while (firstCheck < nVar / 2) {
            for (int i = 0; i < perfectSquares.size(); i++) {
                if (perfectSquares.get(i) * firstCheck == nVar) {
                    result = new ArrayList<>(Collections.nCopies(firstCheck, perfectSquares.get(i)));
                    return result.size();
                }
            }

            firstCheck++;
        }

        while (nVar > 0) {
            for (int i = perfectSquares.size() - 1; i >= 0; i--) {
                if (perfectSquares.get(i) <= nVar) {
                    nVar -= perfectSquares.get(i);
                    result.add(perfectSquares.get(i));
                }
            }
        }

        return result.size();
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int root = (int) Math.sqrt(num);
        return root * root == num;
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
