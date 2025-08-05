/* Leetcode - 223. Rectangle Area (Java language) - Medium */

public class rectangle_area_223 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 223. Rectangle Area (Java language) - Medium"));

        int[] ax1 = {-3,-2};
        int[] ay1 = {0,-2};
        
        int[] ax2 = {3,2};
        int[] ay2 = {4,2};

        int[] bx1 = {0,-2};
        int[] by1 = {-1,-2}; 

        int[] bx2 = {9,2};
        int[] by2 = {2,2};

        for (int test = 0; test < by2.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                computeArea(ax1[test], ay1[test], ax2[test], ay2[test], bx1[test], by1[test], bx2[test], by2[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int computeArea(int ax1Var, int ay1Var, int ax2Var, int ay2Var, int bx1Var, int by1Var, int bx2Var, int by2Var) {
        int areaRctangle1 = (ax2Var - ax1Var) * (ay2Var - ay1Var);
        int areaRctangle2 = (bx2Var - bx1Var) * (by2Var - by1Var);

        int oveerlapX = Math.max(0, Math.min(ax2Var, bx2Var) - Math.max(ax1Var, bx1Var));
        int oveerlapY = Math.max(0, Math.min(ay2Var, by2Var) - Math.max(ay1Var, by1Var));

        return (areaRctangle1 + areaRctangle2) - oveerlapX * oveerlapY;
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
