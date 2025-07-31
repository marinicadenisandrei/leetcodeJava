/* Leetcode - 93. Restore IP Addresses (Java language) - Medium */

import java.util.ArrayList;

public class restore_ip_address_93 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 93. Restore IP Addresses (Java language) - Medium"));

        String s[] = {"25525511135","0000","101023"};

        for (int test = 0; test < s.length; test++) {
            System.out.print(green("Test " + (test + 1) + ": "));
            System.out.print(restoreIpAddresses(s[test]) + " | ");
            System.out.println(green("Passed"));   
        }
    }

    public static ArrayList<String> restoreIpAddresses(String sVar) {
        ArrayList<String> candidates = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        String[] check = sVar.split("255", -1);
        int occ = check.length - 1;

        sVar = sVar.replace("255", "");
    
        String copy = "";

        if (occ > 0) {
            for (int i = 0; i < occ; i++) {
                copy += "" + sVar.charAt(i) + ".";
            }

            String tempFormation = "";
            tempFormation = copy.substring(0, copy.length() - 1) + sVar.substring(2, sVar.length());
            copy = tempFormation;

            tempFormation = "";

            for (int i = occ - 1; i >= 0; i--) {
                tempFormation += "" + sVar.charAt(sVar.length() - 1 - i) + ".";
            }

            sVar = sVar.substring(0, sVar.length() - occ) + tempFormation.substring(0, tempFormation.length() - 1);
        }
        else
        {
            char[] lastChars = {sVar.charAt(sVar.length() - 3), sVar.charAt(sVar.length() - 2), sVar.charAt(sVar.length() - 1)};
            char[] firstChars = {sVar.charAt(0), sVar.charAt(1), sVar.charAt(2)};

            copy = "" + firstChars[0] + '.' + firstChars[1] + '.' + firstChars[2] + '.' + sVar.substring(3, sVar.length());
            sVar = sVar.substring(0, sVar.length() - 3) + '.' + lastChars[0] + '.' + lastChars[1] + '.' + lastChars[2];
        }
        
        candidates.add(sVar);
        
        boolean flag = true;

        while (flag) {
            String element = candidates.get(candidates.size() - 1);
            int pointIndex = 1;
            int counterPoint = 0;

            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) == '.') {
                    counterPoint++;
                }

                if (counterPoint == pointIndex) {
                    pointIndex = (pointIndex < 3 ? pointIndex + 1 : 1);
                
                    StringBuilder sb = new StringBuilder(element);
                    
                    char temp = sb.charAt(i - 1);
                    sb.setCharAt(i - 1, sb.charAt(i));
                    sb.setCharAt(i, temp);

                    element = sb.toString();
                    candidates.add(element);

                    if (element.charAt(0) == '.') {
                        flag = false;
                        break;
                    }
                }

                if (!flag) {
                    break;
                }
            }
        }

        flag = true;

        candidates.add(copy);

        while (flag) {
            String element = candidates.get(candidates.size() - 1);
            int pointIndex = 1;
            int counterPoint = 0;

            for (int i = element.length() - 1; i >= 0 ; i--) {
                if (element.charAt(i) == '.') {
                    counterPoint++;
                }

                if (counterPoint == pointIndex) {
                    pointIndex = (pointIndex < 3 ? pointIndex + 1 : 1);
                
                    StringBuilder sb = new StringBuilder(element);
                    
                    char temp = sb.charAt(i + 1);
                    sb.setCharAt(i + 1, sb.charAt(i));
                    sb.setCharAt(i, temp);

                    element = sb.toString();
                    candidates.add(element);
                    
                    if (element.charAt(element.length() - 1) == '.') {
                        flag = false;
                        break;
                    }
                }

                if (!flag) {
                    break;
                }
            }
        }

        for (int i = 0; i < candidates.size(); i++) {
            String[] parts = candidates.get(i).split("\\.");
            flag = true;
        
            if (parts.length != 4 - occ) {
                continue;
            }
        
            for (String part : parts) {
                if (part.length() == 0) { 
                    flag = false;
                    break;
                }
        
                if (part.charAt(0) == '0' && part.length() > 1) {
                    flag = false;
                    break;
                }
    
                try {
                    int number = Integer.parseInt(part);
                    if (number < 0 || number > 255) {
                        flag = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    flag = false;
                    break;
                }
            }

            if (flag && !result.contains(candidates.get(i))) {
                result.add(candidates.get(i));
            }
        }
        
        if (occ > 0) {
            String union = "";
            for (int i = 0; i < occ; i++) {
                union += "255.";
            }

            for (int i = 0; i < result.size(); i++) {
                result.set(i, union + result.get(i));
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
