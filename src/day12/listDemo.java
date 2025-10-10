package day12;

import java.util.*;
import java.util.ArrayList;
/*
List Allows duplicates and null, (0-based Indexing)
its applicable for (LinkedList, Array List, vector )

Methods of List Interface
    int size();
    isEmpty();
    contains(Object o)
    Object[] toArray() -> return all elements in the array
    get(int index)
* */
public class listDemo {
    public static void main(String[] args) {
        // List reference variable, ArrayList object
        List list = new ArrayList<>();
        // Adding heterogeneous data
        list.add(100);                // Integer
        list.add("Hello World");      // String
        list.add(45.67);              // Double
        list.add(true);               // Boolean
        list.add('A');                // Character

        // You can even add objects of custom classes
        list.add(new Date());         // Date object

        // Displaying the list
        System.out.println("Heterogeneous List: " + list);

        // Accessing elements
        for (Object obj : list) {
            System.out.println(obj + " ---> Type: " + obj.getClass().getSimpleName());
        }
    }
}
