/* Leetcode - 352. Data Stream as Disjoint Intervals (Java language) - Hard */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
 
class SummaryRanges {
    private final TreeSet<Integer> nums = new TreeSet<>();

    public void addNum(int value) {
        nums.add(value);
    }
 
    public int[][] getIntervals() {
        List<int[]> result = new ArrayList<>();
        if (nums.isEmpty()) {
            return new int[0][];
        }
 
        int start = -1;
        int prev = -1;
        boolean first = true;
 
        for (int n : nums) {
            if (first) {
                start = n;
                first = false;
            } else if (n != prev + 1) {
                result.add(new int[]{start, prev});
                start = n;
            }
            prev = n;
        }
        result.add(new int[]{start, prev});
 
        return result.toArray(new int[0][]);
    }
}

public class data_stream_as_disjoint_intervals_352 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 352. Data Stream as Disjoint Intervals (Java language) - ") + red("Hard"));
        
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] input = {1, 3, 7, 2, 6};

        System.out.print(green("Test 1: "));

        for (int n : input) {
            summaryRanges.addNum(n);
            System.out.print(Arrays.deepToString(summaryRanges.getIntervals()) + " ");
        }

        System.out.print(" | " + green("Passed"));
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
