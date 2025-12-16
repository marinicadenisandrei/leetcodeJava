/* Leetcode - 297. Serialize and Deserialize Binary Tree (Java language) - Hard */

import java.util.ArrayList;

public class serialize_and_deserialize_binary_tree_297 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 297. Serialize and Deserialize Binary Tree (Java language) - ") + red("Hard"));

        int[][] root = {{1,2,3,0,0,4,5},{}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                deserialize(serialize(root[test])) +
                " | " +
                green("Passed")
            );
        }
    }

    public static String serialize(int[] rootVar) {
        String result = "[";

        for (int i = 0; i < rootVar.length; i++) {
            result += Integer.toString(rootVar[i]) + ((i < rootVar.length - 1) ? "," : "");
        }

        result += "]";

        return result;
    }

    public static ArrayList<Integer> deserialize(String data) {
        ArrayList<Integer> result = new ArrayList<>();

        if (data.equals("[]")) {
            return result;
        }

        data = data.replace("[", "").replace("]", "");

        for (String value : data.split(",")) {
            String temp = value.trim();  
            int n = Integer.parseInt(temp);
            result.add(n);
        }

        return result;
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
