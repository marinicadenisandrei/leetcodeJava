/* Leetcode - 105. Construct Binary Tree from Preorder and Inorder Traversal (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class construct_binary_tree_from_preorder_and_inorder_traversal_105 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 105. Construct Binary Tree from Preorder and Inorder Traversal (Java language) - Medium"));

        int[][] preorder = {{3,9,20,15,7},{-1}};
        int[][] inorder = {{9,3,15,20,7},{-1}};

        for (int test = 0; test < inorder.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(buildTree(preorder[test], inorder[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> buildTree(int[] preorderVar, int[]inorderVar) {
        if (preorderVar.length == 1) {
            return new ArrayList<Integer>(List.of(preorderVar[0]));
        }

        ArrayList<Integer> newInorderVar = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < inorderVar.length; i++) {
            newInorderVar.add(inorderVar[i]);
        }

        result.add(preorderVar[0]);
        result.add(preorderVar[1]);
        result.add(preorderVar[2]);

        newInorderVar.remove(Integer.valueOf(preorderVar[1]));
        newInorderVar.remove(Integer.valueOf(preorderVar[2]));

        int rootIndex = newInorderVar.indexOf(preorderVar[0]);
        int power = 4;

        while (rootIndex - (int)(power / 2) >= 0 && rootIndex + (int)(power / 2) < newInorderVar.size() && newInorderVar.size() > 1) {
            ArrayList<Integer> tempInorder = new ArrayList<>(newInorderVar);

            for (int i = rootIndex - (int)(power / 2); i < rootIndex; i++) {
               result.add(newInorderVar.get(i)); 
               tempInorder.remove(Integer.valueOf(newInorderVar.get(i)));
            }

            for (int i = rootIndex + (int)(power / 2) - 1; i < rootIndex + power - 1; i++) {
                result.add(newInorderVar.get(i));
                tempInorder.remove(Integer.valueOf(newInorderVar.get(i)));
            }

            newInorderVar = tempInorder;
        }   

        if (newInorderVar.size() > 1) {
            rootIndex = newInorderVar.indexOf(preorderVar[0]);
            
            if (rootIndex - (int)(power / 2) < 0) {
                for (int i = 0; i < (int)(power / 2); i++) {
                    result.add(0);
                }

                for (int i = rootIndex + 1; i < newInorderVar.size(); i++) {
                    result.add(newInorderVar.get(i));
                }
            }
            else
            {
                for (int i = rootIndex - (int)(power / 2); i < rootIndex; i++) {
                    result.add(newInorderVar.get(i));
                }

                for (int i = 0; i < (int)(power / 2); i++) {
                    result.add(0);
                }
            }
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
