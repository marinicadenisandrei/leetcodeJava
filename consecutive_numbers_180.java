/* Leetcode - 180. Consecutive Numbers (Java language) - Medium */

import java.util.ArrayList;

public class consecutive_numbers_180 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 180. Consecutive Numbers (Java language) - Medium"));
        
        int[] num = {1,1,1,2,1,2,2};

        System.out.print(green("Test 1: "));
        System.out.print(consecutiveNumbers(num) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList consecutiveNumbers(int[] numVar) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> noDuplicates = new ArrayList<Integer>();

        for (int i = 0; i < numVar.length; i++) {
            if (noDuplicates.indexOf(numVar[i]) == -1) {
                noDuplicates.add(numVar[i]);
            }
        }

        for (int i = 0; i < noDuplicates.size(); i++) {
            int counter = 0;

            for (int j = 0; j < numVar.length; j++) {
                if (numVar[j] == noDuplicates.get(i)) {
                    counter++;
                }
            }

            if (counter > 3) {
                result.add(noDuplicates.get(i));
            }
        }

        return result;
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
