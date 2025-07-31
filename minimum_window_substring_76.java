public class minimum_window_substring_76 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 76. Minimum Window Substring (Java language) - ") + red("Hard"));

        String[] s = {"ADOBECODEBANC","a","a"};
        String[] t = {"ABC","a","aa"};

        for (int test = 0; test < t.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(minWindow(s[test], t[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String minWindow(String sVar, String tVar) {
        if (sVar == tVar) {
            return tVar;
        } else if (sVar.length() < tVar.length()) {
            return "";
        }

        String candidate = new String(sVar);

        for (int i = 0; i <= sVar.length(); i++) {
            String temp = sVar.substring(0, i);
            if (charactersInString(temp, tVar) && temp.length() < candidate.length()) {
                candidate = temp;
            }
        }

        for (int i = sVar.length(); i >= 0; i--) {
            String temp = sVar.substring(i);
            if (charactersInString(temp, tVar) && temp.length() < candidate.length()) {
                candidate = temp;
            }
        }

        return candidate;
    }

    public static boolean charactersInString(String stringVar, String substringVar) {
        for (int i = 0; i < substringVar.length(); i++) {
            boolean flag = false;

            for (int j = 0; j < stringVar.length(); j++) {
                if (substringVar.charAt(i) == stringVar.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return false;
            }
        }

        return true;
    }

    public static String multiply(String num1Var, String num2Var) {
        return Integer.toString(Integer.parseInt(num1Var) * Integer.parseInt(num2Var)); 
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
