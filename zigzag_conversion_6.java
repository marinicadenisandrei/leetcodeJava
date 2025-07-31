/* Leetcode - 6. Zigzag Conversion (Java language) - Medium */

import java.util.Arrays;

public class zigzag_conversion_6 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 6. Zigzag Conversion (Java language) - Medium"));
        
        String[] s = {"PAYPALISHIRING","PAYPALISHIRING"};
        int[] numRows = {3,4};

        for (int test = 0; test < numRows.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(convert(s[test], numRows[test]) + " | ");    
            System.out.println(green("Passed"));
        }
    } 

    public static String convert(String sVar, int numsRowsVar) {
        String[] acumulation = new String[10];
        int acumulationSize = 0;
        String temp = "";
        String result = "";

        int c1 = 0;
        int c2 = numsRowsVar;
        int remain = 0;
        int add = (int)(numsRowsVar / 2);

        while (c2 < sVar.length()) {
            for (int i = c1; i < c2; i++) {
                temp += sVar.charAt(i);
                remain++;
            }
    
            acumulation[acumulationSize++] = temp;
            temp = "0";
    
            c1 = c2;
            c2 += add;
    
            for (int i = c1; i < c2; i++) {
                temp += sVar.charAt(i);
                remain++;
            }
            
            temp += "0";
            String reversed = new StringBuilder(temp).reverse().toString();
            acumulation[acumulationSize++] = reversed;
            temp = "";
    
            c1 = c2;
            c2 += numsRowsVar;
            temp = "";
        }

        if (remain < sVar.length()) {
            while (remain < sVar.length()) {
                temp += sVar.charAt(remain);
                remain++;
            }

            while (temp.length() < numsRowsVar) {
                temp += "0";
            }

            acumulation[acumulationSize++] = temp;
        }

        acumulation = Arrays.copyOf(acumulation, acumulationSize);

        for (int i = 0; i < acumulation[0].length(); i++) {
            for (int j = 0; j < acumulation.length; j++) {
                result += acumulation[j].charAt(i);
            }
        }

        while (result.contains("0")) {
            result = result.replace("0", "");
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
