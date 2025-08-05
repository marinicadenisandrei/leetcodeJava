/* Leetcode - 222. Count Complete Tree Nodes (Java language) - Easy */

public class count_complete_tree_nodes_222 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 222. Count Complete Tree Nodes (Java language) - ") + green("Easy"));

        int[][] root = {{1,2,3,4,5,6},{},{1}};

        for (int test = 0; test < root.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                countNodes(root[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int countNodes(int[] rootVar) {
        if (rootVar.length == 1 && rootVar[0] != 0) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < rootVar.length; i++) {
            if ((i * 2) + 2 > rootVar.length - 1) {
                break;
            }

            int node = rootVar[i];
            int left = rootVar[(i * 2) + 1];
            int right = rootVar[(i * 2) + 2];

            if (node != 0 && left != 0 && right != 0) {
                count++;
            }
        }

        return count * 3;
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
    }

    public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
    }

    public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
    }

    public static String reset(String var0) {
        return "\u001b[0m" + var0;
    }
}
