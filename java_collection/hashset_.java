// A HashSet is a collection where every element is unique - no duplicates are allowed.

package java_collection;

import java.util.HashSet;

public class hashset_ {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");  // Duplicate
            cars.add("Mazda");
        System.out.println(cars);
    }
}
