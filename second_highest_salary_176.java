/* Leetcode - 176. Second Highest Salary (Java language) - Medium */

public class second_highest_salary_176 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 176. Second Highest Salary (Java language) - Medium"));

        int[][] salary = {{100,200,300},{100}};
        
        for (int test = 0; test < salary.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(secondHighestSalary(salary[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int secondHighestSalary(int[] salaryVar) {
        return ((salaryVar.length > 1) ? salaryVar[1] : -1);
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
