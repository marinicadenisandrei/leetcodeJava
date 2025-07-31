/* Leetcode - 190. Reverse Bits (Java language) - Easy */

public class reverse_bits_190 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 190. Reverse Bits (Java language) - ") + green("Easy"));

        int[] n = {
        0b00000010100101000001111010011100,
        (int)0b11111111111111111111111111111101L
        };

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(reverseBits(n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }

        return result;
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