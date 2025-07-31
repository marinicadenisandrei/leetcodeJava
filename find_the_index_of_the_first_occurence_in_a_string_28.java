/* Leetcode - 28. Find the Index of the First Occurrence in a String (Java language) - Easy */

public class find_the_index_of_the_first_occurence_in_a_string_28 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 28. Find the Index of the First Occurrence in a String (Java language) - ") + green("Easy"));

        String[] haystack = {"sadbutsad","leetcode"};
        String[] needle = {"sad","leeto"};

        for (int test = 0; test < needle.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(strStr(haystack[test], needle[test]) + " | ");
            System.out.println(green("Passed"));   
        }
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