/* Leetcode - 14. Longest Common Prefix (Java language) - Easy */

public class longest_common_prefix_14 {
    public static void main(String[] args) {
        System.out.print(yellow("Leetcode - 14. Longest Common Prefix (Java language) - "));
        System.out.println(green("Easy"));
        
        String[][] strs = {{"flower","flow","flight"},{"dog","racecar","car"}};

        for (int test = 0; test < strs.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(longestCommonPrefix(strs[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String longestCommonPrefix(String[] strsVar) {
        int minString = Integer.MAX_VALUE;

        for (int i = 0; i < strsVar.length; i++) {
            minString = ((strsVar[i].length() < minString) ? strsVar[i].length() : minString);
        }

        for (int i = minString; i >= 0 ; i--) {
            String subStringTemp = strsVar[0].substring(0, i);
            Boolean flag = true;


            for (int j = 0; j < strsVar.length; j++) {
                if (!strsVar[j].substring(0, i).equals(subStringTemp)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return subStringTemp;
            }
        }

        return "";
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
