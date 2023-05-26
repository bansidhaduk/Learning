//Exercise 4: Find Maximum Value
//Write a method that takes an ArrayList of integers as input and returns the maximum value in the list.

package com.vector;

import java.util.ArrayList;

public class MaxValue {

    public static Integer max(ArrayList<Integer> myData) {
        int max = myData.get(0);
        for (int i = 0; i < myData.size(); i++) {
            if (myData.get(i) > max)
                max = myData.get(i);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myData = new ArrayList<Integer>();

        myData.add(69);
        myData.add(20);
        myData.add(23);
        myData.add(32);
        myData.add(6);

        System.out.println("Max number : " + max(myData));
    }
}
