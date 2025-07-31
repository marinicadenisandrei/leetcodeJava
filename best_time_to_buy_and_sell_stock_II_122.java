/* Leetcode - 122. Best Time to Buy and Sell Stock II (Java language) - Medium */

public class best_time_to_buy_and_sell_stock_II_122 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 122. Best Time to Buy and Sell Stock II (Java language) - Medium"));

        int[][] prices = {{7,1,5,3,6,4},{1,2,3,4,5},{7,6,4,3,1}};
        
        for (int test = 0; test < prices.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxProfit(prices[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxProfit(int[] pricesVar) {
        int starter = pricesVar[0];
        int indexStarter = 0;
        int profit = 0;
        boolean ascending = true;
        
        for (int i = 0; i < pricesVar.length - 1; i++) {
            if (pricesVar[i] > pricesVar[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            return pricesVar[pricesVar.length - 1] - pricesVar[0];
        }

        for (int i = 0; i < pricesVar.length; i++) {
            indexStarter = ((starter > pricesVar[i]) ? i : indexStarter);
            starter = ((starter > pricesVar[i]) ? pricesVar[i] : starter);
        }
        
        for (int i = indexStarter; i < pricesVar.length - 1; i++) {
            if (pricesVar[i] > pricesVar[i + 1]) {
                profit += pricesVar[i] - starter;
                starter = pricesVar[i + 1];
                continue;
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
