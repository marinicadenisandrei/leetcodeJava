/* Leetcode - 63. Unique Paths II (Java language) - Medium */

public class unique_paths_63 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 63. Unique Paths II (Java language) - Medium"));
        
        int[][][] obstacleGrid = {{{0,0,0},{0,1,0},{0,0,0}}, {{0,1},{0,0}}};
        
        for (int test = 0; test < obstacleGrid.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(uniquePaths(obstacleGrid[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int uniquePaths(int[][] obstacleGridVar) {
        int mVar = obstacleGridVar.length;
        int nVar = obstacleGridVar[0].length;
        int ones = 0;

        for (int i = 0; i < obstacleGridVar.length; i++) {
            for (int j = 0; j < obstacleGridVar[0].length; j++) {
                if (obstacleGridVar[i][j] == 1) {
                    ones++;
                }
            }   
        }

        for (int i = 0; i < obstacleGridVar[0].length; i++) {
            obstacleGridVar[mVar - 1][i] = 1;
        }

        for (int i = mVar - 2; i >= 0; i--) {
            for (int j = nVar - 2; j >= 0; j--) {
                obstacleGridVar[i][j] = obstacleGridVar[i + 1][j] + obstacleGridVar[i][j + 1];
            }
        }

        return obstacleGridVar[0][0] - ones;
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
