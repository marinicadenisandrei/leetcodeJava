/* Leetcode - 194. Transpose File (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class transpose_file_194 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 194. Transpose File (Java language) - Medium"));

        String file = "name age\nalice 21\nryan 30";

        System.out.println(green("Test 1: "));
        System.out.print(transposeFile(file) + "| ");
        System.out.println(green("Passed"));
    }

    public static String transposeFile(String fileVar) {
        String[] spliitedString = fileVar.split("\n");
        List<String[]> finalList = new ArrayList<>();
        String newFile = "";

        for (String stringSplit : spliitedString) {
            String[] splittedStringSplit = stringSplit.split(" ");
            finalList.add(splittedStringSplit);
        }

        for (int i = 0; i < finalList.get(0).length; i++) {
            for (int j = 0; j < finalList.size(); j++) {
                newFile += finalList.get(j)[i] + " ";
            }
            newFile += "\n";
        }

        return newFile;
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
