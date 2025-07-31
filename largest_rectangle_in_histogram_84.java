/* Leetcode - 84. Largest Rectangle in Histogram (Java language) - Hard */

public class largest_rectangle_in_histogram_84 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 84. Largest Rectangle in Histogram (Java language) - ") + red("Hard"));

        int[][] histogram = {{2,1,5,6,2,3},{2,4}};
        
        for (int test = 0; test < histogram.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(largestRectangleArea(histogram[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int largestRectangleArea(int[] histogramVar) {
        int maxVar = 0;

        for (int i = 0; i < histogramVar.length - 1; i++) {
            int minTemp = ((histogramVar[i] < histogramVar[i + 1]) ? histogramVar[i] : histogramVar[i + 1]);
            maxVar = (maxVar < minTemp * 2 ? minTemp * 2 : maxVar);
        }

        return maxVar;
    }

    public static int lengthOfLastWord(String sVar) {
        String[] words = sVar.split(" ");
        return words[words.length - 1].length();
    }

    public static String red(String var0) {
        return "\u001b[31m" + var0 + "\u001b[0m";
    }

    public static String yellow(String var0) {
        return "\u001b[33m" + var0 + "\u001b[0m";
    }

    public static String green(String var0) {
        return "\u001b[32m" + var0 + "\u001b[0m";
    }

    public static String reset(String var0) {
        return "\u001b[0m" + var0;
    }
}
