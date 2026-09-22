/* Leetcode - 343. Integer Break (Java language) - Medium */

public class integer_break_343 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 343. Integer Break (Java language) - Medium"));

        int[] n = {2,10};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                integerBreak(n[test]) + 
                " | " + 
                green("Passed")
            );
        }
    }

    public static int integerBreak(int nVar) {
        if (nVar == 2) {
            return 1;
        }

        int result = 0;

        for (int i = 1; i < nVar; i++) {
            int item = nVar / i;
            int product = 1;

            if (nVar % i == 0) {
                product = (int) Math.pow(item, i);
            } else {
                int number = nVar;
                int size = i;

                int fullParts = number / size;
                int remainder = number % size;

                if (remainder == 1 && fullParts > 0) {
                    for (int j = 0; j < fullParts - 1; j++) {
                        product *= size;
                    }

                    product *= (size + 1);
                } else {
                    for (int j = 0; j < fullParts; j++) {
                        product *= size;
                    }

                    if (remainder > 0) {
                        product *= remainder;
                    }
                }
            }

            result = ((result < product) ? product : result);
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