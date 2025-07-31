/* Leetcode - 62. Unique Paths (Java language) - Medium */

public class unique_paths_62 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 62. Unique Paths (Java language) - Medium"));
        
        int[] m = {3,3};
        int[] n = {7,2};
        
        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(uniquePaths(m[test], n[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int uniquePaths(int mVar, int nVar) {
        int[][] board = new int[mVar][nVar];

        for (int i = 0; i < board.length; i++) {
            board[i][nVar - 1] = 1;
        }

        for (int i = 0; i < board[0].length; i++) {
            board[mVar - 1][i] = 1;
        }

        for (int i = mVar - 2; i >= 0; i--) {
            for (int j = nVar - 2; j >= 0; j--) {
                board[i][j] = board[i + 1][j] + board[i][j + 1];
            }
        }

        return board[0][0];
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
