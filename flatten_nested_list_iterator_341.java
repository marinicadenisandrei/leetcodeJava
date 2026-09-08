/* Leetcode - 341. Flatten Nested List Iterator (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class flatten_nested_list_iterator_341 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 341. Flatten Nested List Iterator (Java language) - Medium"));
        
        List<List<Object>> testCases = List.of(
            List.of(List.of(1, 1), 2, List.of(1, 1)),
            List.of(1, List.of(4, List.of(6)))
        );

        for (int test = 0; test < testCases.size(); test++) {
            List<Integer> flat = nestedList(testCases.get(test));
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                flat +
                " | " +
                green("Passed")
            );
        }
    }

    public static List<Integer> nestedList(List<?> nested) {
        List<Integer> result = new ArrayList<>();

        for (Object temp : nested) {
            if (temp instanceof List<?> list) {
                result.addAll(nestedList(list)); 
            } else {
                result.add((Integer) temp);
            }
        }

        return result;
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