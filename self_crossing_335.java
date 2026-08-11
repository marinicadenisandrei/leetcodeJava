/* Leetcode - 335. Self Crossing (Java language) - Hard */

public class self_crossing_335 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 335. Self Crossing (Java language) - ") + red("Hard"));

        int[][] distance = {{2,1,1,2},{1,2,3,4},{1,1,1,2,1}};

        for (int test = 0; test < distance.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isSelfCrossing(distance[test]) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static boolean isSelfCrossing(int[] distanceVar) {
        for (int i = 0; i < distanceVar.length; i+=4) {
            int a = distanceVar[i + 2] - distanceVar[i];
            int b = distanceVar[i + 3] - distanceVar[i + 1];
            
            if (a <= 0 || b <= 0) {
                return true;
            }
        }

        return false;
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
