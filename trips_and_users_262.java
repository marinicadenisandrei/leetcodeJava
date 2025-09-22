/* Leetcode - 262. Trips and Users (Java language) - Hard */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class trips_and_users_262 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 262. Trips and Users (Java language) - ") + red("Hard"));

        int[] client_id = {1,2,3,4,1,2,3,2,3,4};
        int[] driver_id = {10,11,12,13,10,11,12,12,10,13};
        int[] city_id = {1,1,6,6,1,6,6,12,12,12};
        String[] status = {"completed","canceled_by_driver","completed","canceled_by_driver","completed","completed","completed","completed","completed","canceled_by_driver"};
        String[] request_at = {"2013-10-01","2013-10-01","2013-10-01","2013-10-01","2013-10-02","2013-10-02","2013-10-02","2013-10-03","2013-10-03","2013-10-03"};

        int[] users_id = {1,2,3,4,10,11,12,13};
        String[] banned = {"no","yes","no","no","no","no","no","no"};
        
        System.out.println(green("Test 1: "));

        tripsAndUsers(client_id, driver_id, city_id, status, request_at, users_id, banned);

        System.out.println("| " + green("Passed"));
    }

    public static void tripsAndUsers(int[] client_idVar, int[] driver_idVar, int[] city_idVar, String[] statusVar, String[] request_atVar, int[] users_idVar, String[] bannedVar) {
        Set<String> set = new HashSet<>(Arrays.asList(request_atVar));
        String[] noDuplicatesDates = set.toArray(new String[0]);

        for (int i = 0; i < noDuplicatesDates.length; i++) {
            int canceled = 0;
            int total = 0;

            for (int j = 0; j < request_atVar.length; j++) {
                if (noDuplicatesDates[i].compareTo(request_atVar[j]) == 0) {
                    int clientIdTemp = client_idVar[j];
                    String clientStatus = "";

                    for (int k = 0; k < users_idVar.length; k++) {
                        if (users_idVar[k] == clientIdTemp) {
                            clientStatus = bannedVar[k]; 
                            break;
                        }
                    }
                    
                    if (clientStatus.compareTo("no") == 0) {
                        total++;
                    }
                    
                    if (clientStatus.compareTo("no") == 0 && statusVar[j].compareTo("cancelled_by_client") == 0) {
                        canceled++;
                    }
                    else if (clientStatus.compareTo("no") == 0 && statusVar[j].compareTo("canceled_by_driver") == 0) {
                        canceled++;
                    }
                }
            }

            float result = (float)canceled / total;
            System.out.println(noDuplicatesDates[i] + " " + result);
        }
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

