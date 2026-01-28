package com.listarrays;

import java.util.ArrayList;
import java.util.List;
import  java.util.ListIterator;

public class iteratordemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,45,5));
        System.out.println(list);

        // Iterator<Integer> itr = list.iterator();
        // while (itr.hasNext()) {
        //     int num = itr.next();
        //     System.out.println(num);
        // }

// ********** or ***********

        // for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
        //     // System.out.println(itr.next());
        //     int num=itr.next();
        //     if(num==3){
        //         itr.remove();
        //     }
        // }
        // System.out.println(list);
 

        // for(int num:list) {
        //     if(num==3){
        //         list.set(list.indexOf(3),30);
        //         // list.remove(Integer.valueOf(3));
        //     }
        // }
        // System.out.println(list);

        ListIterator<Integer> it = list.listIterator(3);
        while(it.hasPrevious()){
            System.out.println("The Previus index is: "+it.previousIndex()+"and element at that index is: "+it.previous());
            if(it.previous()==2){
                it.set(999);
            }
        }
    }
}