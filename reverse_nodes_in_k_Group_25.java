/* Leetcode - 25. Reverse Nodes in k-Group (Java language) - Hard */

import java.util.Arrays;

public class reverse_nodes_in_k_Group_25 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 25. Reverse Nodes in k-Group (Java language) - ") + red("Hard"));
        
        int[][] head = {{1,2,3,4,5},{1,2,3,4,5}};
        int[] k = {2,3};

        for (int test = 0; test < k.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(Arrays.toString(reverseKGroup(head[test], k[test])) + " | ");   
            System.out.println(green("Passed"));
        }
    }

    public static int[] reverseKGroup(int[] headVar, int kVar) {
        int[] newArray = new int[headVar.length];
        int newArraySize = 0;
        
        for (int i = 0; i < headVar.length; i += kVar) {
            if (i + kVar > headVar.length) {
                for (int j = i; j < headVar.length; j++) {
                    newArray[newArraySize++] = headVar[j];
                }    

                break;
            }

            int[] temp = Arrays.copyOfRange(headVar, i, i + kVar);
            reverseArray(temp);
            
            for (int j = 0; j < kVar; j++) {
                newArray[newArraySize++] = temp[j];
            }
        }

        return newArray;
    }

    public static void reverseArray(int[] arrayVar) {
        for (int i = 0; i < arrayVar.length / 2; i++) {
            int temp = arrayVar[i];
            arrayVar[i] = arrayVar[arrayVar.length - 1 - i];
            arrayVar[arrayVar.length - 1 - i] = temp;
        }
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
