/* Leetcode - 193. Valid Phone Numbers (Java language) - Easy */

public class ValidPhoneNumbers193 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 193. Valid Phone Numbers (Java language) - ") + green("Easy"));

        String[] phones = {
            "987-123-4567",
            "123 456 7890",
            "(123) 456-7890"
        };

        System.out.println(green("Test 1: "));

        validatePhoneNumbers(phones);

        System.out.println(green("Passed"));
    }

    public static void validatePhoneNumbers(String[] phonesVar) {
        String pattern = "^(\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4})$";

        for (String p : phonesVar) {
            if (p.matches(pattern)) {
                System.out.println(p);
            }
        }

        System.out.print("| ");
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
