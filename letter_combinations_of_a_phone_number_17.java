import java.util.Arrays;

public class letter_combinations_of_a_phone_number_17 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 17. Letter Combinations of a Phone Number (Java language) - Medium"));
        
        String[] phoneKey = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] digits = {"23","","2"};

        for (int test = 0; test < digits.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(letterCombinations(phoneKey, digits[test])) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String[] letterCombinations(String[] phoneKeyVar, String digitsVar) {
        String[] temp = new String[50];
        int tempSize = 0;

        String[] acumulation = new String[50];
        int acumulationSize = 0;

        if (digitsVar.length() == 0) {
            acumulation = Arrays.copyOf(acumulation, acumulationSize);
            return acumulation;
        }
        
        String extraction = phoneKeyVar[(int) Character.getNumericValue(digitsVar.charAt(0)) - 1];
        for (int i = 0; i < extraction.length(); i++) {
            acumulation[acumulationSize++] = String.valueOf(extraction.charAt(i));
        }

        for (int i = 1; i < digitsVar.length(); i++) {
            String extractionVar = phoneKeyVar[(int) Character.getNumericValue(digitsVar.charAt(i)) - 1];

            for (int j = 0; j < acumulationSize; j++) {
                for (int j2 = 0; j2 < extractionVar.length(); j2++) {
                    temp[tempSize++] = acumulation[j] + extractionVar.charAt(j2);
                }
            }

            acumulation = Arrays.copyOf(temp, 50);
            acumulationSize = tempSize;
            tempSize = 0;
        }

        acumulation = Arrays.copyOf(acumulation, acumulationSize);
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