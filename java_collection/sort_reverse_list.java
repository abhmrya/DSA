package java_collection;

import java.util.ArrayList;
import java.util.Collections;

public class sort_reverse_list {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Abhay");
        name.add("Maurya");
        name.add("Kushwaha");
        name.add("Kush");

        System.out.println("Before the sort: " +name);
        Collections.sort(name);
        System.out.println("After the sort: "+name);
        Collections.reverse(name);
        System.out.println("After The reverse: "+name);
    }
}
