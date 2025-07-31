/* Leetcode - 85. Maximal Rectangle (Java language) - Hard */

public class maximal_rectangle_85 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 85. Maximal Rectangle (Java language) - ") + red("Hard"));

        String[][][] matrix = {
                                {{"1","0","1","0","0"},{"1","0","1","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}},
                                {{"0"}},
                                {{"1"}}
                            };

        for (int test = 0; test < matrix.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maximalRectangle(matrix[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maximalRectangle(String[][] matrixVar) {
        int result = 0;

        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                if (matrixVar[i][j] == "1") {
                    int stop_i = 0;
                    int stop_j = 0;        
                    
                    for (int j2 = j; j2 < matrixVar[i].length; j2++) {
                        if (matrixVar[i][j2] == "0") {
                            stop_j = j2;
                            break;
                        }
                        
                        if (j2 == matrixVar[i].length - 1) {
                            stop_j = matrixVar[i].length;
                        }
                    }

                    for (int j2 = i; j2 < matrixVar.length; j2++) {
                        if (matrixVar[j2][j] == "0") {
                            stop_i = j2;
                            break;
                        }

                        if (j2 == matrixVar.length - 1) {
                            stop_i = matrixVar.length;
                        }
                    }
                    
                    int temp = checkConsistance(matrixVar, i, stop_i, j, stop_j);
                    result = (temp > result ? temp : result);
                }
            }
        }

        return result;
    }

    public static int checkConsistance(String[][] matrixVar, int i, int i_stop, int j, int j_stop) {
        for (int k = i; k < i_stop; k++) {
            for (int k2 = j; k2 < j_stop; k2++) {
                if (matrixVar[k][k2] == "0") {
                    return -1;
                }
            }
        }

        return (i_stop - i) * (j_stop - j);
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
