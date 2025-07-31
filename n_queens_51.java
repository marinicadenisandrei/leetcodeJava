/* Leetcode - 51. N-Queens (Java language) - Hard */

import java.util.Arrays;

public class n_queens_51 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 51. N-Queens (Java language) - ") + red("Hard"));
        int[] n = {4,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(solveNQueens(n[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String[][] solveNQueens(int nVar) {
        String[][] board = new String[nVar][nVar];
        String[][] copyBoard = new String[nVar][nVar];
        
        String[][] finalBoards = new String[nVar][nVar];
        int finalBoardsSize = 0;

        if (nVar == 1) {
            finalBoards[finalBoardsSize++][0] = "Q";
            finalBoards = Arrays.copyOf(finalBoards, finalBoardsSize);
        }

        for (int i = 0; i < nVar; i++) {
            copyBoard[i] = Arrays.copyOf(board[i], nVar);
        }

        for (int i = 0; i < nVar; i++) {
            int[][] indexValid = new int[nVar][2];
            int indexValidSize = 0;
            boolean flag = false;
            
            board[0][i] = "Q";

            indexValid[indexValidSize][0] = 0;
            indexValid[indexValidSize++][1] = i;

            blockPaths(board, 0, i);

            for (int j = 1; j < nVar; j++) {
                flag = false;

                for (int j2 = 0; j2 < board[j].length; j2++) {
                    if (board[j][j2] == null) {
                        board[j][j2] = "Q";
                        flag = true;

                        indexValid[indexValidSize][0] = j;
                        indexValid[indexValidSize++][1] = j2;

                        blockPaths(board, j, j2);
                        break;
                    }
                }

                if (!flag) {
                    break;
                }
            }

            if (flag) {
                for (int j = 0; j < indexValid.length; j++) {
                    String temp = "....";
                    StringBuilder tempBuilder = new StringBuilder(temp);
                    tempBuilder.setCharAt(indexValid[j][1], 'Q');
                    temp = tempBuilder.toString();
                    
                    finalBoards[finalBoardsSize][j] = temp;
                }

                finalBoardsSize++;
            }

            for (int j = 0; j < nVar; j++) {
                board[j] = Arrays.copyOf(copyBoard[j], nVar);
            }
        }

        finalBoards = Arrays.copyOf(finalBoards, finalBoardsSize);

        return finalBoards;
    }

    public static void blockPaths(String[][] boardVar, int iVar, int jVar) {
        for (int i = 0; i < boardVar.length; i++) {
            boardVar[i][jVar] = "X";
        }

        for (int i = 0; i < boardVar[0].length; i++) {
            boardVar[iVar][i] = "X";
        }

        for (int i = 1; i < boardVar.length; i++) {
            if (iVar + i == boardVar.length || jVar + i == boardVar.length) {
                break;
            }

            boardVar[iVar + i][jVar + i] = "X";
        }

        for (int i = 1; i < boardVar.length; i++) {
            if (iVar - i < 0 || jVar - i < 0) {
                break;
            }

            boardVar[iVar - i][jVar - i] = "X";
        }

        for (int i = 1; i < boardVar.length; i++) {
            if (iVar - i < 0 || jVar + i == boardVar.length) {
                break;
            }

            boardVar[iVar - i][jVar + i] = "X";
        }

        for (int i = 1; i < boardVar.length; i++) {
            if (iVar + i == boardVar.length || jVar - i < 0) {
                break;
            }

            boardVar[iVar + i][jVar - i] = "X";
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