/* Leetcode - 329. Longest Increasing Path in a Matrix (Java language) - Hard */

public class longest_increasing_path_in_a_matrix_329 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 329. Longest Increasing Path in a Matrix (Java language) - ") + red("Hard"));
        int[][][] matrix = {{{9,9,4},{6,6,8},{2,1,1}},{{3,4,5},{3,2,6},{2,2,1}},{{1}}};
        
        for (int test = 0; test < matrix.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                longestPath(matrix[test]) +
                " | " +
                green("Passed")
            );
        }
    }   

    public static int longestPath(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, longestIncreasingPath(matrix, i, j, 1));
            }
        }
        return max;
    }

    public static int longestIncreasingPath(int[][] matrixVar, int i, int j, int result) {
        int best = result;

        // left
        if (j - 1 >= 0 && matrixVar[i][j] < matrixVar[i][j - 1]) {
            best = Math.max(best, longestIncreasingPath(matrixVar, i, j - 1, result + 1));
        }

        // right
        if (j + 1 < matrixVar[0].length && matrixVar[i][j] < matrixVar[i][j + 1]) {
            best = Math.max(best, longestIncreasingPath(matrixVar, i, j + 1, result + 1));
        }

        // up
        if (i - 1 >= 0 && matrixVar[i][j] < matrixVar[i - 1][j]) {
            best = Math.max(best, longestIncreasingPath(matrixVar, i - 1, j, result + 1));
        }

        // down
        if (i + 1 < matrixVar.length && matrixVar[i][j] < matrixVar[i + 1][j]) {
            best = Math.max(best, longestIncreasingPath(matrixVar, i + 1, j, result + 1));
        }

        return best;
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
