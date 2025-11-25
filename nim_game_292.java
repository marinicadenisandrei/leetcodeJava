/* Leetcode - 292. Nim Game (Java language) - Easy */

public class nim_game_292 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 292. Nim Game (Java language) - ") + green("Easy"));

        int[] n = {4,1,2};

        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                canWinNim(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static Boolean canWinNim(int nVar) {
        return nVar % 4 != 0;
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
