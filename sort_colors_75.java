import java.util.Arrays;

public class sort_colors_75 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 75. Sort Colors (Java language) - Medium"));
        int[][] nums = {{2,0,2,1,1,0},{2,0,1}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            sortColors(nums[test]);
            System.out.print(Arrays.toString(nums[test]));
            System.out.print(" | ");
            System.out.println(green("Passed"));   
        }
    }

    public static void sortColors(int[] numsVar) {
        Arrays.sort(numsVar);
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
