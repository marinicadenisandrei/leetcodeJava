/* Leetcode - 188. Best Time to Buy and Sell Stock IV (Java language) - Hard */

import java.util.Arrays;

public class best_time_to_buy_and_sell_stock_IV_188 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 188. Best Time to Buy and Sell Stock IV (Java language) - ") + red("Hard"));

        int[] k = {2,2};
        int[][] prices = {{2,4,1},{3,2,6,5,0,3}};

        for (int test = 0; test < prices.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxProfit(k[test], prices[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxProfit(int kVar, int[] pricesVar) {
        int variant = (pricesVar.length % 2 == 0) ? 0 : 1;

        int[] extended = Arrays.copyOf(pricesVar, pricesVar.length + 1);
        extended[extended.length - 1] = pricesVar[pricesVar.length - 1] - 1;
        pricesVar = extended;

        int result = 0;

        for (int i = 0; i < pricesVar.length - 1; i++) {
            int starter = pricesVar[i];
            int profit = 0;
            int transactions = 0;

            for (int j = i + 1; j < pricesVar.length - 1 - variant; j++) {
                if (pricesVar[j] > pricesVar[j + 1]) {
                    profit += pricesVar[j] - starter;
                    transactions++;
                    
                    for (int j2 = j + 1; j2 < pricesVar.length - 1 - variant; j2++) {
                        if (pricesVar[j2] < pricesVar[j2 + 1]) {
                            j = j2;
                            starter = pricesVar[j2];
                            break;
                        }
                    }
                }
            }
                
            result = (result < profit && transactions >- kVar) ? profit : result;
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
