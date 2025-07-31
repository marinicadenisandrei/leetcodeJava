/* Leetcode - 107. Binary Tree Level Order Traversal II (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class binary_tree_level_order_traversal_II_107 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 107. Binary Tree Level Order Traversal II (Java language) - Medium"));

        ArrayList<ArrayList<Integer>> root = new ArrayList<>();

        ArrayList<Integer> test1 = new ArrayList<>(List.of(3,9,20,0,0,15,7));
        ArrayList<Integer> test2 = new ArrayList<>(List.of(1));
        ArrayList<Integer> test3 = new ArrayList<>(List.of());

        root.add(test1);
        root.add(test2);
        root.add(test3);

        for (int test = 0; test < root.size(); test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(levelOrderBottom(root.get(test)) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrderBottom(ArrayList<Integer> rootVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (rootVar.size() == 0) {
            return result;
        }

        while (rootVar.size() > 1) {
            result.add(new ArrayList<Integer>(rootVar.subList(rootVar.size() - 2, rootVar.size())));
            rootVar = new ArrayList<Integer>(rootVar.subList(0, rootVar.size() - 2));
        }

        result.add(new ArrayList<Integer>(List.of(rootVar.get(0))));
        
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
