/* Leetcode - 33. Search in Rotated Sorted Array (Java language) - Medium */

public class search_in_rotated_sorted_array_33 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 33. Search in Rotated Sorted Array (Java language) - Medium"));
        
        int[][] nums = {{4,5,6,7,0,1,2},{4,5,6,7,0,1,2},{1}};
        int[] target = {0,3,0};

        for (int test = 0; test < target.length; test++) {
            System.out.printf(green("Test %d: "), test + 1);
            System.out.print(search(nums[test], target[test]) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int search(int[] numsVar, int targetVar) {
        for (int i = 0; i < numsVar.length; i++) {
            if (numsVar[i] == targetVar) {
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
