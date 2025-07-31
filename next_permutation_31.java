/* Leetcode - 31. Next Permutation (Java language) - Medium */

import java.util.Arrays;

public class next_permutation_31 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 31. Next Permutation (Java language) - Medium"));
        
        int[][] nums = {{1,2,3},{3,2,1},{1,1,5}};

        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(nextPermutation(nums[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int[] nextPermutation(int[] numsVar) {
        int permutationNumber = 1;
        int[] numsVar_copy = Arrays.copyOf(numsVar, numsVar.length);

        for (int i = 0; i < numsVar.length; i++) {
            permutationNumber *= i + 1;
        }
        
        int[][] permutations = new int[permutationNumber][numsVar.length];
        int permutationsSize = 0;
        
        int index1 = 0;
        int index2 = 1;
        int temp = 0;

        temp = numsVar[index1];
        numsVar[index1++] = numsVar[index2];
        numsVar[index2++] = temp;

        permutations[permutationsSize++] = Arrays.copyOf(numsVar, numsVar.length);

        for (int i = 0; i < permutationNumber - 1; i++) {
            if (index2 < numsVar.length) {
                temp = numsVar[index1];
                numsVar[index1] = numsVar[index2];
                numsVar[index2] = temp;
            }
            else
            {
                temp = numsVar[0];
                numsVar[0] = numsVar[numsVar.length - 1];
                numsVar[numsVar.length - 1] = temp;

                index1 = -1;
                index2 = 0;
            }

            index1++;
            index2++;

            permutations[permutationsSize++] = Arrays.copyOf(numsVar, numsVar.length);
        }

        Arrays.sort(permutations, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0; 
        });
        
        int indexResult = 0;

        for (int i = 0; i < permutations.length - 1; i++) {
            if (arraysEqual(permutations[i], numsVar_copy) && !arraysEqual(permutations[i + 1], numsVar_copy)) {
                indexResult = ((i + 1 < permutations.length) ? i + 1 : 0);
                break;
            }
        }

        return permutations[indexResult];
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
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
