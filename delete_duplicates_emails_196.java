/* Leetcode - 196. Delete Duplicate Emails (Java language) - Easy */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class delete_duplicates_emails_196 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 196. Delete Duplicate Emails (Java language) - ") + green("Easy"));

        String[] emails = {"john@example.com", "bob@example.com", "john@example.com"};
        
        System.out.print(green("Test 1: "));
        System.out.print(Arrays.toString(deleteDtuplicatesEmails(emails)) + " | ");
        System.out.println(green("Passed"));
    }

    public static String[] deleteDtuplicatesEmails(String[] emailsVar) {
        Set<String> unique = new LinkedHashSet<>(Arrays.asList(emailsVar));
        
        return unique.toArray(new String[0]);
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
