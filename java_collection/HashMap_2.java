package java_collection;

import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        
        // create a HashMap object called people
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        // Add keys and values (Name, Age)
        people.put("Abhay", 22);
        people.put("Kush",21);
        people.put("Maurya",20);

        for(String i: people.keySet()){
            System.out.println("Key: "+ i + ", Value "+people.get(i));
        }
    }
    
}
