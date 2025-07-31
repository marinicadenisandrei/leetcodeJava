/* Leetcode - 214. Shortest Palindrome (Java language) - Hard */

public class shortest_palindrome_214 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 214. Shortest Palindrome (Java language) - ") + red("Hard"));

        String[] s = {"aacecaaa","abcd"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(shortestPalindrome(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String shortestPalindrome(String sVar) {
        boolean flag = true;

        while (flag) {
            flag = false;

            int i = 0;
            int j = sVar.length() - 1;

            while (i < j) {
                if (sVar.charAt(i) != sVar.charAt(j)) {
                    StringBuilder sb = new StringBuilder(sVar);
                    sb.insert(i, sVar.charAt(j));
                    sVar = sb.toString();

                    if (!flag) {flag = true;}
                    break;
                }

                i++;
                j--;
            }
        }

        return sVar;
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
