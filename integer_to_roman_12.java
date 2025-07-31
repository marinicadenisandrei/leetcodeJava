/* Leetcode - 12. Integer to Roman (Java language) - Medium */

public class integer_to_roman_12 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 12. Integer to Roman (Java language) - Medium"));

        String[] symbol = {"I","V","X","L","C","D","M"};
        int[] value = {1,5,10,50,100,500,1000};
        int[] num = {3749,58,1994};

        for (int test = 0; test < num.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(intToRoman(num[test], symbol, value) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static String intToRoman(int numVar, String[] symbolVar, int[] valueVar) {
        String[] romanArray = new String[Integer.toString(numVar).length()];
        int[] integers = new int[Integer.toString(numVar).length()];
        int integersSize = 0;
        int decimal = 1;
        
        for (int i = 0; i < Integer.toString(numVar).length() - 1; i++) {
            decimal *= 10;
        }

        for (char i : Integer.toString(numVar).toCharArray()) {
            integers[integersSize++] = (Integer.parseInt(String.valueOf(i)) * decimal);
            decimal /= 10;
        }

        for (int i = 0; i < integers.length; i++) {
            romanArray[i] = "";
        }

        for (int i = 0; i < integers.length; i++) {
            boolean flag = true;

            while (flag) {
                flag = false;

                int candidate1 = 0;
                int candidate2 = 0;

                String strcandidate1 = "";
                String strcandidate2 = "";

                for (int j = valueVar.length - 1; j >= 0; j--) {
                    if (valueVar[j] <= integers[i]) {
                        candidate1 = valueVar[j];
                        strcandidate1 = symbolVar[j];
                        flag = true;
                        break;
                    }
                }

                for (int j = 0; j < valueVar.length; j++) {
                    for (int k = 0; k < valueVar.length; k++) {
                        if (j != k && Math.abs(valueVar[j] - valueVar[k]) > candidate2 && (int) Math.abs(valueVar[j] - valueVar[k]) == integers[i]) {
                            candidate2 = Math.abs(valueVar[j] - valueVar[k]);

                            if (valueVar[j] > valueVar[k]) {
                                strcandidate2 = symbolVar[k] + symbolVar[j];
                            }
                            else
                            {
                                strcandidate2 = symbolVar[j] + symbolVar[k];
                            }
                            
                            flag = true;
                        }
                    }
                }
                
                if (candidate1 > candidate2 || candidate1 == integers[i]) {
                    integers[i] -= candidate1;
                    romanArray[i] += strcandidate1;
                }
                else {
                    integers[i] -= candidate2;
                    romanArray[i] += strcandidate2;
                }
            }
        }

        String result = String.join("", romanArray);

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
