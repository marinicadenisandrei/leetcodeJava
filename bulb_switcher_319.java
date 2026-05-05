/* Leetcode - 319. Bulb Switcher (Java language) - Medium */

import java.util.Arrays;

public class bulb_switcher_319 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 319. Bulb Switcher (Java language) - Medium"));

        int[] n = {3,0,1};
        
        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                bulbSwitch(n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int bulbSwitch(int nVar) {
        boolean[] arr = new boolean[nVar];
        Arrays.fill(arr, true);
        int resultCount = 0;

        for (int i = 1; i < nVar; i++) {
            arr[i] = !arr[i];
        }

        for (boolean value : arr) {
            if (value) {
                resultCount++;
            }
        }

        return resultCount;
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
