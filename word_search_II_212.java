/* Leetcode - 212. Word Search II (Java language) - Hard */

import java.util.Arrays;

public class word_search_II_212 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 212. Word Search II (Java language) - ") + red("Hard"));

        String[][][] board = {{{"o","a","a","n"},{"e","t","a","e"},{"i","h","k","r"},{"i","f","l","v"}},{{"a","b"},{"c","d"}}};
        String[][] words = {{"oath","pea","eat","rain"},{"abcd"}};

        for (int test = 0; test < words.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(findWords(board[test], words[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String[] findWords(String[][] boardVar, String[] wordsVar) {
        String[] result = new String[wordsVar.length];
        int resultSize = 0;

        int i = 0;
        int j = 0;
        

        for (int j2 = 0; j2 < wordsVar.length; j2++) {

            for (int k = 0; k < boardVar.length; k++) {
                for (int k2 = 0; k2 < boardVar[k].length; k2++) {
                    
                    if (boardVar[k][k2].charAt(0) == wordsVar[j2].charAt(0)) {
                        i = k;
                        j = k2;
                        int index = 1;
                        
                        while (index < wordsVar[j2].length()) {
                            if (j - 1 >= 0 && boardVar[i][j-1].charAt(0) == wordsVar[j2].charAt(index)) {
                                j--; index++; continue;
                            }

                            if (j + 1 < boardVar[i].length && boardVar[i][j+1].charAt(0) == wordsVar[j2].charAt(index)) {
                                j++; index++; continue;
                            }

                            if (i + 1 < boardVar.length && boardVar[i+1][j].charAt(0) == wordsVar[j2].charAt(index)) {
                                i++; index++; continue;
                            }

                            break;
                        }

                        if (index == wordsVar[j2].length()) {
                            result[resultSize++] = wordsVar[j2];
                            break;
                        }
                    }
                }
            }
        }

        result = Arrays.copyOf(result, resultSize);

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
