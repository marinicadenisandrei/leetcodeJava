import java.util.*;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 187. Repeated DNA Sequences (Java language) - Medium"));

        String[] s = {"AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT","AAAAAAAAAAAAA"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(findRepeatedDnaSequences(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        
        for (int i = 0; i + 10 <= s.length(); i++) {
            String seq = s.substring(i, i + 10);
            if (!seen.add(seq)) {
                duplicates.add(seq);
            }
        }
        
        return new ArrayList<>(duplicates);
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
