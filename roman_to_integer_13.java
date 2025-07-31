/* Leetcode - 13. Roman to Integer (Java language) - Easy  */

public class roman_to_integer_13 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 13. Roman to Integer (Java language) - ") + green("Easy"));

        String[] symbol = {"I","V","X","L","C","D","M"};
        int[] value = {1,5,10,50,100,500,1000};
        String[] s = {"III","LVIII","MCMXCIV"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));

            System.out.print(romanToInt(s[test], symbol, value) + " | ");   

            System.out.println(green("Passed"));
        } 
    }

    public static int romanToInt(String sVar, String[] symbolVar, int[] valueVar) {
        int result = 0;

        for (int i = 0; i < sVar.length(); i++) {
            int current = 0;
            int next = 0;

            for (int j = 0; j < symbolVar.length; j++) {
                if (String.valueOf(sVar.charAt(i)).equals(symbolVar[j])) {
                    current = valueVar[j];
                }
                
                if (i + 1 < sVar.length()) {
                    if (String.valueOf(sVar.charAt(i + 1)).equals(symbolVar[j])) {
                        next = valueVar[j];
                    }
                }
            }

            if (current < next) {
                result += (next - current);
                i++;
            }
            else
            {
                result += current;
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
