/* Leetcode - 257. Binary Tree Paths (Java language) - Easy */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class binary_tree_paths_257 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 257. Binary Tree Paths (Java language) - ") + green("Easy"));

        int[][] root = {{1,2,3,0,5},{1}};
        
        for (int test = 0; test < root.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                binaryTreePaths(root[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<String> binaryTreePaths(int[] rootVar) {
        if (rootVar.length == 1) {
            return new ArrayList<>(Arrays.asList(String.valueOf(rootVar[0])));
            
        }

        ArrayList<Integer> newRoot = new ArrayList<>(
            Arrays.stream(rootVar)       
                  .boxed()               
                  .collect(Collectors.toList()) 
        );

        ArrayList<ArrayList<Integer>> indexArr = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        int depth = 1;

        while (depth < rootVar.length) {
            depth *= 2;
        }

        while (newRoot.size() < depth - 1) {
            newRoot.add(0);
        }

        depth = (int)(depth / 2);
        int index = 0;
        int counter = 0;
        int level = depth - 1;
        int cuts = depth;

        for (int i = 0; i < level; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < depth; j++) {
                if (counter == cuts) {
                    index++;
                    counter = 0;
                }

                temp.add(index);
                counter++;
            }

            index++;
            cuts /= 2;
            counter = 0;
            indexArr.add(temp);
        }

        for (int i = 0; i < indexArr.get(0).size(); i++) {
            String temp = "";

            for (int j = 0; j < indexArr.size(); j++) {
                temp += String.valueOf(newRoot.get(indexArr.get(j).get(i))) + ((j < indexArr.size() - 1) ?  "->" : "");
            }

            result.add(temp);
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
