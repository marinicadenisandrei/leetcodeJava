/* Leetcode - 234. Palindrome Linked List (Java language) - Easy */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class palindrome_linked_list_234 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 234. Palindrome Linked List (Java language) - ") + green("Easy"));
        
        ArrayList<LinkedList<Integer>> head = new ArrayList<>(
                                                                Arrays.asList(
                                                                    new LinkedList<>(Arrays.asList(1, 2, 2, 1)),
                                                                    new LinkedList<>(Arrays.asList(1, 2))
                                                                )
                                                            );
        
        for (int test = 0; test < head.size(); test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                isPalindrome(head.get(test)) +
                " | " + 
                green("Passed")
            );
        }
    }

    public static boolean isPalindrome(LinkedList<Integer> headVar) {
        while (headVar.size() > 1) {
            if (headVar.getFirst() != headVar.getLast()) {
                return false;
            }
            
            headVar.removeFirst();
            headVar.removeLast();
        }

        return true;
    }

    public static String red(String var0) {
      return "\u001b[31m" + var0 + "\u001b[0m";
   }

   public static String yellow(String var0) {
      return "\u001b[33m" + var0 + "\u001b[0m";
   }

   public static String green(String var0) {
      return "\u001b[32m" + var0 + "\u001b[0m";
   }

   public static String reset(String var0) {
      return "\u001b[0m" + var0;
   }
}
