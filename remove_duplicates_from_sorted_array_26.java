import java.util.Arrays;

public class remove_duplicates_from_sorted_array_26 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 26. Remove Duplicates from Sorted Array (Java language) - ") + green("Easy"));
        
        int[][] nums = {{1,1,2},{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(removeDuplicates(nums[test]) + ", " + Arrays.toString(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int removeDuplicates(int[] numsVar) {
        if (numsVar.length == 0) return 0;

        int noDuplicatesArraySize = 1;

        for (int i = 1; i < numsVar.length; i++) {
            if (numsVar[i] != numsVar[noDuplicatesArraySize - 1]) {
                numsVar[noDuplicatesArraySize++] = numsVar[i];
            }
        }

        for (int i = noDuplicatesArraySize; i < numsVar.length; i++) {
            numsVar[i] = 0;
        }

        return noDuplicatesArraySize;
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
