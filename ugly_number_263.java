/* Leetcode - 263. Ugly Number (Java language) - Easy */

public interface ugly_number_263 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 263. Ugly Number (Java language) - ") + green("Easy"));

        int[] n = {6,1,14};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isUgly(n[test]) + 
                " | " +
                green("Passed")
            );
        }
    } 

    public static boolean isUgly(int nVar) {
        while (nVar % 2 == 0) nVar /= 2;
        while (nVar % 3 == 0) nVar /= 3;
        while (nVar % 5 == 0) nVar /= 5;

        return nVar == 1;
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
