/* Leetcode - 227. Basic Calculator II (Java language) - Medium */

public class basic_calculator_II_227 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 227. Basic Calculator II (Java language) - Medium"));

        String[] s = {"3+2*2"," 3/2 "," 3+5 / 2 "};

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
        boolean flag = true;
        int switchOperators = 0;

        while (flag) {
            flag = false;

            int indexFound = 0;

            for (int i = 0; i < sVar.length(); i++) {
                if (sVar.charAt(i) == ((switchOperators == 0) ? '*' : '+') || sVar.charAt(i) == ((switchOperators == 0) ? '/' : '-')) {
                    indexFound = i;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                if (switchOperators < 1) {
                    switchOperators++;
                    flag = true;
                    continue;
                }
                else
                {
                    flag = false;
                }
            }

            if (!flag) {
                break;
            }

            String firstOp = "";
            String secondOp = "";

            int leftIndex = 0;
            int rightIndex = 0;

            int it = indexFound - 1;

            try {
                while (sVar.charAt(it) != '*' && sVar.charAt(it) != '/' && sVar.charAt(it) != '+' && sVar.charAt(it) != '-') {
                firstOp += sVar.charAt(it);
                it--;
            }
            } catch (Exception e) {}

            leftIndex = it + 1;
            it = indexFound + 1;
            
            try {
                while (sVar.charAt(it) != '*' && sVar.charAt(it) != '/' && sVar.charAt(it) != '+' && sVar.charAt(it) != '-') {
                secondOp += sVar.charAt(it);
                it++;
            }
            } catch (Exception e) {}

            rightIndex = it;

            int result = 0;

            if (switchOperators == 0) {
                switch (sVar.charAt(indexFound)) {
                    case '*':
                        result = Integer.parseInt(firstOp) * Integer.valueOf(secondOp); 
                        break;
                    case '/':
                        result = Integer.parseInt(firstOp) / Integer.valueOf(secondOp); 
                        break;
                    default:
                        break;
                }
            }
            else if (switchOperators == 1) {
                switch (sVar.charAt(indexFound)) {
                    case '+':
                        result = Integer.parseInt(firstOp) + Integer.valueOf(secondOp); 
                        break;
                    case '-':
                        result = Integer.parseInt(firstOp) - Integer.valueOf(secondOp); 
                        break;
                    default:
                        break;
                }
            }

            String new_expr = sVar.substring(0, leftIndex) + String.valueOf(result) + sVar.substring(rightIndex);
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
