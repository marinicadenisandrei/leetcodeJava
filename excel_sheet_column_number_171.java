/* Leetcode - 171. Excel Sheet Column Number (Java language) - Easy */

public class excel_sheet_column_number_171 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 171. Excel Sheet Column Number (Java language) - ") + green("Easy"));

        String[] columnTitle = {"A","AB","ZY"};
        
        for (int test = 0; test < columnTitle.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(titleToNumber(columnTitle[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int titleToNumber(String coluStringVar) {
        int result = 0;

        for (int i = 0; i < coluStringVar.length() - 1; i++) {
            result += 26 * (indexOfChar(coluStringVar.charAt(i)) + 1);
        }

        result += (indexOfChar(coluStringVar.charAt(coluStringVar.length() - 1)) + 1);
        
        return result;
    }

    public static int indexOfChar(char c) {
        char[] database = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        int index = -1;
        
        for (int i = 0; i < database.length; i++) {
            if (database[i] == c) {
                index = i;
                break;
            }
        }

        return index;
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
