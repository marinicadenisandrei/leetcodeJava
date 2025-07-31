/* Leetcode - 166. Fraction to Recurring Decimal (Java language) - Medium */

public class fraction_to_recurring_decimal_166 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 166. Fraction to Recurring Decimal (Java language) - Medium"));

        int[] numerator = {1,2,4};
        int[] denominator = {2,1,333};

        for (int test = 0; test < denominator.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(fractionToDecimal(numerator[test], denominator[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }   

    public static String fractionToDecimal(int numeratorVar, int denominatorVar) {
        float result = (float) numeratorVar / denominatorVar; 
        
        return Float.toString(result);
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
