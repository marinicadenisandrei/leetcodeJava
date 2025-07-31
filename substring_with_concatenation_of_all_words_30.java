/* Leetcode - 30. Substring with Concatenation of All Words (Java language) - Hard */

import java.util.Arrays;

public class substring_with_concatenation_of_all_words_30 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 30. Substring with Concatenation of All Words (Java language) - ") + red("Hard"));
        String[] s = {"barfoothefoobarman", "wordgoodgoodgoodbestword", "barfoofoobarthefoobarman"}; 
        String[][] words = {{"foo","bar"},{"word","good","best","word"},{"bar","foo","the"}};

        for (int test = 0; test < words.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(findSubstring(s[test], words[test])) + " | ");
            System.out.println(green("Passed"));  
        }
    }

    public static int[] findSubstring(String sVar, String[] wordsVar) {
        int[] concatTemp = new int[wordsVar.length];
        int concatTempSize = 0;
        int totalCandidates = 1;
        int[] indexResults = new int[10];
        int indexResultsSize = 0;

        for (int i = 0; i < wordsVar.length; i++) {
            concatTemp[concatTempSize++] = i;
            totalCandidates *= (i + 1);
        }   

        int[] copy_concatTemp = Arrays.copyOf(concatTemp, concatTemp.length);
        int[][] concatCandidates = new int[totalCandidates][wordsVar.length];
        int concatCandidatesSize = 0;

        int index1 = 0;
        int index2 = 1;

        int temp = concatTemp[index1];
        concatTemp[index1] = concatTemp[index2];
        concatTemp[index2] = temp;

        index1++;
        index2++;

        concatCandidates[concatCandidatesSize++] = Arrays.copyOf(concatTemp, concatTempSize);

        while (!compareArrays(concatTemp, copy_concatTemp)) {
            if (index2 < concatTempSize) {
                temp = concatTemp[index1];
                concatTemp[index1] = concatTemp[index2];
                concatTemp[index2] = temp;
            }
            else
            {
                temp = concatTemp[0];
                concatTemp[0] = concatTemp[concatTempSize - 1];
                concatTemp[concatTempSize - 1] = temp;

                index1 = -1;
                index2 = 0;
            }

            index1++;
            index2++;

            concatCandidates[concatCandidatesSize++] = Arrays.copyOf(concatTemp, concatTempSize);
        }
        
        for (int i = 0; i < concatCandidates.length; i++) {
            String fromation = "";
            for (int j = 0; j < concatCandidates[i].length; j++) {
                fromation += wordsVar[concatCandidates[i][j]];
            }
            
            if (sVar.indexOf(fromation) != -1) {
                indexResults[indexResultsSize++] = sVar.indexOf(fromation);
            }
        }
        
        indexResults = Arrays.copyOf(indexResults, indexResultsSize);
        Arrays.sort(indexResults);
        return indexResults;
    }

    public static boolean compareArrays(int[] arr1, int arr2[]) {
        for (int i = 0; i < arr2.length; i++) {
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