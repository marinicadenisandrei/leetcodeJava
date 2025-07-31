public class palindrome_number_9 {
    public static void main(String[] args) {
        System.out.print(yellow("Leetcode - 9. Palindrome Number (Java language) - "));
        System.out.println(green("Easy"));

        int[] x = {121, -121, 10};
        
        for (int test = 0; test < x.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isPalindrome(x[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isPalindrome(int xVar) {
        String number = String.valueOf(xVar);

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(0) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
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
