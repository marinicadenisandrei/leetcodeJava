/* Leetcode - 174. Dungeon Game (Java language) - Hard */

public class dungeon_game_174 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 174. Dungeon Game (Java language) - ") + red("Hard"));

        int[][][] dungeon = {{{-2,-3,3},{-5,-10,1},{10,30,-5}},{{0}}};
        
        for (int test = 0; test < dungeon.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(calculateMinimumHP(dungeon[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int calculateMinimumHP(int[][] dungeonVar) {
        int f = 1;

        int rows = dungeonVar.length;
        int cols = dungeonVar[0].length;

        int[][] updated = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                updated[i][j] = dungeonVar[i][j];
            }
            updated[i][cols] = 1; 
        }

        for (int j = 0; j < cols + 1; j++) {
            updated[rows][j] = 1;
        }

        for (int i = updated[updated.length - 2].length - 2; i >= 0; i--) {
            int delta = updated[updated.length - 2][i];
            f = updated[updated.length - 2][i + 1];
            updated[updated.length - 2][i] = Math.max(1, f - delta);
        }

        for (int i = updated.length - 3; i >= 0; i--) {
            int delta = updated[i][updated[i].length - 2];
            f = updated[i + 1][updated[i].length - 2];
            updated[i][updated[i].length - 2] = Math.max(1, f - delta);
        }

        for (int i = updated.length - 3; i >= 0; i--) {
            for (int j = updated[i].length - 3; j >= 0; j--) {
                int delta = updated[i][j];
                f = Math.min(updated[i][j + 1], updated[i + 1][j]);
                updated[i][j] = Math.max(1, f - delta);
            }
        }

        return updated[0][0];
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
