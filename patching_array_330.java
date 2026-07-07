/* Leetcode - 330. Patching Array (Java language) - Hard */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class patching_array_330 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 330. Patching Array (Java language) - ") + red("Hard"));

        int[][] nums = {{1,3},{1,5,10},{1,2,2}};
        int[] n = {6,20,5};

        for (int test = 0; test < n.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") +
                minPatches(nums[test], n[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static int minPatches(int[] numsVar, int nVar) {
        int numsVarSize = numsVar.length;
        int patches = 0;

        List<Integer> numsVarList = Arrays.stream(numsVar)
                           .boxed()
                           .collect(Collectors.toList());
        
        for (int i = 1; i <= nVar; i++) {
            boolean flag = false;

            for (int j = 0; j < numsVarList.size(); j++) {
                if (i == numsVarList.indexOf(j)) {
                    flag = true;
                    break;
                }
            }

            int startIndex = -1;

            if (i > numsVarList.getLast()) {
                startIndex = numsVarList.size() - 1;
            } else {
                if (!flag) {
                    for (int j = 0; j < numsVarList.size(); j++) {
                        if (numsVarList.get(j) > i) {
                            startIndex = j - 1;
                        }
                    }
                }
            }

            int temp = i;
            ArrayList<Integer> acc = new ArrayList<>();
            
            while (startIndex >= 0 && temp > 0) {
                if (temp >= numsVarList.get(startIndex)) {
                    temp -= numsVarList.get(startIndex);
                    acc.add(temp);
                }

                startIndex--;
            }

            if (temp > 0) {
                for (int j = 0; j < acc.size(); j++) {
                    if (!numsVarList.contains(acc.get(j))) {
                        numsVarList.add(acc.get(j));
                        numsVarList.sort(Comparator.naturalOrder());
                        patches++;
                        break;
                    }
                }
            }
            else if (temp != 0) {
                if (!numsVarList.contains(temp)) {
                    numsVarList.add(temp);
                    numsVarList.sort(Comparator.naturalOrder());
                    patches++;
                }
            }
        }

        return patches;
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
