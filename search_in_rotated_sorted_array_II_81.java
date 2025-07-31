/* Leetcode - 81. Search in Rotated Sorted Array II (Java language) - Medium */

public class search_in_rotated_sorted_array_II_81 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 81. Search in Rotated Sorted Array II (Java language) - Medium"));

        int[][] nums = {{2,5,6,0,0,1,2},{2,5,6,0,0,1,2}};
        int[] target = {0,3};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(search(nums[test], target[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean search(int[] numsVar, int targetVar) {
        for (int i = 0; i < numsVar.length; i++) {
            if (numsVar[i] == targetVar) {
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
