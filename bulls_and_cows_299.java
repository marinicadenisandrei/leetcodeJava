/* Leetcode - 299. Bulls and Cows (Java language) - Medium */

public class bulls_and_cows_299 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 299. Bulls and Cows (Java language) - Medium"));

        String[] secret = {"1807","1123"};
        String[] guess = {"7810","0111"};

        for (int test = 0; test < guess.length; test++) {
            System.out.println(
                green("Test " + (test + 1) + ": ") + 
                getHint(secret[test], guess[test]) +
                " | " +
                green("Passed")
            );
        }
    }

    public static String getHint(String secretVar, String guessVar) {
        int bullsNo = 0;
        int cowsNo = 0;

        for (int i = 0; i < secretVar.length(); i++) {
            if (secretVar.charAt(i) == guessVar.charAt(i)) {
                bullsNo++;

                secretVar = secretVar.substring(0, i)
                            + "x"
                            + secretVar.substring(i + 1);
            }
            else if (secretVar.indexOf(guessVar.charAt(i)) != -1) {
                cowsNo++;

                int index = secretVar.indexOf(guessVar.charAt(i));
                secretVar = secretVar.substring(0, index)
                            + "x"
                            + secretVar.substring(index + 1);
            }
        }

        return bullsNo + "A" + cowsNo + "B";
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
