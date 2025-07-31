/* Leetcode - 197. Rising Temperature (Java language) - Easy */

import java.util.Arrays;

public class raising_temperature_197 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 197. Rising Temperature (Java language) - ") + green("Easy"));

        int[] temperatures = {10,25,20,30};

        System.out.print(green("Test 1: "));
        System.out.print(Arrays.toString(raisingTemperature(temperatures)) + " | ");
        System.out.println(green("Passed"));
    }

    public static int[] raisingTemperature(int[] tmperaturesVar) {
        int[] result = new int[tmperaturesVar.length];
        int resultSize = 0;

        for (int i = 0; i < tmperaturesVar.length - 1; i++) {
            if (tmperaturesVar[i] < tmperaturesVar[i + 1]) {
                result[resultSize++] = i + 1;
            }
        }

        return Arrays.copyOf(result, resultSize);
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