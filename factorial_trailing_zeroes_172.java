/* Leetcode - 172. Factorial Trailing Zeroes (Java language) - Medium */

public class factorial_trailing_zeroes_172 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 172. Factorial Trailing Zeroes (Java language) - Medium"));

        int[] n = {3,5,0};
        
        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(trailingZeroes(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int trailingZeroes(int nVar) {
        int fact = 1;
        int result = 0;
        
        for (int i = 1; i <= nVar; i++) {
            fact *= i;
            result += Integer.toString(fact).chars()
                        .filter(ch -> ch == '0')
                        .count();
        }

        return result;
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
     }
  
     public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
     }
  
     public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
     }
  
     public static String reset(String var0) {
        return "\u001b[0m" + var0;
     }
}
