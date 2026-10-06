/* Leetcode - 345. Reverse Vowels of a String (Java language) - Easy */

public class reverse_vowels_of_a_string_345 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 345. Reverse Vowels of a String (Java language) - ") + green("Easy"));
        
        String[] s = {"IceCreAm","leetcode"};

        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                reverseVowels(s[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static String reverseVowels(String sVar) {
        char[] chars = sVar.toCharArray();

        String vowels = "aeiou";
        int left = 0;
        int right = sVar.length() - 1;

        while (left < right) {
            boolean leftIsVowel = vowels.indexOf(Character.toLowerCase(chars[left])) != -1;
            boolean rightIsVowel = vowels.indexOf(Character.toLowerCase(chars[right])) != -1;

            if (leftIsVowel && rightIsVowel) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            if (!leftIsVowel) {
                left++;
            }

            if (!rightIsVowel) {
                right--;
            }
        }

        sVar = new String(chars);

        return sVar;
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