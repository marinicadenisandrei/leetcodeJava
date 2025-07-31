/* Leetcode - 67. Add Binary (Java language) - Easy */

public class add_binary_67 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 67. Add Binary (Java language) - ") + green("Easy"));
        String[] a = {"11","1010"};
        String[] b = {"1","1011"};

        for (int test = 0; test < b.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(addBinary(a[test], b[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String addBinary(String aVar, String bVar) {
        int sumVar = Integer.parseInt(aVar,2) + Integer.parseInt(bVar,2);
        String result = Integer.toBinaryString(sumVar);

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
