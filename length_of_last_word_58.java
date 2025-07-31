/* Leetcode - 58. Length of Last Word (Java language) - Easy */

public class length_of_last_word_58 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 58. Length of Last Word (Java language) ") + green("Easy"));
        
        String[] s = {"Hello World", "   fly me   to   the moon  ", "luffy is still joyboy"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(lengthOfLastWord(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int lengthOfLastWord(String sVar) {
        String[] words = sVar.split(" ");
        return words[words.length - 1].length();
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
    }

    public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
    }

    public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
    }

    public static String reset(String var0) {
        return "\u001b[0m" + var0;
    }
}
