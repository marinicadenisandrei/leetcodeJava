/* Leetcode - 87. Scramble String (Java language) - Hard */

import java.util.ArrayList;

public class scramble_string_87 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 87. Scramble String (Java language) - ") + red("Hard"));
        String[] s1 = {"great","abcde","a"};
        String[] s2 = {"rgeat","caebd","a"};

        for (int test = 0; test < s2.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isScramble(s1[test], s2[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isScramble(String s1Var, String s2Var) {
        ArrayList<String> result = new ArrayList<>();
        result.add(s1Var);
        result.add("|");
        boolean flag = true;


        while (flag) {
            ArrayList<String> temp = new ArrayList<>();
            flag = false;

            for (int i = 0; i < result.size(); i+=2) {
                if (result.get(i).length() > 1 && result.get(i + 1) == "|") {
                    int midVar = result.get(i).length() / 2;
                    
                    if (result.get(i).length() <= 3) {
                        temp.add(result.get(i).substring(0, midVar));
                        temp.add("x");
                        temp.add(result.get(i).substring(midVar, result.get(i).length()));
                        temp.add("x");
                    }
                    else
                    {
                        temp.add(result.get(i).substring(0, midVar));
                        temp.add("|");
                        temp.add(result.get(i).substring(midVar, result.get(i).length()));
                        temp.add("|");

                        flag = true;
                    }
                }
                else
                {
                    temp.add(result.get(i));
                    temp.add("|");
                }
            }

            result = temp;
        }

        result.removeIf(s -> s.equals("x"));

        for (int i = 0; i < result.size(); i++) {
            if (s2Var.indexOf(result.get(i)) == -1) {
                return false;
            };
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
