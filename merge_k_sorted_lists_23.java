import java.util.Arrays;

public class merge_k_sorted_lists_23 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 23. Merge k Sorted Lists (Java language) - ") + red("Hard"));
        
        int[][][] lists = {{{1,4,5},{1,3,4},{2,6}},{},{{}}};

        for (int test = 0; test < lists.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(mergeKLists(lists[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] mergeKLists(int[][] listsVar) {
        int totalLen = 0;

        for (int i = 0; i < listsVar.length; i++) {
            totalLen += listsVar[i].length;
        }

        int[] mergedList = new int[totalLen];
        int lenCounter = 0;

        for (int i = 0; i < listsVar.length; i++) {
            System.arraycopy(listsVar[i], 0, mergedList, lenCounter, listsVar[i].length);
            lenCounter += listsVar[i].length;
        }

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
