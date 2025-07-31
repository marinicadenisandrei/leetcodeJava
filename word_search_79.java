/* Leetcode - 79. Word Search (Java language) - Medium */

public class word_search_79 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 79. Word Search (Java language) - Medium"));

        String[][][] board = {{{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}},{{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}},{{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}}}; 
        String[] word = {"ABCCED","SEE","ABCB"};

        for (int test = 0; test < word.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(exist(board[test], word[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static boolean exist(String[][] boardVar, String wordVar) {
        for (int i = 0; i < boardVar.length; i++) {
            for (int j = 0; j < boardVar[i].length; j++) {
                if (boardVar[i][j].charAt(0) == wordVar.charAt(0)) {
                    int index1 = i;
                    int index2 = j;
                    boolean flag = true;
                    boolean back = false;

                    for (int k = 1; k < wordVar.length(); k++) {

                        if (index2 - 1 >= 0 && back) {
                            if (boardVar[index1][index2 - 1].charAt(0) == wordVar.charAt(k)) {
                                index2--;
                                back = false;
                                continue;
                            }
                        }

                        if (index2 + 1 < boardVar[index1].length) {
                            if (boardVar[index1][index2 + 1].charAt(0) == wordVar.charAt(k)) {
                                index2++;
                                back = false;
                                continue;
                            }
                        }
                        
                        if (index1 + 1 < boardVar.length) {
                            if (boardVar[index1 + 1][index2].charAt(0) == wordVar.charAt(k)) {
                                index1++;
                                back = true;
                                continue;
                            }    
                        }
                        
                        flag = false;
                        break;
                    }

                    if (flag) {
                        return true;
                    }
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

