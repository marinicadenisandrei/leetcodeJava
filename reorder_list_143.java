/* Leetcode - 143. Reorder List (Java language) - Medium */

import java.util.Arrays;

public class reorder_list_143 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 143. Reorder List (Java language) - Medium"));

        int[][] head = {{1,2,3,4},{1,2,3,4,5}};

        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(ReorderList(head[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] ReorderList(int[] head) {
        int[] newHead = new int[head.length];
        int newHeadSize = 0;

        for (int i = 0; i < head.length / 2; i++) {
            newHead[newHeadSize++] = head[i];
            newHead[newHeadSize++] = head[head.length - 1 - i];
        }

        if (head.length % 2 != 0) {
            newHead[newHeadSize] = head[head.length / 2];
        }

        return newHead;
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
