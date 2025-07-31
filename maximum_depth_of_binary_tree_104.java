/* Leetcode - 104. Maximum Depth of Binary Tree (Java language) - Easy */

public class maximum_depth_of_binary_tree_104 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 104. Maximum Depth of Binary Tree (Java language) - ") + green("Easy"));
        int[][] root = {{3,9,20,0,0,15,7},{1,0,2}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxDepth(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxDepth(int[] rootVar) {
        int lenRootVar = rootVar.length;
        ;
        int starter = 1;
        int counter = 0;

        while (lenRootVar > 0) {
            lenRootVar -= starter;
            starter *= 2;
            counter++;
        }

        return counter;
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
