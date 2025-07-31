/* Leetcode - 65. Valid Number (Java language) - Hard */

public class valid_number_65 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 65. Valid Number (Java language) - ") + red("Hard"));
        
        String[] s = {"0","e","."};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isNumber(s[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static boolean isNumber(String sVar) {
        try {
            Integer.parseInt(sVar);
            return true;
        } catch (NumberFormatException e) {
            return false; 
        }
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
