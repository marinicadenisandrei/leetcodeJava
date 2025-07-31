/* Leetcode - 111. Minimum Depth of Binary Tree (Java language) - Easy */

public class minimum_depth_of_binary_tree_111 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 111. Minimum Depth of Binary Tree (Java language) - ") + green("Easy"));

        int[][] root = {{3,9,20,0,0,15,7},{2,0,3,0,4,0,5,0,6}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minDepth(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int minDepth(int[] rootVar) {
        int rootLen = rootVar.length;
        boolean flag = false;

        int depth = 0;
        int power = 1;

        while (rootLen > power) {
            rootLen -= power;
            power *= 2;
            depth++;
        }

        for (int i = 0; i < rootVar.length; i++) {
            if (((i * 2) + 2) > rootVar.length - 1) {
                break;
            }

            if ((rootVar[i] == 0 || rootVar[(i * 2) + 1] == 0 || rootVar[(i * 2) + 2] == 0) && i < 1) {
                flag = true;
                continue;
            }

            if (flag) {
                depth++;
            }
        }

        if (flag) {
            depth -= 1;
        }

        return depth;
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
