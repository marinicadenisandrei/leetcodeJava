/* Leetcode - 148. Sort List (Java language) - Medium */

import java.util.Arrays;

public class sort_list_148 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 148. Sort List (Java language) - Medium"));
        int[][] head = {{4,2,1,3},{-1,5,3,4,0},{}};

        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(sortList(head[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] sortList(int[] headVar) {
        int c = 0;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < headVar.length - 1 - c; i++) {
                if (headVar[i] > headVar[i + 1]) {
                    int temp = headVar[i];
                    headVar[i] = headVar[i + 1];
                    headVar[i + 1] = temp;
                    flag = true;
                }
            }

            c++;
        }

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
