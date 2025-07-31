/* Leetcode - 140. Word Break II (Java language) - Hard */

import java.util.ArrayList;

public class word_break_II_140 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 140. Word Break II (Java language) - ") + red("Hard"));

        String[] s = {"catsanddog","pineapplepenapple","catsandog"}; 
        String[][] wordDict = {{"cat","cats","and","sand","dog"},{"apple","pen","applepen","pine","pineapple"},{"cats","dog","sand","and","cat"}};

        for (int test = 0; test < wordDict.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(WordBreak(s[test], wordDict[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<String>> WordBreak(String sVar, String[] wordDictVar) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        
        
        while (wordDictVar.length > 0) {
            ArrayList<String> formation = new ArrayList<>();
            String temp = "";

            for (int i = 0; i < sVar.length(); i++) {
                temp += sVar.charAt(i);

                if (containString(wordDictVar, temp)) {
                    formation.add(temp);
                    temp = "";
                }
            }

            String joinerForm = String.join("", formation);
            
            if (joinerForm.compareTo(sVar) == 0) {
                result.add(formation);
            }
            else
            {
                break;
            }

            for (int i = 0; i < wordDictVar.length; i++) {
                for (int j = 0; j < formation.size(); j++) {
                    if (wordDictVar[i].indexOf(formation.get(j)) != -1 
                    && wordDictVar[i].compareTo(formation.get(j)) != 0) {

                        ArrayList<String> tempFormation = new ArrayList<>(formation);
                        tempFormation.set(j, wordDictVar[i]);
                        
                        if (j > 0) {
                            tempFormation.remove(j - 1);
                        }

                        String joiner = String.join("", tempFormation);
                        
                        if (!containsList(result, tempFormation) && joiner.compareTo(sVar) == 0) {
                            result.add(tempFormation);
                        }
                    }
                }
            }

            wordDictVar = removeFirstElement(wordDictVar);
        }
        

        return result;
    }

    public static boolean containString(String[] stringArray, String stringVar) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].compareTo(stringVar) == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsList(ArrayList<ArrayList<String>> list2D, ArrayList<String> targetList) {
        return list2D.contains(targetList);
    }

    public static String[] removeFirstElement(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];  
        }

        String[] newArray = new String[array.length - 1];
        
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        
        return newArray;  
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
