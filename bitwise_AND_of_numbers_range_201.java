/* Leetcode - 201. Bitwise AND of Numbers Range (Java language) - Medium */

public class bitwise_AND_of_numbers_range_201 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 201. Bitwise AND of Numbers Range (Java language) - Medium"));

        int[] left = {5,0,1};
        int[] right = {7,0,2147483647};

        for (int test = 0; test < right.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(rangeBitwiseAnd(left[test], right[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int rangeBitwiseAnd(int leftVar, int rightVar) {
        int shift = 0;

        while (leftVar < rightVar) {
            leftVar  >>= 1;
            rightVar >>= 1;
            shift++;
        }

        return leftVar << shift;
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
