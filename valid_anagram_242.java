/* Leetcode - 242. Valid Anagram (Java language) - Easy */

import java.util.Arrays;

public class valid_anagram_242 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 242. Valid Anagram (Java language) - ") + green("Easy"));

        String[] s = {"anagram","rat"};
        String[] t = {"nagaram","car"};

        for (int test = 0; test < t.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                isAnagram(s[test], t[test]) + 
                " | " +
                green("Passed")
            );
        }
    }

    public static boolean isAnagram(String sVar, String tVar) {
        char[] sVarChars = sVar.toCharArray();
        char[] tVarChars = tVar.toCharArray();

        Arrays.sort(sVarChars);
        Arrays.sort(tVarChars);

        String sVarSorted = new String(sVarChars);
        String tVarSorted = new String(tVarChars);

        return sVarSorted.compareTo(tVarSorted) == 0;
    }

    public static String red(String var0) {
      return "\u001b[31m" + var0 + "\u001b[0m";
   }

   public static String yellow(String var0) {
      return "\u001b[33m" + var0 + "\u001b[0m";
   }

   public static String green(String var0) {
      return "\u001b[32m" + var0 + "\u001b[0m";
   }

   public static String reset(String var0) {
      return "\u001b[0m" + var0;
   }
}
