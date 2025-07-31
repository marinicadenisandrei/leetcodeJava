/* Leetcode - 139. Word Break (Java language) - Medium */

public class word_break_139 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 139. Word Break (Java language) - Medium"));

        String[] s = {"leetcode","applepenapple","catsandog"};
        String[][] wordDict = {{"leet","code"},{"apple","pen"},{"cats","dog","sand","and","cat"}};

        for (int test = 0; test < wordDict.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(WordBreak(s[test], wordDict[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean WordBreak(String sVar, String[] wordDictVar) {
        for (int i = 0; i < wordDictVar.length; i++) {
            sVar = sVar.replace(wordDictVar[i], "");
        }

        return "".compareTo(sVar) == 0;
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
