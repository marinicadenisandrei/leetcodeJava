/* Leetcode - 16. 3Sum Closest (Java language) - Medium */

public class threeSum_closet_16 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 16. 3Sum Closest (Java language) - Medium"));

        int[][] nums = {{-1,2,1,-4},{0,0,0}};
        int[] traget = {1,1};

        for (int test = 0; test < traget.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));

            System.out.print(threeSumClosest(nums[test], traget[test]) + " | "); 
            
            System.out.println(green("Passed"));
        }
    }

    public static int threeSumClosest(int[] numsVar, int targetVar) {
        int closetSum = 0;
        
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                for (int j2 = 0; j2 < numsVar.length; j2++) {
                    if (i != j && j != j2 && j2 != i) {
                        int result = numsVar[i] + numsVar[j] + numsVar[j2];

                        if (Math.abs(numsVar[targetVar] - closetSum) > Math.abs(numsVar[targetVar] - result)) {
                            closetSum = result;
                        }
                    }
                }
            }
        }

        return closetSum;
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

