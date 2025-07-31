/* Leetcode - 130. Surrounded Regions (Java language) - Medium */

import java.util.Arrays;

public class surrounded_regions_130 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 130. Surrounded Regions (Java language) - Medium"));

        String[][][] board = {{{"X","X","X","X"},{"X","O","O","X"},{"X","X","O","X"},{"X","O","X","X"}},{{"X"}}};
        
        for (int test = 0; test < board.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            Solve(board[test]);
            System.out.print(Arrays.deepToString(board[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static void Solve(String[][] boardVar) {
        for (int i = 0; i < boardVar.length; i++) {
            for (int j = 0; j < boardVar[i].length; j++) {
                if (boardVar[i][j] == "O") {
                    if (i == 0 || j == 0 || i == boardVar.length - 1 || j == boardVar[i].length - 1) {
                        continue;
                    }

                    boolean vertical = false;
                    boolean orizontal = false;

                    for (int k = 0; k < boardVar.length; k++) {
                        if (boardVar[k][j] == "X") {
                            vertical = true;
                            break;
                        }
                    }
                    
                    for (int k = 0; k < boardVar[i].length; k++) {
                        if (boardVar[i][k] == "X") {
                            orizontal = true;
                            break;
                        }
                    }

                    if (vertical || orizontal) {
                        boardVar[i][j] = "X";
                    }
                }
            }   
        }
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
