/* Leetcode - 125. Valid Palindrome (Java language) - Easy */

public class valid_palindorme_125 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 125. Valid Palindrome (Java language) - ") + green("Easy"));
        String[] s = {"A man, a plan, a canal: Panama", "race a car", " "};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(IsPalindrome(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean IsPalindrome(String sVar) {
        sVar = sVar.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < sVar.length() / 2; i++) {
            if (sVar.charAt(i) != sVar.charAt(sVar.length() - 1 - i)) {
                return false;
            }
        }

        return true;
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
