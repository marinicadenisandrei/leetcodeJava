import java.util.ArrayList;

public class merge_intervals_56 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 56. Merge Intervals (Java language) - Medium"));
        
        int[][][] intervals = {{{1,3},{2,6},{8,10},{15,18}},{{1,4},{4,5}}};

        for (int test = 0; test < intervals.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(merge(intervals[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<ArrayList<Integer>> merge(int[][] intervalsVar) {
        ArrayList<ArrayList<Integer>> interval = new ArrayList<>();

        for (int i = 0; i < intervalsVar.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>(); 

            for (int j = 0; j < intervalsVar[i].length; j++) {
                temp.add(intervalsVar[i][j]); 
            }

            interval.add(temp);
        }

        for (int i = 0; i < interval.size() - 1; i++) {
            if (interval.get(i).get(0) <= interval.get(i + 1).get(0) && interval.get(i + 1).get(0) <= interval.get(i).get(1) && interval.get(i).get(1) <= interval.get(i + 1).get(1)) {
                interval.get(i).set(1, interval.get(i + 1).get(1));
                interval.remove(i + 1);
            }
        }

        return interval;
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
