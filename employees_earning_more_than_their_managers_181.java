/* Leetcode - 181. Employees Earning More Than Their Managers (Java language) - Easy */

import java.util.ArrayList;
import java.util.Arrays;

public class employees_earning_more_than_their_managers_181 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 181. Employees Earning More Than Their Managers (Java language) - ") + green("Easy"));

        ArrayList<Integer> id = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Joe","Henry","Sam","Max"));
        ArrayList<Integer> salary = new ArrayList<>(Arrays.asList(70000, 80000, 60000, 90000));
        ArrayList<Integer> managerId = new ArrayList<>(Arrays.asList(3,4,-1,-1));

        System.out.print(green("Test 1: "));
        System.out.print(emplSalartGtManagers(id, name, salary, managerId) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList<String> emplSalartGtManagers(ArrayList<Integer> idVar, ArrayList<String> nameVar, ArrayList<Integer> salaryVar, ArrayList<Integer> managerIdVar) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < managerIdVar.size(); i++) {
            if (managerIdVar.get(i) != -1 && salaryVar.get(i) > salaryVar.get(managerIdVar.get(i) - 1)) {
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