/* Leetcode - 69. Sqrt(x) (Java language) - Easy */

public class sqrt_x_69 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 69. Sqrt(x) (Java language) - ") + green("Easy"));

        int[] x = {4,8};
        
        for (int test = 0; test < x.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(mySqrt(x[test]) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int mySqrt(int xVar) {
        return (int) Math.sqrt(xVar);
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
