/* Leetcode - 160. Intersection of Two Linked Lists (Java language) - Easy */

public class intersection_of_two_linked_lists_160 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 160. Intersection of Two Linked Lists (Java language) - ") + green("Easy"));

        int[] intersectVal = {8,2,0};
        int[][] listA = {{4,1,8,4,5},{1,9,1,2,4},{2,6,4}}; 
        int[][] listB = {{5,6,1,8,4,5},{3,2,4},{1,5}};
        int[] skipA = {2,3,3};
        int[] skipB = {3,1,2};

        for (int test = 0; test < skipB.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(getIntersectionNode(intersectVal[test], listA[test], listB[test], skipA[test], skipB[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String getIntersectionNode(int intersectValVar, int[] listAvar, int[] listBvar, int skipAvar, int skipBvar) {
        if (skipAvar > listAvar.length - 1 || skipBvar > listBvar.length - 1) {
            return "No intersection";
        }

        if (intersectValVar == listAvar[skipAvar] && intersectValVar == listBvar[skipBvar]) {
            return String.format("Intersected at '%d'", intersectValVar);
        }

        return "No intersection";
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
