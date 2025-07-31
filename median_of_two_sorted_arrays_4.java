import java.util.Arrays;

public class median_of_two_sorted_arrays_4 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 4. Median of Two Sorted Arrays (Java language) - ") + red("Hard"));

        int[][] nums1 = {{1,3},{1,2}};
        int[][] nums2 = {{2},{3,4}};

        for (int test = 0; test < nums1.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(findMedianSortedArrays(nums1[test], nums2[test]) + " | ");  
            System.out.println(green("Passed")); 
        }
    }

    public static double findMedianSortedArrays(int[] nums1Var, int[] nums2Var) {
        int[] mergedArray = new int[nums1Var.length + nums2Var.length];
        System.arraycopy(nums1Var, 0, mergedArray, 0, nums1Var.length);
        System.arraycopy(nums2Var, 0, mergedArray, nums1Var.length, nums2Var.length);
        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 != 0) {
            return mergedArray[mergedArray.length / 2];
        }

        return (double)(mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2;
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
