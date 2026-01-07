package java_collection;

import java.util.ArrayList;

public class arraylist_operations {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Abhay");
        name.add("Kushwaha");
        name.add("Maurya");
        System.out.println("before the insert of beginning: "+ name);
        name.add(0,"Kush");
        System.out.println("After the insert of beginning: "+ name);

        System.out.println("get 0 index value: "+ name.get(0));
        name.set(0, "Abhi");
        System.out.println(name) ;

        name.remove(0);
        System.out.println("Remove the beginning element: "+name);

        System.out.println("Size of name is: "+name.size());

        name.clear();
        
        System.out.println("clear the names: "+name);

    }
}