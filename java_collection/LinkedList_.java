package java_collection;

import java.util.LinkedList;

public class LinkedList_{
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Abhay");
        name.add("Kush");
        name.add("Abhi");
        name.add("Abhishek");
        System.out.println("Name is : "+name);
        name.addFirst("AddFirst");
        System.out.println("Name is after Addfirst : "+name);
        name.addLast("AddLast");
        System.out.println("Name is after AddLAst : "+name);
        String a =name.getFirst();
        System.out.println("GetFirst : "+ a);
        String b = name.getLast();
        System.out.println("GetLast: "+b);
        String c =name.removeFirst();
        System.out.println("removeFirst : "+ c);
        String d = name.removeLast();
        System.out.println("GetLast: "+d);
        System.out.println("Final name list: "+ name);
    }
    
}
