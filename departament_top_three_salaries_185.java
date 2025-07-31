/* Leetcode - 185. Department Top Three Salaries (Java language) - Hard */

import java.util.ArrayList;
import java.util.List;

public class departament_top_three_salaries_185 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 185. Department Top Three Salaries (Java language) - ") + red("Hard"));

        ArrayList<String> name = new ArrayList<>(List.of("Joe", "Henry", "Sam", "Max", "Janet","Randy","Will"));
        ArrayList<Integer> salary = new ArrayList<>(List.of(85000, 80000, 60000, 90000, 69000,85000,70000));
        ArrayList<Integer> departamantId = new ArrayList<>(List.of(1, 2, 2, 1, 1,1,1));
        ArrayList<String> deparataments = new ArrayList<>(List.of("IT", "Sales")); 

        System.out.print(green("Test 1: "));
        System.out.print(departamentHighestSalary(name, salary, departamantId, deparataments) + " | ");
        System.out.println(green("Passed"));
    }

    public static ArrayList<String> departamentHighestSalary(ArrayList<String> nameVar, ArrayList<Integer> salaryVar, ArrayList<Integer> departamantIdVar, ArrayList<String> deparatamentsVar) {
        ArrayList<String> result = new ArrayList<>();

        boolean flag = true;
        int c = 0;
    
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

        salaryVar.add(-1);

        for (int i = 0; i < deparatamentsVar.size(); i++) {
            int counter = 0;
            int search = i + 1;
            long count = departamantIdVar.stream().filter(n -> n == search).count();
            long stopValue = ((count > 3) ? 3 : count);
            int history = 0;

            for (int j = 0; j < departamantIdVar.size() - 1; j++) {
                if (counter == (int) stopValue) {
                    break;
                }

                if (departamantIdVar.get(j) == i + 1) {
                    result.add(new String(deparatamentsVar.get(departamantIdVar.get(j) - 1) + " | " + nameVar.get(j) + " | " + salaryVar.get(j)));
                
                    if (salaryVar.get(j) != history) {
                        counter++;
                    }

                    history = salaryVar.get(j);
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
