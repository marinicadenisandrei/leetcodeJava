/* Leetcode - 80. Remove Duplicates from Sorted Array II (Java language) - Medium */

public class remove_duplicates_from_sorted_array_II_80 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 80. Remove Duplicates from Sorted Array II (Java language) - Medium"));

        int[][] nums = {{1,1,1,2,2,3},{0,0,1,1,1,1,2,3,3}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(removeDuplicates(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int removeDuplicates(int[] numsVar) {
        int sumVar = 0;
        int history = 0;

        for (int i : numsVar) {
            if (countIntem(numsVar, i) > 2 && i != history) {
                sumVar += countIntem(numsVar, i) - 2;
                history = i;
            }
        }

        return numsVar.length - sumVar;
    }

    public static int countIntem(int[] array, int item) {
        int sumVar = 0;

        for (int i : array) {
            if (i == item) {
                sumVar++;
            }
        }

        return sumVar;
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
