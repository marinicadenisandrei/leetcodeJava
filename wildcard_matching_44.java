/* Leetcode - 44. Wildcard Matching (Java language) - Hard */

public class wildcard_matching_44 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 44. Wildcard Matching (Java language) - ") + red("Hard"));

        String[] s = {"aa", "aa", "cb"};
        String[] p = {"a", "*", "?a"};
        
        for (int test = 0; test < p.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isMatch(s[test], p[test]) + " | ");  
            System.out.println(green("Passed")); 
        }
    }

    public static Boolean isMatch(String sVar, String pVar) {
        if (pVar == "*") {
            return true;
        }
        else if (sVar.indexOf('?') == -1) {
            if (sVar.indexOf('*') == -1 && sVar.length() != pVar.length()) {
                return false;
            }
        }

        for (int i = 0; i < sVar.length(); i++) {
            if (sVar.charAt(i) != pVar.charAt(i) && pVar.charAt(i) == '*') {
                sVar = sVar.substring(0, i) + sVar.substring(sVar.indexOf(pVar.charAt(i + 1), i + 1));
                pVar = pVar.substring(0, i) + pVar.substring(i + 1);
            }
            else if (sVar.charAt(i) != pVar.charAt(i) && (pVar.charAt(i) == '?' || pVar.charAt(i) == '.'))
            {
                continue;
            }
            else if (sVar.charAt(i) != pVar.charAt(i)) {
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
