//Write a method that takes an ArrayList of any type as input and reverses the order of its elements.

package com.vector;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static ArrayList<Integer> reverse(ArrayList<Integer> myData) {
        Collections.reverse(myData);
        return myData;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myData = new ArrayList<Integer>();

        myData.add(69);
        myData.add(20);
        myData.add(23);
        myData.add(32);
        myData.add(6);

        System.out.println("Original Arraylist : " + myData);

        System.out.println("Reversed Arraylist : " + reverse(myData));
    }
}
