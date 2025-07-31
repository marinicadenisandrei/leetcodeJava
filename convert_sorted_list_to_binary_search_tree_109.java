/* Leetcode - 109. Convert Sorted List to Binary Search Tree (Java language) - Easy */

import java.util.ArrayList;
import java.util.Collections;

public class convert_sorted_list_to_binary_search_tree_109 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 109. Convert Sorted List to Binary Search Tree (Java language) - ") + green("Easy"));

        int[][] nums = {{-10,-3,0,5,9},{}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(sortedArrayToBST(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<Integer> sortedArrayToBST(int[] numsVar) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (numsVar.length == 0) {
            return result;
        }

        int middle = numsVar.length / 2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        result.add(numsVar[middle]);

        int level = 1;

        for (int i = 0; i < numsVar.length; i++) {
            if (i < middle) {
                left.add(numsVar[i]);
            } else if (i == middle) {
                continue;
            } else {
                right.add(numsVar[i]);
            }
        }

        if (numsVar.length < 3) {
            result.addAll(left);
            result.addAll(right);
            return result;
        }

        while (left.size() > 0 && right.size() > 0) {
            if (level <= left.size()) {
                for (int i = left.size() - 1; i > left.size() - 1 - level; i--) {
                    result.add(left.get(i));
                }
            } else {
                for (int i = left.size() - 1; i >= 0; i--) {
                    result.add(left.get(i));
                }

                for (int i = 0; i <= level - left.size() - 1; i++) {
                    result.add(0);
                }
            }

            Collections.reverse(right);

            if (level <= right.size()) {
                for (int i = 0; i < level; i++) {
                    result.add(right.get(i));
                }
            } else {
                for (int i = 0; i < right.size(); i++) {
                    result.add(right.get(i));
                }

                for (int i = 0; i <= level - right.size() - 1; i++) {
                    result.add(0);
                }
            }
            
            try {
                left = new ArrayList<>(left.subList(0, left.size() - level));
                right = new ArrayList<>(right.subList(level, right.size()));
            } catch (java.lang.IllegalArgumentException e) {
                break;
            }
            
            level++;
        }

        return result;
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
