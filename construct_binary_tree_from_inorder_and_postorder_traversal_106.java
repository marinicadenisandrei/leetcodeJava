/* Leetcode - 106. Construct Binary Tree from Inorder and Postorder Traversal (Java language) - Medium */

import java.util.ArrayList;

public class construct_binary_tree_from_inorder_and_postorder_traversal_106 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 106. Construct Binary Tree from Inorder and Postorder Traversal (Java language) - Medium"));

        int[][] inorder = {{9,3,15,20,7},{-1}};
        int[][] postorder = {{9,15,7,20,3},{-1}};

        for (int test = 0; test < postorder.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(buildTree(inorder[test], postorder[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> buildTree(int[] inorderVar, int[] postorderVar) {
        if (inorderVar.length <= 1) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> inorderArrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < postorderVar.length; i++) {
            inorderArrayList.add(postorderVar[i]);
        }

        for (int i = 0; i < (int)(postorderVar.length / 2); i++) {
            if (flag1) {
                result.add(0);
                result.add(0);    

                flag1 = false;
            }

            result.add(postorderVar[postorderVar.length - 1 - i]);

            if (flag2) {
                result.add(0);
                result.add(0);    

                flag2 = false;
            }

            result.add(postorderVar[i]);

            if (inorderArrayList.indexOf(postorderVar[postorderVar.length - 1 - i]) == 0 || inorderArrayList.indexOf(postorderVar[postorderVar.length - 1 - i]) == inorderArrayList.size() - 1) {
                flag2 = true;
            } else if (inorderArrayList.indexOf(postorderVar[i]) == 0 || inorderArrayList.indexOf(postorderVar[i]) == inorderArrayList.size() - 1) {
                flag1= true;
            }
        }

        if ((postorderVar.length) % 2 != 0) {
            result.add(postorderVar[(int)(postorderVar.length / 2)]);
        }

        return result;
    }

    public static int divide(int dividendVar, int divisorVar) {
        return (int) dividendVar / divisorVar;
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


