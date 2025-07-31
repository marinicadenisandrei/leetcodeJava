/* Leetcode - 39. Combination Sum (Java language) - Medium */

import java.util.Arrays;

public class combination_sum_39 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 39. Combination Sum (Java language) - Medium"));

        int[][] candidates = {{2,3,6,7},{2,3,5}};
        int[] target = {7,8};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(combinationSum(candidates[test], target[test])) + " | ");
            System.out.println(green("Passed"));    
        }
    }

    public static int[][] combinationSum(int[] candidatesVar, int targetVar) {
        int[][] results = new int[10][10];
        int resultsSize = 0;
        
        int[] starter = new int[10];
        int starterSize = 0;
        
        for (int i = 0; i < targetVar; i++) {
            double power = Math.pow(candidatesVar[0], i);
            if ((int) power > targetVar) {
                
                for (int j = 0; j < i; j++) {
                    starter[starterSize++] = candidatesVar[0];
                }

                break;
            }
        }
        
        starter = Arrays.copyOf(starter, starterSize);

        int[] copy = Arrays.copyOf(starter, starterSize);

        while (starterSize > 1) {
            for (int j = 0; j < candidatesVar.length; j++) {
                starter[starterSize - 2] = candidatesVar[j];

                for (int i = 0; i < candidatesVar.length; i++) {
                    starter[starterSize - 1] = candidatesVar[i];
                    int[] sorted = Arrays.copyOf(starter, starterSize);
                    Arrays.sort(sorted);

                    if (sumOfElementsFromArray(starter) == targetVar) {
                        if (!arrayInBigArray(sorted, results))
                        {
                            results[resultsSize++] = Arrays.copyOf(sorted, starterSize);
                        }
                    }
                }
            }
            
            starterSize--;
            starter = Arrays.copyOf(copy, starterSize);
        }

        for (int i = 0; i < candidatesVar.length; i++) {
            if (candidatesVar[i] == targetVar) {
                results[resultsSize++] = new int[] {candidatesVar[i]};
            }
        }

        results = Arrays.copyOf(results, resultsSize);
        return results;
    }

    public static int sumOfElementsFromArray(int[] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];   
        }

        return sum;
    }

    public static boolean arrayInBigArray(int[] array, int[][] bigArray) {
        boolean flag = true;

        for (int i = 0; i < bigArray.length; i++) {
            flag = true;
            
            if (bigArray[i].length == array.length) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != bigArray[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
            else
            {
                flag = false;
            }

            if (flag) {
                return true;
            }
        }

        return false;
    }

    public static int strStr(String hayStackVar, String needleVar) {
        return hayStackVar.indexOf(needleVar);   
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
