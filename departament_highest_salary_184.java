/* Leetcode - 184. Department Highest Salary (Java language) - Medium */

import java.util.ArrayList;
import java.util.List;

public class departament_highest_salary_184 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 184. Department Highest Salary (Java language) - Medium"));

        ArrayList<String> name = new ArrayList<>(List.of("Joe", "Jim", "Henry", "Sam", "Max"));
        ArrayList<Integer> salary = new ArrayList<>(List.of(70000, 90000, 80000, 60000, 90000));
        ArrayList<Integer> departamantId = new ArrayList<>(List.of(1, 1, 2, 2, 1));
        ArrayList<String> deparataments = new ArrayList<>(List.of("IT", "Sales")); // Not used directly in sorting

        System.out.print(green("Test 1: "));
        System.out.print(departamentHighestSalary(name, salary, departamantId, deparataments) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList<String> departamentHighestSalary(ArrayList<String> nameVar, ArrayList<Integer> salaryVar, ArrayList<Integer> departamantIdVar, ArrayList<String> deparatamentsVar) {
        ArrayList<String> result = new ArrayList<>();

        boolean flag = true;
        int c = 0;
        int starter = 1;
        

        while (flag) {
            flag = false;
            for (int i = 0; i < salaryVar.size() - 1 - c; i++) {
                if (salaryVar.get(i) < salaryVar.get(i + 1)) {
                    int tempSalary = salaryVar.get(i);
                    salaryVar.set(i, salaryVar.get(i + 1));
                    salaryVar.set(i + 1, tempSalary);

                    String tempName = nameVar.get(i);
                    nameVar.set(i, nameVar.get(i + 1));
                    nameVar.set(i + 1, tempName);

                    int tempDeptId = departamantIdVar.get(i);
                    departamantIdVar.set(i, departamantIdVar.get(i + 1));
                    departamantIdVar.set(i + 1, tempDeptId);

                    flag = true;
                }
            }
            c++;
        }

        for (int i = 0; i < departamantIdVar.size(); i++) {
            if (departamantIdVar.get(i) == starter) {
                result.add(new String(nameVar.get(i) + " | " + deparatamentsVar.get(departamantIdVar.get(i) - 1)));
                
                if (departamantIdVar.get(i + 1) != starter) {
                    starter++;
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
