/* Leetcode - 5. Longest Palindromic Substring (Java language) - Medium */

public class longest_palindromic_substring_5 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 5. Longest Palindromic Substring (Java language) - Medium"));
        String[] s = {"babad","cbbd"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(longestPalindrome(s[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }   

    public static String longestPalindrome (String sVar) {
        String temp = "";
        String result = "";

        for (int i = 0; i < sVar.length(); i++) {
            for (int j = i; j < sVar.length(); j++) {
                temp += sVar.charAt(j);

                if (isPalindrome(temp) && result.length() < temp.length()) {
                    result = temp;
                } 
            }  
            
            temp = "";
        }

        return result;
    }

    public static boolean isPalindrome(String stringVar) {
        for (int i = 0; i < stringVar.length() / 2; i++) {
            if (stringVar.charAt(i) != stringVar.charAt(stringVar.length() - 1 - i)) {
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
