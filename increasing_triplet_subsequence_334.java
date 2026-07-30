/* Leetcode - 334. Increasing Triplet Subsequence (Java language) - Medium */

public class increasing_triplet_subsequence_334 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 334. Increasing Triplet Subsequence (Java language) - Medium"));

        int[][] nums = {{1,2,3,4,5},{5,4,3,2,1},{2,1,5,0,4,6}};

        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                increasingTriplet(nums[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static boolean increasingTriplet(int[] numsVar) {
        for (int i = 0; i < numsVar.length - 1; i++) {
            int prev = i;
            int counter = 1;

            for (int j = i + 1; j < numsVar.length; j++) {
                if (numsVar[prev] < numsVar[j]) {
                    counter++;
                    prev = j;
                }

                if (counter > 2) {
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
