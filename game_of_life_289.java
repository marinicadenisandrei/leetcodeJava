/* Leetcode - 289. Game of Life (Java language) - Medium */

import java.util.Arrays;

public class game_of_life_289 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 289. Game of Life (Java language) - Medium"));

        int[][][] board = {{{0,1,0},{0,0,1},{1,1,1},{0,0,0}},{{1,1},{0,0}}};
        
        for (int test = 0; test < board.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.deepToString(gameOfLife(board[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int[][] gameOfLife(int[][] boardVar) {
        int rows = boardVar.length;
        int cols = boardVar[0].length;

        int[][] copyBoardVar = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            copyBoardVar[i] = boardVar[i].clone();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int[] cells = new int[8];
                int cellsSize = 0;

                if (i - 1 >= 0 && j - 1 >= 0) {
                    cells[cellsSize++] = boardVar[i - 1][j - 1];
                }
                if (j - 1 >= 0) {
                    cells[cellsSize++] = boardVar[i][j - 1];
                }
                if (i + 1 < rows && j - 1 >= 0) {
                    cells[cellsSize++] = boardVar[i + 1][j - 1];
                }
                if (i + 1 < rows) {
                    cells[cellsSize++] = boardVar[i + 1][j];
                }
                if (i + 1 < rows && j + 1 < cols) {
                    cells[cellsSize++] = boardVar[i + 1][j + 1];
                }
                if (j + 1 < cols) {
                    cells[cellsSize++] = boardVar[i][j + 1];
                }
                if (j + 1 < cols && i - 1 >= 0) {
                    cells[cellsSize++] = boardVar[i - 1][j + 1];
                }
                if (i - 1 >= 0) {
                    cells[cellsSize++] = boardVar[i - 1][j];
                }

                int live = 0;
                for (int k = 0; k < cellsSize; k++) {
                    if (cells[k] == 1) live++;
                }

                int curr = boardVar[i][j];

                if (curr == 1) {
                    copyBoardVar[i][j] = (live == 2 || live == 3) ? 1 : 0;
                } else {
                    copyBoardVar[i][j] = (live == 3) ? 1 : 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            System.arraycopy(copyBoardVar[i], 0, boardVar[i], 0, cols);
        }

        return copyBoardVar;
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
