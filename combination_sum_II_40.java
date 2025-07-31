import java.util.Arrays;

public class combination_sum_II_40 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 40. Combination Sum II (Java language) - Medium"));

        int[][] candidates = {{10,1,2,7,6,1,5},{2,5,2,1,2}}; 
        int[] target = {8,5};

        for (int test = 0; test < candidates.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(combinationSum2(candidates[test], target[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int[][] combinationSum2(int[] candidatesVar, int targetVar) {
        int[][] result = new int[10][10];
        int resultSize = 0;

        int index1 = 0;
        int index2 = 1;

        while (candidatesVar.length > 4) {
            while (index2 < candidatesVar.length) {
                int sum = 0;
    
                int[] acumulation = new int[candidatesVar.length];
                int acumulationSize = 0;
    
                for (int i = 0; i < candidatesVar.length / 2; i++) {
                    sum += candidatesVar[i];
                    acumulation[acumulationSize++] = candidatesVar[i];
    
                    if (sum >= targetVar) {
                        acumulation = Arrays.copyOf(acumulation, acumulationSize);
                        Arrays.sort(acumulation);

                        if (!arrayInBigArray(acumulation, result) && sum == targetVar) {
                            result[resultSize++] = acumulation;
                        }
                        acumulation = new int[candidatesVar.length];
                        sum = 0;
                        acumulationSize = 0;
                    }
    
                    sum += candidatesVar[candidatesVar.length - 1 - i];
                    acumulation[acumulationSize++] = candidatesVar[candidatesVar.length - 1 - i];
                    
                    if (sum >= targetVar) {
                        acumulation = Arrays.copyOf(acumulation, acumulationSize);
                        Arrays.sort(acumulation);

                        if (!arrayInBigArray(acumulation, result) && sum == targetVar) {
                            result[resultSize++] = acumulation;
                        }

                        acumulation = new int[candidatesVar.length];
                        sum = 0;
                        acumulationSize = 0;
                    }
                }

                for (int i = 0; i < candidatesVar.length; i++) {
                    sum += candidatesVar[i];
                    acumulation[acumulationSize++] = candidatesVar[i];
    
                    if (sum >= targetVar) {
                        acumulation = Arrays.copyOf(acumulation, acumulationSize);
                        Arrays.sort(acumulation);

                        if (!arrayInBigArray(acumulation, result) && sum == targetVar) {
                            result[resultSize++] = acumulation;
                        }

                        acumulation = new int[candidatesVar.length];
                        sum = 0;
                        acumulationSize = 0;
                    }
                }
    
                int temp = candidatesVar[index1];
                candidatesVar[index1] = candidatesVar[index2];
                candidatesVar[index2] = temp;
    
                index1++;
                index2++;
            }   

            Arrays.sort(candidatesVar);
            candidatesVar = Arrays.copyOf(candidatesVar, candidatesVar.length - 1);
            index1 = 0;
            index2 = 1;
        }

        result = Arrays.copyOf(result, resultSize);
        return result;
    }

    public static boolean compareTwoArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean arrayInBigArray(int[] arr1, int[][] bigArray) {
        for (int i = 0; i < bigArray.length; i++) {
            if (compareTwoArrays(arr1, bigArray[i])) {
                return true;
            }
        }

        return false;
    }

    public static int divide(int dividendVar, int divisorVar) {
        return (int) dividendVar / divisorVar;
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
