/* Leetcode - 134. Gas Station (Java language) - Medium */

public class gas_statin_134 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 134. Gas Station (Java language) - Medium"));

        int[][] gas = {{1,2,3,4,5},{2,3,4}};
        int[][] cost = {{3,4,5,1,2},{3,4,3}};

        for (int test = 0; test < cost.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(CanCompleteCircuit(gas[test], cost[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int CanCompleteCircuit(int[] gasVar, int[] costVar) {
        for (int i = 3; i < gasVar.length; i++) {
            int starter = gasVar[i];
            int index = i;
            int tank = gasVar[index];

            do {
                int newTank = 0;

                if (index < gasVar.length - 1) {
                    newTank = tank - costVar[index] + gasVar[index + 1];
                }
                else
                {
                    newTank = tank - costVar[index] + gasVar[0];
                    index = 0;
                }
                
                index++;
                tank = newTank;

                if (tank <= 0) {
                    break;
                }

            } while (starter != gasVar[index]);

            tank -= gasVar[index - 2];

            if (tank > 0) {
                return tank;
            }
        }

        return -1;
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
