/* Leetcode - 349. Intersection of Two Arrays (Java language) - Easy */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection_of_two_arrays_349 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 349. Intersection of Two Arrays (Java language) - ") + green("Easy"));
        
        int[][] nums1 = {{1,2,2,1},{4,9,5}};
        int[][] nums2 = {{2,2},{9,4,9,8,4}};

        for (int test = 0; test < nums2.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                Arrays.toString(intersection(nums1[test], nums2[test])) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static int[] intersection(int[] nums1Var, int[] nums2Var) {
        Set<Integer> noDuplicates = new HashSet<>();
        
        for (int i = 0; i < nums2Var.length; i++) {
            if (contains(nums1Var, nums2Var[i])) {
                noDuplicates.add(nums2Var[i]);
            }
        }

        int[] result = noDuplicates.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return result;
    }

    public static boolean contains(int[] arr, int target) {
        for (int number : arr) {
            if (number == target) {
                return true;
            }
        }

        return false;
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
