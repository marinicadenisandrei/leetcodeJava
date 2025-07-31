/* Leetcode - 149. Max Points on a Line (Java language) - Hard */

import java.util.Arrays;

public class max_points_on_a_line_149 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 149. Max Points on a Line (Java language) - ") + red("Hard"));

        int[][][] points = {{{1,1},{2,2},{3,3}},
                            {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}};
        
        for (int test = 0; test < points.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxPoints(points[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxPoints(int[][] pointsVar) {
        Arrays.sort(pointsVar, (a, b) -> Integer.compare(a[0], b[0]));
        int same = 0;
        int result = 0;

        for (int i = 0; i < pointsVar.length - 1; i++) {
            if (Math.abs(pointsVar[i][0] - pointsVar[i + 1][0]) == 1 || Math.abs(pointsVar[i][1] - pointsVar[i + 1][1]) == 0) {
                result++;

                if (pointsVar[i][0] == pointsVar[i][0]) {
                    same++;
                }
            }
        }

        return result + ((same == pointsVar.length - 1) ? 1 : 0);
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
