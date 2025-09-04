/* Leetcode - 235. Lowest Common Ancestor of a Binary Search Tree (Java language) - Medium */

public class lowest_common_ancestor_of_a_binary_search_tree_235 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 235. Lowest Common Ancestor of a Binary Search Tree (Java language) - Medium"));

        int[][] root = {{6,2,8,0,4,7,9,0,0,3,5},{6,2,8,0,4,7,9,0,0,3,5},{2,1}};
        int p[] = {2,2,2}; 
        int q[] = {8,4,1};

        for (int test = 0; test < q.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                lowestCommonAncestor(root[test], p[test], q[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static int lowestCommonAncestor(int[] rootVar, int pVar, int qVar) {
        if (rootVar.length == 1) {
            return rootVar[0];
        }
        else if (rootVar.length == 2 && pVar == rootVar[0] && rootVar[1] == qVar) {
            return rootVar[0];
        }

        for (int i = 0; i < rootVar.length; i++) {
            if ((i * 2) + 2 > rootVar.length) {
                break;
            }

            int node = rootVar[i];
            int lchild = rootVar[(i * 2) + 1];
            int rchild = rootVar[(i * 2) + 2];

            if (lchild == pVar && rchild == qVar) {
                return node;
            }
            else if (rchild == pVar && rchild == qVar) {
                return node;
            }
            else if (node == pVar && (rchild == qVar || lchild == qVar)){
                return node;
            }
        }

        return -1;
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
