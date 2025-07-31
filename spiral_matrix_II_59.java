/* Leetcode - 59. Spiral Matrix II (Java language) - Medium */


import java.util.ArrayList;

public class spiral_matrix_II_59 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 59. Spiral Matrix II (Java language) - Medium"));
        
        int[] n = {3,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(generateMatrix(n[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int nVar ) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int var = 1;        

        for (int i = 0; i < nVar; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < nVar; j++) {
                temp.add(0);
            }

            matrix.add(temp);
        }
        var = 1;

        int top = 0;
        int bot = nVar;

        int left = 0;
        int right = nVar;

        while (top < bot) {
            for (int i = left; i < nVar; i++) {
                matrix.get(top).set(i, var);
                var++;

                if (var == (nVar * nVar) + 1) {
                    break;
                }
            }

            if (var == (nVar * nVar) + 1) {
                break;
            }
    
            for (int i = top + 1; i < bot - 1; i++) {
                matrix.get(i).set(nVar - 1, var);
                var++;
                
                if (var == (nVar * nVar) + 1) {
                    break;
                }
            }

            if (var == (nVar * nVar) + 1) {
                break;
            }
    
            for (int i = right - 1; i >= left; i--) {
                matrix.get(nVar - 1).set(i, var);
                var++;

                if (var == (nVar * nVar) + 1) {
                    break;
                }
            }

            if (var == (nVar * nVar) + 1) {
                break;
            }
    
            for (int i = bot - 2; i > top; i--) {
                matrix.get(i).set(left, var);
                var++;

                if (var == (nVar * nVar) + 1) {
                    break;
                }
            }

            if (var == (nVar * nVar) + 1) {
                break;
            }

            top++;
            bot--;

            left++;
            right--;
        }

        return matrix;
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
