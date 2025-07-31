/* Leetcode - 213. House Robber II (Java language) - Medium  */

import java.util.Arrays;

public class house_robber_II_213 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 213. House Robber II (Java language) - Medium"));

        int[][] nums = {{2,3,2},{1,2,3,1},{1,2,3}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(rob(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int rob(int[] numsVar) {
        int result = 0;

        for (int i = 0; i < 2; i++) {
            int temp = 0;

            for (int j = i; j < numsVar.length - ((i == 0) ? 1 : 0); j+=2) {
                temp += numsVar[j];
            }

            result = ((result < temp) ? temp : result);
        }

        Arrays.sort(numsVar);

        return ((result < numsVar[numsVar.length - 1]) ? numsVar[numsVar.length - 1] : result);
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
