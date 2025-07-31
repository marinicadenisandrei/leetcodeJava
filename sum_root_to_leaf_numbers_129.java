/* Leetcode - 129. Sum Root to Leaf Numbers (Java language) - Medium */

import java.util.ArrayList;

public class sum_root_to_leaf_numbers_129 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 129. Sum Root to Leaf Numbers (Java language) - Medium"));
        int[][] root = {{1,2,3},{4,9,0,5,1,0,0}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(SumNumbers(root[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int SumNumbers(int[] rootVar) {
        ArrayList<ArrayList<Integer>> structure = new ArrayList<>(); 

        int result = 0;

        int level = 0;
        int depth = 0;
        int powVar = 2;
        int lenVar = rootVar.length;

        while (lenVar > 0) {
            lenVar -= powVar;
            powVar *= 2;
            level++;
        }

        depth = (int)(powVar / 4);

        int index = 0;
        int power = depth;
        int counter = 0;

        for (int j = 0; j < level; j++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < depth; i++) {
                if (counter == power) {
                    index++;
                    counter = 0;
                }

                temp.add(index);
                counter++;
            }

            counter = 0;
            index++;
            power /= 2;

            structure.add(temp);
        }

        boolean flag = false;

        for (int i = 0; i < structure.get(0).size(); i++) {
            String formation = "";

            for (int j = 0; j < structure.size(); j++) {
                formation += Integer.toString(rootVar[structure.get(j).get(i)]);

                if (rootVar[structure.get(j).get(i)] == 0) {
                    flag = true;
                    break;
                }
            }

            result += Integer.parseInt(formation);

            if (flag) {
                break;
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
