/* Leetcode - 198. House Robber (Java language) - Medium */

public class house_robber_198 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 198. House Robber (Java language) - Medium"));

        int[][] nums = {{1,2,3,1},{2,7,9,3,1}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(rob(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int rob(int[] numsVar) {
        int result = 0;

        for (int i = 0; i < 2; i++) {
            int temp = 0;

            for (int j = i; j < numsVar.length; j += 2) {
                temp += numsVar[j];
            }   

            result = ((temp > result) ? temp : result);
        }

        return result;
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
