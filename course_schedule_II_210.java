/* Leetcode - 210. Course Schedule II (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;

public class course_schedule_II_210 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 210. Course Schedule II (Java language) - Medium"));

        int[] numCourses = {2,4};
        int[][][] prerequisites = {{{1,0}},{{1,0},{2,0},{3,1},{3,2}}};

        for (int test = 0; test < prerequisites.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(findOrder(numCourses[test], prerequisites[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> findOrder(int numCoursesVar, int[][] prerequisitesVar) {
        ArrayList<Integer> result =
            new ArrayList<>(Arrays.asList(
                prerequisitesVar[0][1],
                prerequisitesVar[0][0]
            ));
        
        for (int i = 1; i < prerequisitesVar.length; i++) {

            int index = result.indexOf(prerequisitesVar[i][1]);
            int found = result.indexOf(prerequisitesVar[i][0]);

            if (index != -1 && found == -1) {
                result.add(index + 1, prerequisitesVar[i][0]);    
            }
        }

        return result;
    }

    public static int divide(int dividendVar, int divisorVar) {
        return (int) dividendVar / divisorVar;
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
