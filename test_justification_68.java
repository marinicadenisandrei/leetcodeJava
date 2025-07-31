/* Leetcode - 68. Text Justification (Java language) - Hard */

import java.util.Arrays;

public class test_justification_68 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 68. Text Justification (Java language) - ") + red("Hard"));
        
        String[][] words = {{"This", "is", "an", "example", "of", "text", "justification."}, {"What","must","be","acknowledgment","shall","be"}};
        int[] maxWidth = {16,16};

        for (int test = 0; test < maxWidth.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(fullJustify(words[test], maxWidth[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String[] fullJustify(String[] wordsVar, int maxWidthVar) {
        String[] acumulation = new String[wordsVar.length];
        int acumulationSize = 0;
        String temp = "";

        for (int i = 0; i < wordsVar.length; i++) {
            String copyTemp = temp + " " + wordsVar[i];

            if (copyTemp.length() - 2 > maxWidthVar) {
                acumulation[acumulationSize++] = temp.substring(0, temp.length() - 1);
                temp = "";
            }

            temp += wordsVar[i] + " ";
        }

        acumulation[acumulationSize++] = temp.substring(0, temp.length() - 1);
        acumulation = Arrays.copyOf(acumulation, acumulationSize);

        for (int i = 0; i < acumulation.length; i++) {
            int[] indexSpaces = new int[10];
            int indexSpacesSize = 0;

            for (int j = 0; j < acumulation[i].length(); j++) {
                if (acumulation[i].charAt(j) == ' ') {
                    indexSpaces[indexSpacesSize++] = j;
                }
            }

            int index = 0;

            if (indexSpaces[0] == 0) {
                while (acumulation[i].length() < maxWidthVar) {
                    acumulation[i] += " ";
                }
            }
            else
            {
                while (acumulation[i].length() < maxWidthVar) {
                    acumulation[i] = acumulation[i].substring(0, indexSpaces[index]) + " " + acumulation[i].substring(indexSpaces[index], acumulation[i].length());
                
                    for (int j = index; j < indexSpacesSize; j++) {
                        indexSpaces[j]++;
                    }
                    
                    if (indexSpaces[index + 1] == 0) {
                        index = 0;
                    }
                    else
                    {
                        index++;
                    }
                }
            }

            acumulation[i] = "|" + acumulation[i] + "|";
        }

        return acumulation;
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
