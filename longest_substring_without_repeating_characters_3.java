public class longest_substring_without_repeating_characters_3 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 3. Longest Substring Without Repeating Characters (Java language) - Medium"));
        
        String[] s = {"abcabcbb","bbbbb","pwwkew"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(lengthOfLongestSubstring(s[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static int lengthOfLongestSubstring(String sVar) {
        String temp = "";
        int max = 0;
        int step = 0;

        for (int j = 0; j < sVar.length(); j++) {
            for (int i = j; i < sVar.length(); i++) {
                if (step > max) {
                    break;    
                }
                
                temp = sVar.substring(step, i);

                if (temp.indexOf(sVar.charAt(i)) != -1)
                {
                    max = ((temp.length() > max) ? temp.length() : max);
                    step = i;
                    temp = "";
                }
            }
        }

        return max;
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
