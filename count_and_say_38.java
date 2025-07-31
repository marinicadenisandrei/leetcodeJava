/* Leetcode - 38. Count and Say (Java language) - Medium */

public class count_and_say_38 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 38. Count and Say (Java language) - Medium"));
        
        int[] n = {4,1};

        for (int test = 0; test < n.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(countAndSay(n[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String countAndSay(int nVar) {
        String starting = "1";
        
        for (int i = 0; i < nVar - 1; i++) {
            String noDuplicatesString = removeDuplicatesFromString(starting);
            String newStarting = "";

            for (int j = 0; j < noDuplicatesString.length(); j++) {
                String occ = String.valueOf(characterOcc(starting, noDuplicatesString.charAt(j)));
                newStarting += occ + noDuplicatesString.charAt(j);
            }
            
            starting = new String(newStarting);
        }

        return starting;
    }

    public static String removeDuplicatesFromString(String stringVar) {
        String newString = "";

        for (int i = 0; i < stringVar.length(); i++) {
            if (newString.indexOf(stringVar.charAt(i)) == -1) {
                newString += stringVar.charAt(i);
            }
        }

        return newString;
    }

    public static int characterOcc(String stringVar, char charVar) {
        int counter = 0;

        for (int i = 0; i < stringVar.length(); i++) {
            if (charVar == stringVar.charAt(i)) {
                counter++;
            }
        }

        return counter;
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
