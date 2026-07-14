/* Leetcode - 331. Verify Preorder Serialization of a Binary Tree (Java language) - Medium */

public class verify_preorder_serialization_of_a_binary_tree_331 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 331. Verify Preorder Serialization of a Binary Tree (Java language) - Medium"));

        String[] preorder = {"9,3,4,#,#,1,#,#,2,#,6,#,#","1,#","9,#,#,1"};
        
        for (int test = 0; test < preorder.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ")+
                isValidSerialization(preorder[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static Boolean isValidSerialization(String preorderVar) {
        String[] nodes = preorderVar.split(",");
        int slots = 1;

        for (String node: nodes) {
            if (slots == 0) {
                return false;
            }
            if (node.equals("#")) {
                slots--;
            } else {
                slots++;
            }
        }

        return slots == 0;
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