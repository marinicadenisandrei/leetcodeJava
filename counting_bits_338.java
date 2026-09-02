/* Leetcode - 338. Counting Bits (Java language) - Easy */

import java.util.Arrays;

public class counting_bits_338 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 338. Counting Bits (Java language) - ") + green("Easy"));

        int[] n = {2,5};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(countBits(n[test])) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] countBits(int nVar) {
        int[] result = new int[nVar + 1];
        for (int i = 0; i <= nVar; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
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