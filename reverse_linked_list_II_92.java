/* Leetcode - 92. Reverse Linked List II (Java language) - Medium */

import java.util.LinkedList;

public class reverse_linked_list_II_92 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 92. Reverse Linked List II (Java language) - Medium"));

        LinkedList<LinkedList<Integer>> head = new LinkedList<>();

        LinkedList<Integer> test1 = new LinkedList<>();
        LinkedList<Integer> test2 = new LinkedList<>();

        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);

        test2.add(5);

        head.add(test1);
        head.add(test2);

        int[] left = {2,1};
        int[] right = {4,1};

        for (int test = 0; test < right.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            reverseBetween(head.get(test), left[test], right[test]);
            System.out.print(head.get(test) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static void reverseBetween(LinkedList<Integer> headVar, int leftVar, int rightVar) {
        leftVar -= 1;
        rightVar -= 1;

        while (leftVar < rightVar) {
            int temp = headVar.get(leftVar);
            headVar.set(leftVar, headVar.get(rightVar));
            headVar.set(rightVar, temp);

            leftVar++;
            rightVar--;
        }
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
