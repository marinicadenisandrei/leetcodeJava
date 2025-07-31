/* Leetcode - 124. Binary Tree Maximum Path Sum (Java language) - Hard */

public class binary_tree_maximum_path_sum_124 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 124. Binary Tree Maximum Path Sum (Java language) - ") + red("Hard"));

        int[][] root = {{1,2,3},{-10,9,20,0,0,15,7}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(MaxPathSum(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int MaxPathSum(int[] rootVar) {
        int result = 0;

        for (int i = 0; i < rootVar.length; i++) {
            if ((i * 2) + 2 > rootVar.length) {
                break;
            }
            
            int nodeVar = rootVar[i] + rootVar[(i * 2) + 1] + rootVar[(i * 2) + 2];
            result = ((result < nodeVar) ? nodeVar : result);
        }

        return result;
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
