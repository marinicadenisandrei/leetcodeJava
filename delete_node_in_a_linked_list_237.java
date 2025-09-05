/* Leetcode - 237. Delete Node in a Linked List (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class delete_node_in_a_linked_list_237 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 237. Delete Node in a Linked List (Java language) - Medium"));

        ArrayList<LinkedList<Integer>> head = new ArrayList<>(
                                                                Arrays.asList(
                                                                    new LinkedList<>(Arrays.asList(4,5,1,9)),
                                                                    new LinkedList<>(Arrays.asList(4,5,1,9))
                                                                )
                                                            );
        int[] node = {5,1};

        for (int test = 0; test < node.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                deleteNode(head.get(test), node[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static LinkedList<Integer> deleteNode(LinkedList<Integer> headVar, int nodeVar) {
        headVar.remove(Integer.valueOf(nodeVar));
        return headVar;
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
