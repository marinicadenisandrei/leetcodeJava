/* Leetcode - 313. Super Ugly Number (Java language) - Medium */

public class super_ugly_number_313 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 313. Super Ugly Number (Java language) - Medium"));

        int[] n = {12,1};
        int[][] primes = {{2,7,13,19},{2,3,5}};

        for (int test = 0; test < primes.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                nthSuperUglyNumber(n[test], primes[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int nthSuperUglyNumber(int nVar, int[] primesVar) {
        int[] candidates = new int[nVar];
        int candidatesSize = 0;
        int i = 1;

        while (candidatesSize < nVar) {
            int temp = i;
            Boolean flag = true;

            while (flag) {
                flag = false;

                for (int j = 0; j < primesVar.length; j++) {
                    if (temp % primesVar[j] == 0) {
                        temp /= primesVar[j];
                        flag = true;
                    }
                }
            }

            if (temp == 1) {
                candidates[candidatesSize++] = i;
            }

            i++;
        }

        return candidates[candidatesSize - 1];
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

