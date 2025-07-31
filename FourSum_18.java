import java.util.Arrays;

public class FourSum_18 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 18. 4Sum (Java language) - Medium"));

        int[][] nums = {{1,0,-1,0,-2,2},{2,2,2,2,2}};
        int[] target = {0,8};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));

            System.out.print(Arrays.deepToString(fourSum(nums[test], target[test])) + " | ");
            
            System.out.println(green("Passed"));
        }
    }

    public static int[][] fourSum(int[] numsVar, int targetVar) {
        int[][] output = new int[10][4];
        int outputSize = 0;

        int[] temp = new int[4];

        for (int i = 0; i < numsVar.length; i++) {
            for (int j = 0; j < numsVar.length; j++) {
                for (int j2 = 0; j2 < numsVar.length; j2++) {
                    for (int k = 0; k < numsVar.length; k++) {
                        if (i != j && j != j2 && j2 != k && k != i && j2 != i && j != k && (numsVar[i] + numsVar[j] + numsVar[j2] + numsVar[k]) == targetVar) {
                            temp[0] = numsVar[i];
                            temp[1] = numsVar[j];
                            temp[2] = numsVar[j2];
                            temp[3] = numsVar[k];
                            
                            Arrays.sort(temp);

                            if (!isArrayIn2DArray(temp, output)) {
                                output[outputSize++] = Arrays.copyOf(temp, 4);
                            }
                              
                        }
                    }
                }
            }
        }

        output = Arrays.copyOf(output, outputSize);
        
        
        return output;
    }

    public static Boolean isArrayIn2DArray(int[] arr, int[][] arr2D) {
        for (int[] row : arr2D) {
            if (areArraysEqual(arr, row)) {
                return true;
            }
        }

        return false;
    }

    public static Boolean areArraysEqual(int[] arr1, int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
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

