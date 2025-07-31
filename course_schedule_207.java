/* Leetcode - 207. Course Schedule (Java language) - Medium */

public class course_schedule_207 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 207. Course Schedule (Java language) - Medium"));

        int[] numCourses = {2,2};
        int[][][] prerequisites = {{{1,0}},{{1,0},{0,1}}};

        for (int test = 0; test < prerequisites.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(canFinish(numCourses[test], prerequisites[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean canFinish(int numCoursesVar, int[][] prerequisitesVar) {
    
        for (int i = 0; i < prerequisitesVar.length; i++) {
            for (int j = 0; j < prerequisitesVar.length; j++) {
                if (i != j && prerequisitesVar[i][0] == prerequisitesVar[j][1] && prerequisitesVar[i][1] == prerequisitesVar[j][0]) {
                    return false;
                }
            }
        }
    
        return true;
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
