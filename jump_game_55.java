/* Leetcode - 55. Jump Game (Java language) - Medium */

public class jump_game_55 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 55. Jump Game (Java language) - Medium"));

        int[][] nums = {{2,3,1,1,4},{3,2,1,0,4}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(canJump(nums[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static boolean canJump(int[] numsVar) {
        for (int i = 0; i < 2; i++) {
            int index = 0;

            while (index < numsVar.length - 1) {
                if (numsVar[index] == 0) {
                    break;

                }
                index = index + numsVar[index]; 
            }

            if (index == numsVar.length - 1) {
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
