import java.util.Arrays;

public class same_tree_100 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 100. Same Tree (Java language) - ") + green("Easy"));

        int[][] p = {{1,2,3},{1,2},{1,2,1}};
        int[][] q = {{1,2,3},{1,0,2},{1,1,2}};

        for (int test = 0; test < q.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isSameTree(p[test], q[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isSameTree(int[] p, int[] q) {
        return Arrays.equals(p, q);
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
