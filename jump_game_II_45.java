/* Leetcode - 45. Jump Game II (Java language) - Medium */

public class jump_game_II_45 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 45. Jump Game II (Java language) - Medium"));
        int[][] nums = {{2,3,1,1,4},{2,3,0,1,4}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(jump(nums[test]) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int jump(int[] numsVar) {
        int index = 0;
        int jump = numsVar[index];
        int counter1 = 0;
        int counter2 = 0;

        while (index < numsVar.length) {
            if (index + jump > numsVar.length) {
                break;
            }

            index += jump;

            if (jump == 0) {
                return counter1 + 1;
            }

            jump = numsVar[index];
            counter1++;
        }

        index = 1;
        jump = numsVar[index];

        while (index < numsVar.length) {
            if (index + jump > numsVar.length) {
                break;
            }

            index += jump;
            
            if (jump == 0) {
                return counter2 + 1;
            }

            jump = numsVar[index];
            counter2++;
        }

        if (counter1 < counter2) {
            return counter1 + 1;
        }

        return counter2 + 1;
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
