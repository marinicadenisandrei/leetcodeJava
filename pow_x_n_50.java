/* Leetcode - 50. Pow(x, n) (Java language) - Medium */

public class pow_x_n_50 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 50. Pow(x, n) (Java language) - Medium"));
        double[] x = {2.00000, 2.10000, 2.00000};
        int[] n = {10,3,-2};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(myPow(x[test], n[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static double myPow(double xVar, int nVar) {
        double result = 1;
        boolean sign = false;

        if (nVar < 0) {
            sign = true;
            nVar *= -1;
        }

        while (nVar > 0) {
            result *= xVar;
            nVar--;
        }

        if (sign) {
            return 1 / result; 
        }

        return result;
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

