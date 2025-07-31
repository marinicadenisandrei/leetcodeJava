/* Leetcode - 126. Word Ladder II (Java language) - Hard */

import java.util.ArrayList;
import java.util.List;

public class word_ladder_II_126 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 126. Word Ladder II (Java language) - ") + red("Hard"));
        
        String[] beginWord = {"hit","hit"}; 
        String[] endWord = {"cog","cog"};

        ArrayList<ArrayList<String>> wordList = new ArrayList<>();
        ArrayList<String> test1 = new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"));
        ArrayList<String> test2 = new ArrayList<>(List.of("hot","dot","dog","lot","log")); 

        wordList.add(test1);
        wordList.add(test2);

        for (int test = 0; test < endWord.length; test++) {
            System.out.print(green("Test " + (test + 1) + " "));
            System.out.print(FindLadders(beginWord[test], endWord[test], wordList.get(test)) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<String>> FindLadders(String beginStringVar, String endWordVar, ArrayList<String> wordListVar) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        if (wordListVar.indexOf(endWordVar) == -1) {
            return result;
        }

        ArrayList<String> acumulation = new ArrayList<>();
        acumulation.add(beginStringVar);

        boolean flag = true;
        String beginCopy = new String(beginStringVar);

        while (flag) {
            flag = false;

            for (int i = 0; i < wordListVar.size(); i++) {
                int same1 = 0;
                int same2 = 0;
    
                for (int j = 0; j < wordListVar.get(i).length(); j++) {
                    if (wordListVar.get(i).charAt(j) == endWordVar.charAt(j)) {
                        same1++;
                    }
                }
    
                for (int j = 0; j < beginStringVar.length(); j++) {
                    if (beginStringVar.charAt(j) == endWordVar.charAt(j)) {
                        same2++;
                    }
                }
    
                if (same1 >= same2) {
                    if (same1 == endWordVar.length() - 1) {
                        acumulation.add(wordListVar.get(i));
                        acumulation.add(endWordVar);
                        
                        wordListVar.remove(wordListVar.get(i - 1));
                        wordListVar.remove(wordListVar.get(i - 1));
                        
                        result.add(acumulation);

                        acumulation = new ArrayList<String>();
                        acumulation.add(beginCopy);

                        beginStringVar = new String(beginCopy);
    
                        flag = true;
                        break;
                        
                    } else {
                        acumulation.add(wordListVar.get(i));
                        beginStringVar = wordListVar.get(i);
                    }
                } else {
                    continue;
                }
            }
        }

        return result;
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
