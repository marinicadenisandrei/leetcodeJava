/* Leetcode - 147. Insertion Sort List (Java language) - Medium */

import java.util.Arrays;

public class insertion_sort_list_147 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 147. Insertion Sort List (Java language) - Medium"));

        int[][] head = {{4,2,1,3},{-1,5,3,4,0}};
        
        for (int test = 0; test < head.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(insertionSortList(head[test]))  + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] insertionSortList(int[] head) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < head.length - 1; i++) {
                if (head[i] > head[i + 1]) {
                    
                    for (int j = i; j >= 0; j--) {
                        if (head[i + 1] < head[j]) {
                            int temp = head[i + 1];
                            head[i + 1] = head[j];
                            head[j] = temp;

                            flag = true;
                        }   
                    }
                }
            }
        }

        return head;
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
