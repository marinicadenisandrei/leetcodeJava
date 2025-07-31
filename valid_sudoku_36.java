/* Leetcode - 36. Valid Sudoku (Java language) - Medium  */

public class valid_sudoku_36 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 36. Valid Sudoku (Java language) - Medium"));
        
        String[][][] board = 
        {{{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}}, 
        {{"8","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}}};

        for (int test = 0; test < board.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isValidSudoku(board[test]) + " | " );   
            System.out.println(green("Passed"));
        }
    }

    public static boolean isValidSudoku(String[][] boardVar) {
        for (int i = 0; i < boardVar.length; i++) {
            for (int j = 0; j < boardVar[i].length; j++) {
                if (boardVar[i][j] != ".") {
                    for (int k = 0; k < boardVar[i].length; k++) {
    
                        if (boardVar[i][k] == boardVar[i][j] && k != j) {
                            return false;
                        }
                    }
    
                    for (int k = 0; k < boardVar.length; k++) {
                        if (boardVar[k][j] == boardVar[i][j] && k != i) {
                            return false;
                        }
                    }
                    
                    if (duplicateInSquare(boardVar, i, j, boardVar[i][j])) {
                        return false;   
                    }
                }
            }
        }

        return true;
    }

    public static boolean duplicateInSquare(String[][] boardVar, int i, int j, String candidate) {
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
    
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                if (candidate == boardVar[row][col] && row != i && col != j) {
                   return true; 
                }
            }
        }

        return false;
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