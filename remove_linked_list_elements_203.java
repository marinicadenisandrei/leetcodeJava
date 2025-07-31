/* Leetcode - 203. Remove Linked List Elements (Java language) - Easy */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class remove_linked_list_elements_203 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 203. Remove Linked List Elements (Java language) - ") + green("Easy"));

        ArrayList<LinkedList<Integer>> head = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();

        head.add(new LinkedList<>(Arrays.asList(1, 2, 6, 3, 4, 5, 6)));
        val.add(6);

        head.add(new LinkedList<>());
        val.add(1);

        head.add(new LinkedList<>(Arrays.asList(7, 7, 7, 7)));
        val.add(7);

        for (int test = 0; test < head.size(); test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(removeElements(head.get(test), val.get(test)) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static LinkedList<Integer> removeElements(LinkedList<Integer> headVar, int valVar) {
        if (headVar == null) {
            return null;
        }

        headVar.removeIf(n -> n == valVar);
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
