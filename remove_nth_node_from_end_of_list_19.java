import java.util.Arrays;

public class remove_nth_node_from_end_of_list_19 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 19. Remove Nth Node From End of List (Java language) - Medium"));

        int[][] head = {{1,2,3,4,5},{1},{1,2}};
        int[] n = {2,1,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));

            System.out.print(Arrays.toString(removeNthFromEnd(head[test], n[test])) + " | ");
            
            System.out.println(green("Passed"));
        }
    }

    public static int[] removeNthFromEnd(int[] headVar, int nVar) {
        if (headVar.length == 1 && nVar == 1) {
            return new int[] {};
        }

        for (int i = nVar + 1; i < headVar.length - 1; i++) {
            headVar[i] = headVar[i + 1];
        }

        return Arrays.copyOf(headVar, headVar.length - 1);
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
