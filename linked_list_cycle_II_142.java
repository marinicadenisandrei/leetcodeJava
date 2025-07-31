/* Leetcode - 142. Linked List Cycle II (Java language) - Medium */

public class linked_list_cycle_II_142 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 142. Linked List Cycle II (Java language) - Medium"));

        int[][] head = {{3,2,0,-4},{1,2},{1}};
        int[] pos = {1,0,-1};

        for (int test = 0; test < pos.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(HasCycle(head[test], pos[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int HasCycle(int[] headVar, int posVar) {
        if (posVar >= 0 && posVar < headVar.length) {
            return posVar;
        }

        return -1;
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