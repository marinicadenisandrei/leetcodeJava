/* Leetcode - 278. First Bad Version (Java language) - Easy */

public class first_bad_version_278 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 278. First Bad Version (Java language) - ") + green("Easy"));

        int[] n = {5,1};
        int[] bad = {4,1};
        
        for (int test = 0; test < bad.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                firstBadVersion(n[test], bad[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int firstBadVersion(int nVar, int badVar) {
        return (badVar <= nVar) ? badVar : -1;
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
