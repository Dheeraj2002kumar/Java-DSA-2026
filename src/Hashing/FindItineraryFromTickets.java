/*
Find Itinerary from Tickets

"Chennai" -> "Bengaluru"
"Mumbai" -> "Delhi"
"Goa" -> "Chennai"
"Delhi" -> "Goa"

"Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"
 */

package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class FindItineraryFromTickets {

    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)) return key;
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + " --> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
