package java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_ {
    public static void main(String[] args) {

        // MAke a collection
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(2);
        number.add(7);
        number.add(9);
        System.out.println(number);

        // get the iterator
        Iterator<Integer> it = number.iterator();

        //Print the first item
        System.out.println(it.next());

        // while (it.hasNext()) {
        //     System.out.print(it.next());
        // }

        while (it.hasNext()) {
            Integer i = it.next();
            if(i<5){
                it.remove();
            }  
        }
        System.out.println(number);

    }
}
