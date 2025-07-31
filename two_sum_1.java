/* Leetcode - 1. Two Sum (Java language) - Easy */

public class two_sum_1 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 1. Two Sum (Java language) - ") + green("Easy"));
        
        int[][] nums = {{2,7,11,15},{3,2,4},{3,3}};
        int[] target = {9,6,6};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));

            int[] output = twoSum(nums[test], target[test]);
            printArray(output);   

            System.out.println(green("Passed"));
        }
    }

    public static int[] twoSum(int[] numsVar, int targetVar) {
        int[] result = new int[2];
        
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = i + 1; j < numsVar.length; j++) {
                if (numsVar[i] + numsVar[j] == targetVar) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static void printArray(int[] arrayVar) {
        if (arrayVar.length == 0) {
            System.out.print("[] | ");    
            return;
        }

        for (int i = 0; i < arrayVar.length; i++) {
            System.out.printf("%s%d%s", ((i == 0) ? "[" : ""), arrayVar[i], ((i < arrayVar.length - 1) ? ", " : "] | "));
        }
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
