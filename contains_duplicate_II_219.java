/* Leetcode - 219. Contains Duplicate II (Java language) - Easy */

public class contains_duplicate_II_219 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 219. Contains Duplicate II (Java language) - ") + green("Easy"));

        int[][] nums = {{1,2,3,1},{1,0,1,1},{1,2,3,1,2,3}};
        int[] k = {3,1,2};

        for (int test = 0; test < k.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                containsNearbyDuplicate(nums[test], k[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean containsNearbyDuplicate(int[] numsVar, int kVar) {
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                if (numsVar[i] == numsVar[j] && Math.abs(i - j) <= kVar && i != j) {
                    return true;
                }
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
