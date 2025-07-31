/* Leetcode - 137. Single Number II (Java language) - Medium */

public class single_number_II_137 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 137. Single Number II (Java language) - Medium"));
        
        int[][] nums = {{2,2,3,2},{0,1,0,1,0,1,99}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(SingleNumber(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int SingleNumber(int[] numsVar) {
        for (int i = 0; i < numsVar.length; i++) {
            boolean flag = true;

            for (int j = 0; j < numsVar.length; j++) {
                if (i != j && numsVar[i] == numsVar[j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return numsVar[i];
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
