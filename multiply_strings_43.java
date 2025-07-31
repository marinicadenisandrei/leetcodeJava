/* Leetcode - 43. Multiply Strings (Java language) - Medium */

public class multiply_strings_43 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 43. Multiply Strings (Java language) - Medium"));
        
        String[] num1 = {"2","123"};
        String[] num2 = {"3","456"};

        for (int test = 0; test < num2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(multiply(num1[test], num2[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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
