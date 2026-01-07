// ArrayList

// An ArrayList is a resizable array that can grow as needed.
// It allows you to store elements and access them by index.

package java_collection;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("abhay");
        System.out.println(cars);
    }
}
