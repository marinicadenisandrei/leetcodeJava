/* Leetcode - 332. Reconstruct Itinerary (Java language) - Hard */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class reconstruct_itinerary_332 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 332. Reconstruct Itinerary (Java language) - ") + red("Hard"));

        String[][][] tickets = {{{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}},{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}};
        
        for (int test = 0; test < tickets.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                findItinerary(tickets[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static List<String> findItinerary(String[][] ticketsVar) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> counts = new LinkedHashMap<>();
        
        for (String[] row : ticketsVar) {
            for (String s : row) {
                counts.merge(s, 1, Integer::sum);
            }
        }

        Map.Entry<String, Integer> min = Collections.min(
                counts.entrySet(), Map.Entry.comparingByValue());

        String starterPoint = min.getKey();

        ArrayList<String> firstElement = new ArrayList<>();
        ArrayList<Integer> usedIndexes = new ArrayList<>();

        for (int i = 0; i < ticketsVar.length; i++) {
            if (ticketsVar[i][0].equals(starterPoint)) {
                firstElement.add(ticketsVar[i][0]);
                firstElement.add(ticketsVar[i][1]);
                usedIndexes.add(i);
                break;
            }
        }

        ArrayList<ArrayList<String>> former = new ArrayList<>();
        former.add(firstElement);
        int indexFormer = 0;

        while (usedIndexes.size() < ticketsVar.length) {
            boolean matched = false;
            for (int i = 0; i < ticketsVar.length; i++) {
                if (!usedIndexes.contains(i)
                        && former.get(indexFormer).get(1).equals(ticketsVar[i][0])) {
                    former.add(new ArrayList<>(Arrays.asList(ticketsVar[i][0], ticketsVar[i][1])));
                    usedIndexes.add(i);
                    indexFormer++;
                    matched = true;
                    break;
                }
            }
            if (!matched) break;
        }

        for (int i = 0; i < former.size() - 1; i++) {
            result.add(former.get(i).get(0));
        }

        result.add(former.getLast().get(0));
        result.add(former.getLast().get(1));

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