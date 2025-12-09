/* Leetcode - 295. Find Median from Data Stream - Hard  */

import java.util.LinkedList;

class MedianFinder {
    final private LinkedList<Integer> arr = new LinkedList<>();

    public void addNum(int num) {
        arr.add(num);
    }

    public double findMedian() {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return  (double) sum / arr.size();
    }
}

public class find_median_from_data_stream_295 {
    public static void main(String[] args) {
        
        System.out.println(yellow("Leetcode - 295. Find Median from Data Stream - ") + red("Hard"));
        System.out.print(green("Test 1: "));
        
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.print(medianFinder.findMedian() + " ");
        medianFinder.addNum(3);
        System.out.print(medianFinder.findMedian() + " ");
        
        System.out.print("| ");
        System.out.println(green("Passed"));
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
