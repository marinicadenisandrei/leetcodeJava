/* Leetcode - 200. Number of Islands (Java language) - Medium */

public class number_of_islands_200 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 200. Number of Islands (Java language) - Medium"));

        String[][][] grid = {{
            {"1","1","1","1","0"},
            {"1","1","0","1","0"},
            {"1","1","0","0","0"},
            {"0","0","0","0","0"}
        },
        {
            {"1","1","0","0","0"},
            {"1","1","0","0","0"},
            {"0","0","1","0","0"},
            {"0","0","0","1","1"}
        }};

        for (int test = 0; test < grid.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(numIslands(grid[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int numIslands(String[][] gridVar) {
        int noOfIslands = 0;

        for (int i = 0; i < gridVar.length; i++) {
            for (int j = 0; j < gridVar[i].length; j++) {
                if (gridVar[i][j].compareTo("1") == 0) {
                    noOfIslands++;


                    for (int j2 = j; j2 < gridVar.length; j2++) {
                        if (gridVar[j2][i].compareTo("0") == 0) {
                            i = j2;
                        }
                    }

                    for (int j2 = i; j2 < gridVar[i].length; j2++) {
                        if (gridVar[i][j2].compareTo("0") == 0) {
                            j = j2;
                        }
                    }
                }
            }   
        }

        return noOfIslands;
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
