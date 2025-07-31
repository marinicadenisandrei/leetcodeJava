/* Leetcode - 218. The Skyline Problem (Java language) - Hard */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class the_skyline_problem_218 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 218. The Skyline Problem (Java language) - ") + red("Hard"));

        List<int[]> test1 = new ArrayList<>(
                Arrays.asList(
                        new int[]{2, 9, 10},
                        new int[]{3, 7, 15},
                        new int[]{5, 12, 12},
                        new int[]{15, 20, 10},
                        new int[]{19, 24, 8}
                )
        );

        List<int[]> test2 = new ArrayList<>(
                Arrays.asList(
                        new int[]{0,2,3},
                        new int[]{2,5,3}
                )
        );

        List<List<int[]>> buildings = new ArrayList<>();
        buildings.add(test1);
        buildings.add(test2);
        
        for (int test = 0; test < buildings.size(); test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                getSkyline(buildings.get(test)) +
                " | " +
                green("Passed")
            );
        }
    }

    public static ArrayList<ArrayList<Integer>> getSkyline(List<int[]> buildingsVar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int max_i = 0;
        int max_j = 0;

        for (int i = 0; i < buildingsVar.size(); i++) {
            max_i = ((max_i < buildingsVar.get(i)[2]) ? buildingsVar.get(i)[2] + 1 : max_i);
            max_j = ((max_j < buildingsVar.get(i)[1]) ? buildingsVar.get(i)[1] + 1 : max_j);
        }

        ArrayList<ArrayList<Integer>> blueprint = new ArrayList<>();

        for (int i = 0; i < max_i; i++) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j <= max_j; j++) {
                temp.add(0);
            }

            blueprint.add(temp);
        }

        for (int i = 0; i < buildingsVar.size(); i++) {
            for (int j = 0; j <= buildingsVar.get(i)[2]; j++) {
                for (int j2 = buildingsVar.get(i)[0]; j2 <= buildingsVar.get(i)[1]; j2++) {
                    blueprint.get(j).set(j2, 1);
                }
            }
        }

        for (int i = 0; i < blueprint.size(); i++) {
            for (int j = 0; j < blueprint.get(i).size(); j++) {
                try {
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j - 1) == 0 &&
                    blueprint.get(i).get(j + 1) == 1 &&
                    blueprint.get(i - 1).get(j) == 1 &&
                    blueprint.get(i + 1).get(j) == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i)));
                    }
                } catch (IndexOutOfBoundsException e) {
                    
                }     
                
                try { 
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j - 1) == 0 &&
                    blueprint.get(i).get(j + 1) == 1 &&
                    blueprint.get(i - 1).get(j) == 1 &&
                    i == blueprint.size() - 1) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i)));
                    }

                } catch (IndexOutOfBoundsException e) {
                    
                } 

                try { 
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j - 1) == 1 &&
                    blueprint.get(i).get(j + 1) == 1 &&
                    blueprint.get(i - 1).get(j) == 1 &&
                    blueprint.get(i + 1).get(j) == 1 &&
                    blueprint.get(i + 1).get(j + 1) == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i)));
                    }

                } catch (IndexOutOfBoundsException e) {
                    
                }

                try { 
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j - 1) == 1 &&
                    blueprint.get(i).get(j + 1) == 0 &&
                    blueprint.get(i + 1).get(j) == 1 &&
                    i - 1 == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i - 1)));
                    }

                } catch (IndexOutOfBoundsException e) {
                    
                }

                try { 
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j - 1) == 1 &&
                    blueprint.get(i).get(j + 1) == 0 &&
                    blueprint.get(i + 1).get(j) == 1 &&
                    i - 1 == 0 &&
                    j + 1 == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i - 1)));
                    }

                } catch (IndexOutOfBoundsException e) {
                    
                }

                try { 
                    if (blueprint.get(i).get(j) == 1 &&
                    blueprint.get(i).get(j + 1) == 1 &&
                    blueprint.get(i - 1).get(j) == 1 &&
                    i == blueprint.size() - 1 &&
                    j == 0) {
                        result.add(new ArrayList<Integer>(Arrays.asList(j, i)));
                    }

                } catch (IndexOutOfBoundsException e) {
                    
                }
            }
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
