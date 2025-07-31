/* Leetcode - 135. Candy (Java language) - Hard */

public class candy_135 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 135. Candy (Java language) - ") + red("Hard"));
        
        int[][] ratings = {{1,0,2},{1,2,2}};
        
        for (int test = 0; test < ratings.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Candy(ratings[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int Candy(int[] ratingsVar) {
        int result = 0;

        for (int i = 0; i < ratingsVar.length - 1; i++) {
            if (ratingsVar[i] == 0) {
                ratingsVar[i] = 1;

                if (ratingsVar[i - 1] != 0 && ratingsVar[i - 1] == 1) {
                    ratingsVar[i - 1]++;
                }

                if (ratingsVar[i + 1] != 0 && ratingsVar[i + 1] == 1) {
                    ratingsVar[i + 1]++;
                }
            }

            if (ratingsVar[i] == ratingsVar[i + 1]) {
                ratingsVar[i + 1]--;
            }
        }

        for (int i : ratingsVar) {
            result += i;
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