public class interleaving_string_97 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 97. Interleaving String (Java language) - Medium"));

        String[] s1 = {"aabcc","aabcc",""};
        String[] s2 = {"dbbca","dbbca",""};
        String[] s3 = {"aadbbcbcac","aadbbbaccc",""};

        for (int test = 0; test < s3.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(isInterleave(s1[test], s2[test], s3[test]) + " | ");
            System.out.println(green("Passed"));
        }
    }

    public static boolean isInterleave(String s1Var, String s2Var, String s3Var) {
        
        while (s3Var.length() > 0) {
            int index1 = 1;
            int index2 = 1;
            
            if (index1 < s1Var.length()) {
                while (s1Var.substring(0,index1).compareTo(s3Var.substring(0,index1)) == 0)
                {
                    if (index1 >= s1Var.length() ) {
                        break;
                    }

                    index1++;
                }
            }
            
            if (index2 < s2Var.length()) {
                while (s2Var.substring(0,index2).compareTo(s3Var.substring(0,index2)) == 0)
                {
                    if (index2 >= s2Var.length() ) {
                        break;
                    }

                    index2++;

                }
            }

            if ((index1 > index2) && index1 <= s1Var.length()) {
                s1Var = s1Var.substring(index1 - 1, s1Var.length());
                s3Var = s3Var.substring(index1 - 1, s3Var.length());
            } else if (index2 > index1 && index2 <= s2Var.length()) {
                s2Var = s2Var.substring(index2 - 1, s2Var.length());
                s3Var = s3Var.substring(index2 - 1, s3Var.length());
            } else if (index1 == index2 && index1 == 1) {
                if (s1Var.charAt(index1 - 1) == s3Var.charAt(index1 - 1)) {
                    s1Var = s1Var.substring(index1, s1Var.length());
                    s3Var = s3Var.substring(index1, s3Var.length());
                }
                else if (s2Var.charAt(index2 - 1) == s3Var.charAt(index2 - 1)) {
                    s2Var = s2Var.substring(index2, s2Var.length());
                    s3Var = s3Var.substring(index2, s3Var.length());
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }

        return "".compareTo(s3Var) == 0;
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
