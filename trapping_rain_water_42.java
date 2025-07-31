/* Leetcode - 42. Trapping Rain Water (Java language) - Hard */

public class trapping_rain_water_42 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 42. Trapping Rain Water (Java language) - ") + red("Hard"));
        int[][] height = {{0,1,0,2,1,0,1,3,2,1,2,1},{4,2,0,3,2,5}};

        for (int test = 0; test < height.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(trap(height[test]) + " | ");  
            System.out.println(green("Passed"));
        }
    }

    public static int trap(int[] height) {
        int maxValue = 0;
        int counter = 0;

        for (int i = 0; i < height.length; i++) {
            maxValue = ((maxValue < height[i]) ? height[i] : maxValue);
        }

        int[][] board = new int[height.length][maxValue];
        
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i < height[j]) {
                    board[j][i] = 1;
                }
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            int start = 0;
            int end = 0;

            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 1) {
                    start = j;
                    break;
                }
            }

            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] == 1) {
                    end = j;
                    break;
                }
            }

            if (start < end) {
                for (int j = start; j <= end; j++) {
                    counter += ((board[j][i] == 0) ? 1 : 0);
                }
            }
        }

        return counter;
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
