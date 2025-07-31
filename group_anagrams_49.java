/* Leetcode - 49. Group Anagrams (Java language) - Medium */

import java.util.ArrayList;
import java.util.Arrays;

public class group_anagrams_49 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 49. Group Anagrams (Java language) - Medium"));

        String[][] strs = {{"eat","tea","tan","ate","nat","bat"}, {""}, {"a"}};

        for (int test = 0; test < strs.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.deepToString(groupAnagrams(strs[test])) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String[][] groupAnagrams(String[] strsVar) {
        ArrayList<String> sortedStringsArray = new ArrayList<>();
        ArrayList<String> noDuplicates = new ArrayList<>();

        for (int i = 0; i < strsVar.length; i++) {
            char[] charArray = strsVar[i].toCharArray();
            Arrays.sort(charArray);
            sortedStringsArray.add(new String(charArray));
        }

        for (String str : sortedStringsArray) {
            if (noDuplicates.indexOf(str) == -1) {
                noDuplicates.add(str);
            }
        }

        String[][] result = new String[noDuplicates.size()][5];
        int resultSize = 0;
        int resultInSize = 0;

        for (int i = 0; i < noDuplicates.size(); i++) {
            String str1 = new String(noDuplicates.get(i));

            for (int j = 0; j < sortedStringsArray.size(); j++) {
                String str2 = new String(sortedStringsArray.get(j));

                if (str1.compareTo(str2) == 0) {
                    result[resultSize][resultInSize++] = strsVar[j];   
                }
            }

            result[resultSize] = Arrays.copyOf(result[resultSize], resultInSize);
            resultInSize = 0;
            resultSize++;
        }

        return result;
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
