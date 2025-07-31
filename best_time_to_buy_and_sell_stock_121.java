/* Leetcode - 121. Best Time to Buy and Sell Stock (Java language) - Easy */

public class best_time_to_buy_and_sell_stock_121 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 121. Best Time to Buy and Sell Stock (Java language) - ") + green("Easy"));

        int[][] prices = {{7,1,5,3,6,4},{7,6,4,3,1}};

        for (int test = 0; test < prices.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxProfit(prices[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxProfit(int[] pricesVar) {
        int profit = 0;

        for (int i = 0; i < pricesVar.length; i++) {
            for (int j = 0; j < pricesVar.length; j++) {
                profit = ((i < j && pricesVar[j] - pricesVar[i] > profit) ? pricesVar[j] - pricesVar[i] : profit);
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
