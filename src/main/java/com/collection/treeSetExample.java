// Add the numbers 5, 10, 2, 8, 3 to the TreeSet.
//Print the elements of the TreeSet in ascending order.
//Find and print the smallest element in the TreeSet.
//Find and print the largest element in the TreeSet.
//Remove the number 8 from the TreeSet.
//Print the size of the TreeSet.
//Clear the TreeSet.

package com.collection;

import java.util.TreeSet;

public class treeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);

        System.out.println(treeSet);

        // tree set is sorted so first value is minimum
        System.out.println("Minimun = " + treeSet.first());

        System.out.println("Maximum = " + treeSet.last());

        treeSet.remove(8);

        System.out.println(treeSet);

        System.out.println("Size of TreeSet = " + treeSet.size());

        treeSet.clear();

        System.out.println(treeSet);
    }
}
