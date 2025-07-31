/* Leetcode - 35. Search Insert Position (Java language) - Easy */

public class search_insert_position_35 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 35. Search Insert Position (Java language) - ") + green("Easy"));
        int[][] nums = {{1,3,5,6},{1,3,5,6},{1,3,5,6}}; 
        int[] target = {5,2,7};

        for (int test = 0; test < target.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(searchInsert(nums[test], target[test]) + " | ");  
            System.out.println(green("Passed")); 
        }
    }

    public static int searchInsert(int[] numsVar, int targetVar) {
        int index = -1;
        int normalPos = -1;

        for (int i = 0; i < numsVar.length; i++) {
            if (numsVar[i] == targetVar) {
                index = i;
            }

            if (targetVar < numsVar[i]) {
                normalPos = i;
                break;
            }
        }

        if (normalPos == -1) {
            return numsVar.length;
        }
        else if (index == -1) {
            return normalPos;
        }
        
        return index;
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
