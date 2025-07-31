/* Leetcode - 183. Customers Who Never Order (Java language) - Easy */

import java.util.ArrayList;
import java.util.List;

public class customers_who_never_order_183 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 183. Customers Who Never Order (Java language) - ") + green("Easy"));

        ArrayList<String> name = new ArrayList<>(List.of("Joe", "Henry", "Sam", "Max"));
        ArrayList<Integer> orders = new ArrayList<>(List.of(3,1));

        System.out.print(green("Test 1: "));
        System.out.print(customersWhoNeverOrder(name, orders) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList<String> customersWhoNeverOrder(ArrayList<String> nameVar, ArrayList<Integer> ordersVar) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < nameVar.size(); i++) {
            if (ordersVar.indexOf(i + 1) == -1) {
                result.add(nameVar.get(i));
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
