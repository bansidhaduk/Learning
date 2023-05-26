// Add the numbers 1, 2, 3, 4, 5 to the HashSet.
//Check if the HashSet contains the number 3.
//Remove the number 4 from the HashSet.
//Print the size of the HashSet.
//Clear the HashSet.

package com.collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println(hashSet);

        System.out.println("List contains 3 or not : " + hashSet.contains(3));

        hashSet.remove(4);

        System.out.println(hashSet);

        System.out.println("Size of HashSet = " + hashSet.size());

        hashSet.clear();

        System.out.println(hashSet);
    }
}
