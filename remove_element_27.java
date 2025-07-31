/* Leetcode - 27. Remove Element (Java language) - Easy */

import java.util.Arrays;

public class remove_element_27 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 27. Remove Element (Java language) - ") + green("Easy"));

        int[][] nums = {{3,2,2,3},{0,1,2,2,3,0,4,2}};
        int[] val = {3,2};

        for (int test = 0; test < val.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(removeElement(nums[test], val[test]) + ", " + Arrays.toString(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }   
    }

    public static int removeElement(int[] numsVar, int valVar) {
        int[] copyOfNums = Arrays.copyOf(numsVar, numsVar.length);
        int numVarSize = 0;

        for (int i = 0; i < copyOfNums.length; i++) {
            if (copyOfNums[i] != valVar) {
                numsVar[numVarSize++] = copyOfNums[i]; 
            }
        }

        Arrays.fill(numsVar, numVarSize, numsVar.length, 0);

        return numVarSize;
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
