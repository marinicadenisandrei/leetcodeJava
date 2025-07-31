/* Leetcode - 132. Palindrome Partitioning II (Java language) - Hard */

public class palindrome_partitioning_II_132 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 132. Palindrome Partitioning II (Java language) - ") + red("Hard"));

        String[] s = {"aab","a","ab"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(MinCut(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int MinCut(String sVar) {
        if (sVar.length() <= 1) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < sVar.length(); i++) {
            int cut = 1;
            String temp = sVar.substring(0, i);

            for (int j = i + 1; j <= sVar.length(); j++) {
                if (isPal(sVar.substring(i, j))) {
                    cut++;
                }
                else
                {
                    cut = result + 1;
                    break;
                }
            }

            if (isPal(temp)) {
                result = ((result > cut || result == 0) ? cut : result);
            }
        }

        return result;
    }

    public static boolean isPal(String stringVar) {
        for (int i = 0; i < stringVar.length() / 2; i++) {
            if (stringVar.charAt(i) != stringVar.charAt(stringVar.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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
