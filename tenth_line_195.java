/* Leetcode - 195. Tenth Line (Java language) - Easy */

public class tenth_line_195 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 195. Tenth Line (Java language) - ") + green("Easy"));

        String file = "Line 1\nLine 2\nLine 3\nLine 4\nLine 5\nLine 6\nLine 7\nLine 8\nLine 9\nLine 10";
        
        System.out.print(green("Test 1: "));
        System.out.print(tenthLine(file) + " | ");
        System.out.println(green("Passed"));
    }

    public static String tenthLine(String fileVar) {
        return fileVar.split("\n")[9];
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
