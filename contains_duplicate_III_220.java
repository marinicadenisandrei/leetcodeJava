/* Leetcode - 220. Contains Duplicate III (Java language) - Hard */

public class contains_duplicate_III_220 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 220. Contains Duplicate III (Java language) - ") + red("Hard"));

        int[][] nums = {{1,2,3,1},{1,5,9,1,5,9}};
        int[] indexDiff = {3,2};
        int[] valueDiff = {0,3};

        for (int test = 0; test < valueDiff.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                containsNearbyAlmostDuplicate(nums[test], indexDiff[test], valueDiff[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean containsNearbyAlmostDuplicate(int[] numsVar, int indexDiffVar, int valueDiffVar) {
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                if (i != j && 
                    Math.abs(i - j) <= indexDiffVar &&
                    Math.abs(numsVar[i] - numsVar[j]) <= valueDiffVar) {
                    return true;
                }
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
