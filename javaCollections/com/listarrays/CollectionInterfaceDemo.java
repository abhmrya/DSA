package com.listarrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.add(10);
        // list.add(15);
        // list.add("jenny");
        // System.out.println(list);
        // System.out.println(list.get(0));  // work

        // String name = list.get(2);  ///error

        // String name =(String) list.get(2);
        // System.out.println(name);

        // ********  generic  **********
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  //autoboxing
        list.add(15);

        // int num=list.get(0); // unboxing 
        // System.out.println(num);
        // System.out.println(list.get(2));

        list.add(0,12);
        System.out.println(list.add(90));
        System.out.println("list is: "+list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("for loop  of list : "+ list.get(i));
        }

        // traditional
        for(int i : list){
            System.out.println("traditiona loop : "+i);
            if(i==10){
                list.remove(0);
            }
        }

        List<Integer> list3 =list.subList(1, 4);
        System.out.println("sub list is : "+list3);
        list3.add(100);
        // list.add(0,10);  // you not modify of cuncarent list.
        list.set(0, 678);
        System.out.println("sub list is : "+ list3);
        System.out.println("original list ls : :" +list);
        


        // ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(List.of(45,90,43,34));  //null not allow
        list1.add(45);  //list 1 is mutable

        List<Integer> list4 = List.of(3,4,5,6,7,8);  //immutable
        // list4.add(1000);  
        System.out.println("list4 is : "+list4); //error

        // list1.add(90);
        // list1.add(null);
        // list1.addFirst(1);
        // list1.addLast(100);
        System.out.println("list 1 : "+list1);
        list.addAll(list1);
        System.out.println(list);
        System.out.println("contains 45 in list1 : "+list1.contains(45));
        System.out.println("contains 1000 in list1 : "+list1.contains(1000));

        // list.remove(10)   //error
        // list.remove(Integer.valueOf(12));
        // System.out.println("after remove of user valueOf : "+list);
        // list.removeAll(list1);
        // System.out.println("remove all lists of list 1 :"+list); // this is remove duplicate
        list.retainAll(list1);
        System.out.println("retain all list2 value of list 1 : "+list);

        
        Collection<Integer> list2= new ArrayList<>();
        list2.add(10);
        list2.add(90);
        System.out.println(list2);
        list2.remove(10);
        System.out.println(list2);
        list2.remove(232323);
        System.out.println(list2);  // no error but you are not apply to arraylist

        // list.add("jenny");
        // String name = list.get(2);
        // System.out.println("name : "+name);

    }
}
