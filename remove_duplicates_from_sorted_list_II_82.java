/* Leetcode - 82. Remove Duplicates from Sorted List II (Java language) - Medium  */

import java.util.ArrayList;

public class remove_duplicates_from_sorted_list_II_82 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 82. Remove Duplicates from Sorted List II (Java language) - Medium"));

        int[][] head = {{1,2,3,3,4,4,5},{1,1,1,2,3}};

        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(deleteDuplicates(head[test]) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> deleteDuplicates(int[] head) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < head.length; i++) {
            if (countOcc(head, head[i]) == 1) {
                result.add(head[i]);
            }
        }

        return result;
    }

    public static int countOcc(int[] array, int target) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                sum++;
            }
        }

        return sum;
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