/* Leetcode - 64. Minimum Path Sum (Java language) - Medium */

public class minimum_path_sum_64 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 64. Minimum Path Sum (Java language) - Medium"));
        
        int[][][] grid = {{{1,3,1},{1,5,1},{4,2,1}},{{1,2,3},{4,5,6}}};
        
        for (int test = 0; test < grid.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minPathSum(grid[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int minPathSum(int[][] grid) {
        int sumVar = 0;

        int i = grid.length - 1;
        int j = grid[0].length - 1;

        while (i > 0 && j > 0) {
            sumVar += grid[i][j];

            if (grid[i - 1][j] < grid[i][j - 1]) {
                i--;
            }
            else
            {
                j--;
            }
        }

        if (i == 0) {
            for (int j2 = j; j2 >= 0; j2--) {
                sumVar += grid[i][j2];
            }
        }
        else
        {
            for (int j2 = i; j2 >= 0; j2--) {
                sumVar += grid[j2][0];
            }
        }

        return sumVar;
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
