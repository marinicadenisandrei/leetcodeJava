/* Leetcode - 7. Reverse Integer (Java language) - Medium  */

public class reverse_integer_7 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 7. Reverse Integer (Java language) - Medium"));
        
        int[] x = {123,-123,120};

        for (int test = 0; test < x.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(reverse(x[test]) + " | "); 
            System.out.println(green("Passed"));  
        }
    }

    public static int reverse(int xVar) {
        String xString = String.valueOf(xVar);
        String reversed = ((xVar < 1) ? "-" : "");

        for (int i = xString.length() - 1; i >= ((xVar < 0) ? 1 : 0); i--) {
            reversed += xString.charAt(i);
        }

        return Integer.parseInt(reversed);
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
