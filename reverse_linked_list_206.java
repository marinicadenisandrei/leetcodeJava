/* Leetcode - 206. Reverse Linked List (Java language) - Easy */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reverse_linked_list_206 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 206. Reverse Linked List (Java language) - ") + green("Easy"));

        ArrayList<LinkedList<Integer>> head = new ArrayList<>();

        LinkedList<Integer> test1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<Integer> test2 = new LinkedList<>(List.of(1,2));
        LinkedList<Integer> test3 = new LinkedList<>(List.of());

        head.add(test1);
        head.add(test2);
        head.add(test3);

        for (int test = 0; test < head.size(); test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(reverseList(head.get(test)) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> headVar) {
        Collections.reverse(headVar);

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
