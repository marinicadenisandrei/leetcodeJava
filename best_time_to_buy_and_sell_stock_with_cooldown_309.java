/* Leetcode - 309. Best Time to Buy and Sell Stock with Cooldown (Java language) - Medium */

public class best_time_to_buy_and_sell_stock_with_cooldown_309 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 309. Best Time to Buy and Sell Stock with Cooldown (Java language) - Medium"));

        int[][] prices = {{1,2,3,0,2},{0}};
        
        for (int test = 0; test < prices.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maxProfit(prices[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maxProfit(int[] pricesVar) {
        int buy = pricesVar[0];
        int profit = 0;
        
        for (int i = 1; i < pricesVar.length - 1; i++) {
            if (buy < pricesVar[i] && pricesVar[i] > pricesVar[i + 1]) {
                profit += pricesVar[i - 1] - buy;
                buy = pricesVar[i + 1];
            } else if (i == pricesVar.length - 2 && buy < pricesVar[i + 1]) {
                profit += pricesVar[i + 1] - buy;
            }
        }

        return profit;
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