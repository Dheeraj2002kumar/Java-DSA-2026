package Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    static void main(String[] args) {
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Japan", 180);

        System.out.println("map: " + map);

        map.put("China", 170);
        System.out.println("map: " + map);

        // search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        } else{
            System.out.println("Key is NOT present in the map");
        }

        System.out.println(map.get("China")); // key exist
        System.out.println(map.get("Indonesia")); // not exist

        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("---------------------");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "  + map.get(key));
        }
    }
}
