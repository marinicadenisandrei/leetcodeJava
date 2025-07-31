/* Leetcode - 57. Insert Interval (Java language) - Medium */

import java.util.ArrayList;

public class insert_interval_56 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 57. Insert Interval (Java language) - Medium"));
        
        int[][][] intervals = {{{1,3},{6,9}},{{1,2},{3,5},{6,7},{8,10},{12,16}}};
        int[][] newInterval = {{2,5},{4,8}};


        for (int test = 0; test < intervals.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(merge(intervals[test], newInterval[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<ArrayList<Integer>> merge(int[][] intervalsVar, int[] newIntervalVar) {
        ArrayList<ArrayList<Integer>> interval = new ArrayList<>();

        for (int i = 0; i < intervalsVar.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>(); 

            for (int j = 0; j < intervalsVar[i].length; j++) {
                temp.add(intervalsVar[i][j]); 
            }

            interval.add(temp);
        }

        for (int i = 0; i < interval.size() - 1; i++) {
            if (interval.get(i).get(0) <= newIntervalVar[0] && newIntervalVar[0] <= interval.get(i).get(1) && interval.get(i).get(1) <= newIntervalVar[1]) {
                interval.get(i).set(1, newIntervalVar[1]);
            }
            else if (newIntervalVar[0] < interval.get(i).get(0) && newIntervalVar[1] > interval.get(i).get(1))
            {
                interval.get(i).set(1, newIntervalVar[1]);
                interval.get(i).set(0, newIntervalVar[0]);
            }
        }

        for (int i = 0; i < interval.size() - 1; i++) {
            if (interval.get(i).get(0) <= interval.get(i + 1).get(0) && interval.get(i + 1).get(0) <= interval.get(i).get(1) && interval.get(i).get(1) <= interval.get(i + 1).get(1)) {
                interval.get(i).set(1, interval.get(i + 1).get(1));
                interval.remove(i + 1);

                i--;
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
