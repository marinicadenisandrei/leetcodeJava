/* Leetcode - 328. Odd Even Linked List (Java language) - Medium */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class odd_even_linked_list_328 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 328. Odd Even Linked List (Java language) - Medium"));
        
        ArrayList<LinkedList<Integer>> head = new ArrayList<>(
            List.of(
                new LinkedList<>(List.of(1,2,3,4,5)),
                new LinkedList<>(List.of(2,1,3,5,6,4,7))
            )
        );

        for (int test = 0; test < head.size(); test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                oddEvenList(head.get(test)) +
                " | " +
                green("Passed")
            );
        }
    }

    public static LinkedList<Integer> oddEvenList(LinkedList<Integer> headVar) {
        LinkedList<Integer> oddHead = new LinkedList<>();
        LinkedList<Integer> evenHead = new LinkedList<>();

        for (int i = 0; i < headVar.size(); i++) {
            if (i % 2 == 1) {
                evenHead.add(headVar.get(i));
            } else {
                oddHead.add(headVar.get(i));
            }
        }

        for (int i = 0; i < evenHead.size(); i++) {
            oddHead.add(evenHead.get(i));
        }

        return oddHead;
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
