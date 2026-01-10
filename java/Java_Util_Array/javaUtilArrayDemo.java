package Java_Util_Array;

import java.util.Arrays;

public class javaUtilArrayDemo {
    public static void main(String[] args) {
        int[] myarray = {10,4,7,0,67,3,2,9,5};
        int[] myarray2 = {10,4,7,0,67,3,2,9,5,9};

        // copy of Array
        int[] copiedArray = Arrays.copyOf(myarray,myarray.length);
        System.out.println("copiedArray : "+Arrays.toString(copiedArray));
        // System.out.println(myarray);
        // for(int i: myarray){
        //     System.out.print(i+" ");
        // }

        // Arrays.fill(myarray, 1,4,1);

//print
        System.out.println(Arrays.toString(myarray));
// sort
        Arrays.sort(myarray);
        System.out.println(Arrays.toString(myarray));

// sort index
        // Arrays.sort(myarray,2,7);
        // System.out.println(Arrays.toString(myarray));

//  2 Arrays equel or not (boolean form)

        boolean a = Arrays.equals(myarray, myarray2);
        System.out.println(a);  // false
// efficific index check
        // boolean b = Arrays.equals(myarray,0,5, myarray2,0,5);
        // System.out.println(b);   // true
 
// binary search
        System.out.println(Arrays.binarySearch(myarray, 5));
        System.out.println(Arrays.binarySearch(myarray, 0,9,5));

// // decending order
//     int j=0;
//     int[] descendingorder = new int[myarray.length];
//     for(int i = myarray.length-1;i>1;i--){
//         descendingorder[j] = myarray[i];
//         j++;
//     }
//     System.out.println(Arrays.toString(descendingorder));
    }
}
