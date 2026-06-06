package Revision.Arrays;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        // Contry(key) , population(value)
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion 
        map.put("India ",120);
        map.put("US",30);
        map.put("china",150);

        System.out.println("map : " +map);

        map.put("china", 180);
        System.out.println("map : " +map);

        for(String i : map.keySet()){
            System.out.println("map :"+map.get(i));
            System.out.println("map :"+map.getOrDefault(i, 12));
        }
    }
}
