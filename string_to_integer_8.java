/* Leetcode - 8. String to Integer (atoi) (Java language) - Medium */

public class string_to_integer_8 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 8. String to Integer (atoi) (Java language) - Medium"));

        String[] s = {"42","-042","1337c0d3","0-1"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(myAtoi(s[test]) + " | ");
            System.out.println(green("Passed"));    
        }
    }

    public static int myAtoi(String sVar) {
        for (int i = ((sVar.charAt(0) == '-') ? 1 : 0); i < sVar.length(); i++) {
            if (!Character.isDigit(sVar.charAt(i))) {
                sVar = sVar.substring(0, i);
                break;
            }
        }

        return Integer.parseInt(sVar);
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
