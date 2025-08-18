/* Leetcode - 224. Basic Calculator (Java language) - Hard */

public class basic_calculator_224 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 224. Basic Calculator (Java language) - ") + red("Hard"));

        String[] s = {"1 + 1"," 2-1 + 2","(1+(4+5+2)-3)+(6+8)"};
        
        for (int test = 0; test < s.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                calculate(s[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static int calculate(String sVar) {
        sVar = sVar.replaceAll(" ", "");
        sVar = "(" + sVar + ")";
        boolean flag = true;

        while (flag) {
            flag = false;
            int startIndex = 0;
            int endIndex = 0;

            for (int i = 0; i < sVar.length(); i++) {
                startIndex = ((sVar.charAt(i) == '(') ? i : startIndex);

                if (sVar.charAt(i) == ')') {
                    endIndex = i;
                    flag = true;
                    break;
                }
            }

            if (endIndex == 0) {
                break; 
            }

            String temp = "";
            char op = '+';
            int result = 0;

            for (int i = startIndex + 1; i <= endIndex; i++) {
                char c = sVar.charAt(i);

                if (Character.isDigit(c)) {
                    temp += c;
                } else {
                    switch (op) {
                        case '+':
                            result += Integer.valueOf(temp);
                            break;
                        case '-':
                            result -= Integer.valueOf(temp);
                            break;
                        default:
                            break;
                    }
                    
                    temp = "";
                    op = sVar.charAt(i);
                }
            }

            String new_expr = sVar.substring(0, startIndex) + String.valueOf(result) + sVar.substring(endIndex + 1);
            sVar = new_expr;
        }

        return Integer.valueOf(sVar);
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
