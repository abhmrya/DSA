// A HashMap stores key-value pairs, which are great when you want to
//  store values and find them by a key (like a name or ID):

package java_collection;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<String,String> capitalcities = new HashMap<String,String>();
        capitalcities.put("India","Delhi");
        capitalcities.put("England", "London");
        capitalcities.put("Norway", "Oslo");
        capitalcities.put("USA", "Washington DC");
        // System.out.println(capitalcities);

        // String a = capitalcities.get("India");
        // System.out.println(a);

        // capitalcities.remove("USA");
        // System.out.println(capitalcities);

        // int b =capitalcities.size();
        // System.out.println("Size is : "+b);

        // for(String i : capitalcities.keySet()){
        //     System.out.println(i);
        // }

        // for(String i : capitalcities.values()){
        // System.out.println(i);
        // }

        // for(String i: capitalcities.keySet()){
        //     System.out.println("Key: "+i+", Value: "+capitalcities.get(i));
        // }

        capitalcities.clear();
        System.out.println("After clear capitalcities."+capitalcities);
    }
}
