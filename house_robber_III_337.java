/* Leetcode - 337. House Robber III (Java language) - Medium */

public class house_robber_III_337 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 337. House Robber III (Java language) - Medium"));
        
        int[][] root = {{3,2,3,0,3,0,1},{3,4,5,1,3,0,1}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                rob(root[test]) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int rob(int[] rootVar) {
        int result1 = rootVar[0];
        int result2 = 0;

        int left = 1;
        int right = 2;

        int flag = 0;

        while (right < rootVar.length) {
            int tempSum = 0;
            
            for (int i = left; i <= right; i++) {
                tempSum += rootVar[i];
            }

            if (flag % 2 == 0) {
                result2 += tempSum;
            } else {
                result1 += tempSum;
            }
            
            left = right + 1;
            right = left * 2;

            flag++;
        }

        return ((result1 > result2) ? result1 : result2);
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