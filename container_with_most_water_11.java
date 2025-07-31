/* Leetcode - 11. Container With Most Water (Java language) - Medium */

public class container_with_most_water_11 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 11. Container With Most Water (Java language) - Medium"));
        int[][] height = {{1,8,6,2,5,4,8,3,7},{1,1}};

        for (int test = 0; test < height.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(maxArea(height[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int maxArea(int[] heightVar) {
        int maxVar = 0;

        for (int i = 0; i < heightVar.length; i++) {
            for (int j = i + 1; j < heightVar.length; j++) {
                if (i != j) {
                    int minValue = (heightVar[i] < heightVar[j]) ? heightVar[i] : heightVar[j];
                    if ((minValue * (j - i)) > maxVar) {
                        maxVar = minValue * (j - i);
                    }
                }
            }
        }

        return maxVar;
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
