/* Leetcode - 162. Find Peak Element (Java language) - Medium */

public class find_peak_element_162 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 162. Find Peak Element (Java language) - Medium"));

        int[][] nums = {{1,2,3,1},{1,2,1,3,5,6,4}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(findPeakElement(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }
    public static int findPeakElement(int[] numsVar) {
        for (int i = 1; i < numsVar.length - 1; i++) {
            if (numsVar[i - 1] < numsVar[i] && numsVar[i] > numsVar[i + 1]) {
                return i;
            }
        }

        return -1;
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
