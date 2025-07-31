/* Leetcode - 141. Linked List Cycle (Java language) - Easy */

public class linked_list_cycle_141 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 141. Linked List Cycle (Java language) - ") + green("Easy"));

        int[][] head = {{3,2,0,-4},{1,2},{1}};
        int[] pos = {1,0,-1};

        for (int test = 0; test < pos.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(HasCycle(head[test], pos[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean HasCycle(int[] headVar, int posVar) {
        return posVar >= 0 && posVar < headVar.length;
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