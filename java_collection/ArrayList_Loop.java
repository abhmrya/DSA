package java_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Loop {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Abhay");
        name.add("kush");
        name.add("Maurya");
        name.add("Kushwaha");
        Collections.sort(name);
        // for(int i =0;i<=name.size()-1;i++){
        //     System.out.println(name.get(i));
        // }
        for(String i : name){
            System.out.println(i);
        }
    }
    
}
