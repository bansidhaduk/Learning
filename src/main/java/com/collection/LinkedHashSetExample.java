// Add the strings "apple", "banana", "cherry", "date" to the LinkedHashSet.
//Print the elements of the LinkedHashSet.
//Remove the string "banana" from the LinkedHashSet.
//Add the string "elderberry" to the LinkedHashSet.
//Print the size of the LinkedHashSet.
//Clear the LinkedHashSet.

package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Data");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Banana");

        linkedHashSet.add("Elderberry");

        System.out.println("Size of LinkedHashSet = " + linkedHashSet.size());

        System.out.println(linkedHashSet);

        linkedHashSet.clear();

        System.out.println(linkedHashSet);

    }
}
