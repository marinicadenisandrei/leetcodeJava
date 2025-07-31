/* Leetcode - 182. Duplicate Emails (Java language) - Easy */

import java.util.ArrayList;

public class duplicate_emails_182 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 182. Duplicate Emails (Java language) - ") + green("Easy"));
        
        String[] email = {"a@b.com", "c@d.com", "a@b.com"};

        System.out.print(green("Test 1: "));
        System.out.print(duplicateEmail(email) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList<String> duplicateEmail(String[] emailVar) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < emailVar.length; i++) {
            for (int j = 0; j < emailVar.length; j++) {
                if (i != j && emailVar[i] == emailVar[j] && result.indexOf(emailVar[i]) == -1) {
                    result.add(emailVar[i]);

                    break;
                }
            }
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
