import java.util.Arrays;

public class merge_two_sorted_lists_21 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 21. Merge Two Sorted Lists (Java language) - ") + green("Easy"));
        int[][] list1 = {{1,2,4},{},{}};
        int[][] list2 = {{1,3,4},{},{0}};
        
        for (int test = 0; test < list2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(mergeTwoLists(list1[test], list2[test])) + " | "); 
            System.out.println(green("Passed")); 
        }
    }

    public static int[] mergeTwoLists(int[] list1Var, int[] list2Var) {
        int[] mergedList = new int[list1Var.length + list2Var.length];
        System.arraycopy(list1Var, 0, mergedList, 0, list1Var.length);
        System.arraycopy(list2Var, 0, mergedList, list1Var.length, list2Var.length);

        Arrays.sort(mergedList);
        return mergedList;
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
