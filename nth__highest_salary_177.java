/* Leetcode - 177. Nth Highest Salary (Java language) - Medium */

public class nth__highest_salary_177 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 176. Second Highest Salary (Java language) - Medium"));

        int[][] salary = {{100,200,300},{100}};
        int[] n = {2,2};
        
        for (int test = 0; test < salary.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(secondHighestSalary(salary[test], n[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static int secondHighestSalary(int[] salaryVar, int nVar) {
        return ((salaryVar.length > 1) ? salaryVar[nVar - 1] : -1);
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
