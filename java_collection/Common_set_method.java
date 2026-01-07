package java_collection;

import java.util.HashSet;

public class Common_set_method {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Abhay");
        name.add("Kushwaha");
        name.add("Maurya");
        name.add("Kush");
        name.add("KK");
        System.out.println("Before the Remove: ");
        System.out.println(name);
        name.remove("KK");
        System.out.println("After the remove KK .");
        System.out.println(name);
        System.out.println("Contains the element. ->"+name.contains("Kush"));
        System.out.println("Size the elements: ->"+name.size());
        System.out.println("Before Clear the element:"+name);
        // name.clear();
        // System.out.println("After the clear the elements."+name);

        for(String i:name){
            System.out.println(i);
        }
    }
}
