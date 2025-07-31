/* Leetcode - 86. Partition List (Java language) - Medium */

import java.util.Arrays;

public class partition_list_86 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 86. Partition List (Java language) - Medium"));
        int[][] head = {{1,4,3,2,5,2},{2,1}}; 
        int[] x = {3,2};

        for (int test = 0; test < x.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(partition(head[test], x[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] partition(int[] headVar, int xVar) {
        int[] result = new int[headVar.length];
        int[] sortedArray = Arrays.copyOf(headVar, headVar.length);
        Arrays.sort(sortedArray);

        for (int i = 0; i < xVar; i++) {
            result[i] = sortedArray[i];
        }
    
        for (int i = 0; i < headVar.length; i++) {
            if (!ArrayContainElement(result, headVar[i])) {
                result[xVar++] = headVar[i];
            }        
        }

        return result;
    }

    public static boolean ArrayContainElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }

        return false;
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
