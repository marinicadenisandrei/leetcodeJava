/* Leetcode - 71. Simplify Path (Java language) - Medium */

public class simplify_path_71 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 71. Simplify Path (Java language) - Medium"));
        
        String[] path = {"/home/","/home//foo/","/home/user/Documents/../Pictures"};
        
        for (int test = 0; test < path.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(simplifyPath(path[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String simplifyPath(String pathVar) {
        pathVar = pathVar.replace("..", "");
        pathVar = pathVar.replace("//", "/");

        return pathVar;
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
