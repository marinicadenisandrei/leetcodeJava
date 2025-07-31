/* Leetcode - 117. Populating Next Right Pointers in Each Node II (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class populating_next_right_pointers_in_each_node_II_117 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 117. Populating Next Right Pointers in Each Node II (Java language) - Medium"));

        int[][] root = {{1,2,3,4,5,0,7},{}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(connect(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> connect(int[] root) {
        if (root.length == 0) {
            return new ArrayList<Integer>();
        }

        for (int i = 0; i < root.length; i++) {
            if (root[i] == 0) {
                root[i] = -1;
            }
        }

        ArrayList<Integer> newRoot = new ArrayList<>(List.of(root[0],0));

        int starter = 2;

        for (int i = 1; i < root.length; i++) {
            newRoot.add(root[i]);
            
            if (i == starter) {
                newRoot.add(0);
                starter += (starter + starter * 2);
            }
        }

        newRoot.removeIf(n -> n == -1);
        newRoot.add(0);

        return newRoot;
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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

