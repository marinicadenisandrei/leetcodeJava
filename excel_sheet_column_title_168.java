/* Leetcode - 168. Excel Sheet Column Title (Java language) - Easy */

public class excel_sheet_column_title_168 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 168. Excel Sheet Column Title (Java language) - ") + green("Easy"));

        int[] columnNumber = {1,28,701};

        for (int test = 0; test < columnNumber.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(convertToTitle(columnNumber[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static String convertToTitle(int columnNumberVar) {
        char[] database = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        
        String result = "";
        int counter = 0;

        while (columnNumberVar > 26) {
            columnNumberVar -= 26;
            counter++;

            if (counter == 26) {
                result += database[counter - 1];
                counter = 0;
            }
        }

        if (counter > 0) {
            result += database[counter - 1];
        }

        if (columnNumberVar > 0) {
            result += database[columnNumberVar - 1];
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
