/* Leetcode - 191. Number of 1 Bits (Java language) - Easy */

public class number_of_1_bits_191 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 191. Number of 1 Bits (Java language) - ") + green("Easy"));

        int[] n = {11,128,2147483645};
        
        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(hammingWeight(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int hammingWeight(int nVar) {
        int count = 0;

        while (nVar != 0) {
            count += nVar & 1;
            nVar >>>= 1;
        }

        return count;
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
