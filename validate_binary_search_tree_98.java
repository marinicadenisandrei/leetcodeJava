/* Leetcode - 98. Validate Binary Search Tree (Java language) - Medium */

public class validate_binary_search_tree_98 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 98. Validate Binary Search Tree (Java language) - Medium"));
        int[][] root = {{2,1,3},{5,1,4,0,0,3,6}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isValidBST(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isValidBST(int[] rootVar) {
        for (int i = 0; i < rootVar.length; i++) {
            if (((i * 2) + 1) > rootVar.length - 1) {
                break;
            }

            if (rootVar[(i * 2) + 1] > rootVar[i] || rootVar[i] > rootVar[(i * 2) + 2]) {
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
