//Write a method in the Vector class that calculates and returns the magnitude (length) of a vector.
// The magnitude of a vector can be calculated by taking the square root of the sum of the squares of its elements.

package com.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorMagnitude {
    private static double vectorMagnitude(Vector<Integer> myData) {
        int v1 = myData.get(0) * myData.get(0);
        int v2 = myData.get(1) * myData.get(1);
        int v3 = myData.get(2) * myData.get(2);
        int sum = v1 + v2 + v3;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Vector<Integer> myData = new Vector<>();
        myData.add(1);
        myData.add(2);
        myData.add(3);

        System.out.println("vector Magnitude : " + vectorMagnitude(myData));
    }
}
