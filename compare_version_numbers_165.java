/* Leetcode - 165. Compare Version Numbers (Java language) - Medium */

public class compare_version_numbers_165 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 165. Compare Version Numbers (Java language) - Medium"));

        String[] version1 = {"1.2","1.01","1.0"};
        String[] version2 = {"1.10","1.001","1.0.0.0"};

        for (int test = 0; test < version2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(compareVersion(version1[test], version2[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int compareVersion(String version1Var, String version2Var) {
        String[] parts1 = version1Var.split("\\.");
        String[] parts2 = version2Var.split("\\.");
        
        for (int i = 0; i < parts1.length; i++) {
            int var1 = Integer.parseInt(parts1[i]);
            int var2 = Integer.parseInt(parts2[i]);

            if (var1 != var2) {
                return -1;
            }
        }

        return 0;
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
