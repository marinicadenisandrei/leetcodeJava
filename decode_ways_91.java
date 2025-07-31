/* Leetcode - 91. Decode Ways (Java language) - Medium */

import java.util.ArrayList;

public class decode_ways_91 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 91. Decode Ways (Java language) - Medium"));
        String[] s = {"12","226","06"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(numDecodings(s[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }   

    public static int numDecodings(String sVar) {
        ArrayList<String> acumulation = new ArrayList<>();
        acumulation.add(sVar);
        boolean flag = true;
        int counter = 1;

        for (int i = 0; i < sVar.length(); i++) {
            int numberVar = sVar.charAt(i) - '0';
            if (numberVar < 1 || numberVar > 27) {
                counter = 0;
                break;
            }            
        }

        while (flag) {
            flag = false;
            ArrayList<String> temp = new ArrayList<>();

            for (int i = 0; i < acumulation.size(); i++) {
                int middle = acumulation.get(i).length() / 2;
                
                if (middle > 0) {
                    temp.add(acumulation.get(i).substring(0,middle));
                    temp.add(acumulation.get(i).substring(middle, acumulation.get(i).length()));
                    flag = true;
                }
            }

            acumulation = temp;
            boolean niceCandidate = true;

            if (acumulation.size() == 0) {
                break;
            }
            
            for (int i = 0; i < acumulation.size(); i++) {
                if (Integer.parseInt(acumulation.get(i)) < 1 || Integer.parseInt(acumulation.get(i)) > 27) {
                    niceCandidate = false;
                    break;
                }
            }

            if (niceCandidate) {
                counter++;
            }
        }

        return counter;
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
