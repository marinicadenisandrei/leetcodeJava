/* Leetcode - 322. Coin Change (Java language) - Medium */

public class coin_change_322 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 322. Coin Change (Java language) - Medium"));
        
        int[][] coins = {{1,2,5},{2},{1}}; 
        int[] amount = {11,3,0};

        for (int test = 0; test < amount.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                coinChange(coins[test], amount[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int coinChange(int[] coinsVar, int amountVar) {
        int cursor = -1;
        int result = 0;

        if (amountVar == 0) {
            return 0;
        }

        for (int i = coinsVar.length - 1; i >= 0; i--) {
            if (coinsVar[i] <= amountVar) {
                cursor = i;
                break;
            }
        }

        if (cursor == -1) {
            return -1;
        }

        while (amountVar >= 0 && cursor >= 0) {
            if (coinsVar[cursor] <= amountVar) {
                amountVar -= coinsVar[cursor];
                result++;
            }
            else {
                cursor--;
            }
        }

        if (amountVar == 0) {
            return result;
        }

        return -1;
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
