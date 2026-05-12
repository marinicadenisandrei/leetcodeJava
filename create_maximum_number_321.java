/* Leetcode - 321. Create Maximum Number (Java language) - Hard */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class create_maximum_number_321 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 321. Create Maximum Number (Java language) - ") + red("Hard"));
        int[][] nums1 = {{3,4,6,5},{6,7},{3,9}};
        int[][] nums2 = {{9,1,2,5,8,3},{6,0,4},{8,9}};
        int[] k = {5,5,3}; 

        for (int test = 0; test < k.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                maxNumber(nums1[test], nums2[test], k[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int maxNumber(int[] nums1Var, int[] nums2Var, int kVar) {
        List<Integer> result1 = new ArrayList<>();

        List<Integer> candidate1 = new ArrayList<>();
        List<Integer> candidate2 = new ArrayList<>();

        int maxFromRight = nums1Var[nums1Var.length - 1];
        candidate1.add(maxFromRight);

        for (int i = nums1Var.length - 2; i >= 0; i--) {
            if (nums1Var[i] > maxFromRight) {
                maxFromRight = nums1Var[i];
                candidate1.add(maxFromRight);
            }
        }

        maxFromRight = nums2Var[nums2Var.length - 1];
        candidate2.add(maxFromRight);

        for (int i = nums2Var.length - 2; i >= 0; i--) {
            if (nums2Var[i] > maxFromRight) {
                maxFromRight = nums2Var[i];
                candidate2.add(maxFromRight);
            }
        }

        Collections.reverse(candidate1);
        Collections.reverse(candidate2);

        int i = 0;
        int j = 0;

        while (i < candidate1.size() && j < candidate2.size()) {
            if (candidate1.get(i) < candidate2.get(j)) {
                result1.add(candidate2.get(j));
                j++;
            } else {
                result1.add(candidate1.get(i));
                i++;
            }
        }

        while (i < candidate1.size()) {
            result1.add(candidate1.get(i));
            i++;
        }

        while (j < candidate2.size()) {
            result1.add(candidate2.get(j));
            j++;
        }

        i = 0;
        j = 0;

        List<Integer> result2 = new ArrayList<>();

        while (i < nums1Var.length && j < nums2Var.length) {
            if (nums1Var[i] < nums2Var[j]) {
                result2.add(nums2Var[j]);
                j++;
            } else {
                result2.add(nums1Var[i]);
                i++;
            }
        }

        while (i < nums1Var.length) {
            result2.add(nums1Var[i]);
            i++;
        }

        while (j < nums2Var.length) {
            result2.add(nums2Var[j]);
            j++;
        }

        List<Integer> acumulationList = new ArrayList<>();
        
        for (int k = 0; k < nums1Var.length; k++) {
            acumulationList.add(nums1Var[k]);
        }

        for (int k = 0; k < nums2Var.length; k++) {
            acumulationList.add(nums2Var[k]);
        }

        int number1 = 0;
        int number2 = 0;

        for (int k = 0; k < result1.size() && k < kVar; k++) {
            number1 = number1 * 10 + result1.get(k);
        }

        for (int k = 0; k < result2.size() && k < kVar; k++) {
            number2 = number2 * 10 + result2.get(k);
        }

        int maxConcat = 0;

        for (int k = 0; k <= acumulationList.size() - kVar; k++) {
            int tempNumber = 0;

            for (int l = k; l < k + kVar; l++) {
                tempNumber = tempNumber * 10 + acumulationList.get(l);
            }
            
            maxConcat = ((maxConcat > tempNumber) ? maxConcat : tempNumber);
        }

        return Math.max(number1, Math.max(number2, maxConcat));
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
