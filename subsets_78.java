import java.util.ArrayList;

public class subsets_78 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 78. Subsets (Java language) - Medium"));

        int[][] nums = {{1,2,3},{0}};
        
        for (int test = 0; test < nums.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(subsets(nums[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] numsVar) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();    
        result.add(new ArrayList<Integer>() {});

        for (int i = 0; i < numsVar.length; i++) {
            result.add(new ArrayList<Integer>());
            result.get(result.size() - 1).add(numsVar[i]);
        }
        
        for (int i = 0; i < numsVar.length; i++) {
            for (int j = i + 1; j < numsVar.length; j++) {
                result.add(new ArrayList<Integer>());
                result.get(result.size() - 1).add(numsVar[i]);
                result.get(result.size() - 1).add(numsVar[j]);
            }
        }

        if (numsVar.length > 1) {
            result.add(new ArrayList<Integer>());
        
            for (int i = 0; i < numsVar.length; i++) {
                result.get(result.size() - 1).add(numsVar[i]);
            }
        }

        return result;
    }

    public static int mySqrt(int xVar) {
        return (int) Math.sqrt(xVar);
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
