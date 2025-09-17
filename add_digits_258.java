/* Leetcode - 258. Add Digits (Java language) - Easy */

public class add_digits_258 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 258. Add Digits (Java language) - ") + green("Easy"));
        int[] num = {38,0};
        
        for (int test = 0; test < num.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                addDigits(num[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int addDigits(int numVar) {
        String numVarStr = String.valueOf(numVar);
        int result = 0;

        while (numVarStr.length() > 1) {
            result = 0;
            
            for (int i = 0; i < numVarStr.length(); i++) {
                int num = numVarStr.charAt(i) - '0';
                result += num;
            }

            numVarStr = String.valueOf(result);
        }

        return Integer.valueOf(result);
    }

    public static int strStr(String hayStackVar, String needleVar) {
        return hayStackVar.indexOf(needleVar);   
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
