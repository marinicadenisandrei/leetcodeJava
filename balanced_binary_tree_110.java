/* Leetcode - 110. Balanced Binary Tree (Java language) - Easy */

import java.util.ArrayList;
import java.util.List;

public class balanced_binary_tree_110 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 110. Balanced Binary Tree (Java language) - ") + green("Easy"));
        int[][] root = {{3,9,20,0,0,15,7},{1,2,2,3,3,0,0,4,4},{}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isBalanced(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isBalanced(int[] rootVar) {
        int counter = 2;

        for (int i = 0; i < rootVar.length; i++) {
            if ((i * 2) + 2 > rootVar.length - 1) {
                break;
            }
            
            ArrayList<Integer> temp = new ArrayList<>(List.of(rootVar[i], rootVar[(i * 2) + 1], rootVar[(i * 2) + 2]));
            if (temp.contains(0)) {
                counter -= (i + 1);
            }
        }

        return counter >= 0;
    }

    public static int strStr(String hayStackVar, String needleVar) {
        return hayStackVar.indexOf(needleVar);   
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


