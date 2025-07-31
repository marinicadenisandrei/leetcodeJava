/* Leetcode - 101. Symmetric Tree (Java language) - Easy */

public class SymmetricTree_101 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 101. Symmetric Tree (Java language) - ") + green("Easy"));

        int[][] root = {{1,2,2,3,4,4,3}, {1,2,2,0,3,0,3}};

        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + green(": ")));
            System.out.print(isSymmetric(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isSymmetric(int[] rootVar) {
        int level = 0; 
        int n = rootVar.length; 
        
        while (Math.pow(2, level) - 1 < n) {
            int startIndex = (int) Math.pow(2, level) - 1; 
            int endIndex = Math.min((int) Math.pow(2, level + 1) - 2, n - 1);

            for (int i = startIndex; i <= (startIndex + endIndex) / 2; i++) {
                if (rootVar[i] != rootVar[endIndex - (i - startIndex)]) {
                    return false;   
                }
            }

            level++;
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
