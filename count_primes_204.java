/* Leetcode - 204. Count Primes (Java language) - Medium */

public class count_primes_204 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 204. Count Primes (Java language) - Medium"));

        int[] n = {10,0,1};
        
        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(countPrimes(n[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int countPrimes(int nVar) {
        int counter = 0;

        for (int i = 2; i < nVar; i++) {
            counter += ((isPrime(i)) ? 1 : 0);
        }

        return counter;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
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
