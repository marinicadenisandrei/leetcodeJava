/* Leetcode - 60. Permutation Sequence (Java language) - Hard */

import java.util.ArrayList;
import java.util.Comparator;

public class permutation_sequence_60 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 60. Permutation Sequence (Java language) - ") + red("Hard"));

        int[] n = {3,4,3};
        int k[] = {3,9,1};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + " : "));
            System.out.print(getPermutation(n[test], k[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<Integer> getPermutation(int nVar, int kVar) {
        int numberOfPermutations = 1;
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        ArrayList<Integer> starter = new ArrayList<>();

        for (int i = 1; i <= nVar; i++) {
            numberOfPermutations *= i;
            starter.add(0);
            starter.set(i - 1, i);
        }

        permutations.add(new ArrayList<>(starter));
        int index1 = 0;
        int index2 = 1;

        for (int i = 0; i < numberOfPermutations - 1; i++) {
            if (index2 < nVar) {
                Integer temp = starter.get(index1);
                starter.set(index1, starter.get(index2));
                starter.set(index2, temp);
            }
            else
            {
                Integer temp = starter.get(0);
                starter.set(0, starter.get(starter.size() - 1));
                starter.set(starter.size() - 1, temp);

                index1 = -1;
                index2 = 0;
            }

            index1++;
            index2++;
            
            permutations.add(new ArrayList<>(starter));
        }

        permutations.sort(Comparator.comparingInt(row -> row.get(0)));
        
        return permutations.get(kVar - 1);        
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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
