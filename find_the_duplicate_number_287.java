/* Leetocd - 287. Find the Duplicate Number (Java language) - Medium */

public class find_the_duplicate_number_287 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetocd - 287. Find the Duplicate Number (Java language) - Medium"));

        int[][] nums = {{1,3,4,2,2},{3,1,3,4,2},{3,3,3,3,3}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                findDuplicate(nums[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int findDuplicate(int[] numsVar) {
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                if (i != j && numsVar[i] == numsVar[j]) {
                    return numsVar[i];
                }
            }
        }

        return -1;
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
