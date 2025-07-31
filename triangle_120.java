/* Leetcode - 120. Triangle (Java language) - Medium */

import java.util.ArrayList;
import java.util.Collections;

public class triangle_120 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 120. Triangle (Java language) - Medium"));

        int[][][] triangle = {{{2},{3,4},{6,5,7},{4,1,8,3}},{{-10}}};
        
        for (int test = 0; test < triangle.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minimumTotal(triangle[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int minimumTotal(int[][] triangleVar) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < triangleVar[0].length; i++) {
            temp.add(triangleVar[0][i]);
        }

        for (int j = 1; j < triangleVar.length; j++) {
            ArrayList<Integer> newTemp = new ArrayList<>();
            
            int middleTemp = (temp.size() % 2 == 0) ? (temp.size() / 2) - 1 : (temp.size() / 2);
            int middleCandidate = (triangleVar[j].length % 2 == 0) ? (triangleVar[j].length / 2) - 1 : triangleVar[j].length / 2;

            for (int i = 0; i <= middleTemp; i++) {
                for (int k = 0; k < middleCandidate; k++) {
                    newTemp.add(temp.get(i) + triangleVar[j][k]);
                }
            }

            for (int i = middleTemp; i < temp.size() - ((temp.size() % 2 == 0) ? 1 : 0); i++) {
                for (int k = middleCandidate; k < triangleVar[j].length; k++) {
                    newTemp.add(temp.get(i) + triangleVar[j][k]);
                }
            }

            temp = newTemp;
        }
        
        Collections.sort(temp);

        return temp.get(0);
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
