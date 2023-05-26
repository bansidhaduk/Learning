// Write a method in the Vector class that normalizes a vector.
// Normalizing a vector involves dividing each of its elements by its magnitude,
// resulting in a unit vector (a vector with a magnitude of 1).

package com.vector;

import java.util.Vector;

public class VectorNormalization {
    private static Vector<Double> vectorMagnitude(Vector<Double> myData) {
        double v1 = myData.get(0) * myData.get(0);
        double v2 = myData.get(1) * myData.get(1);
        double v3 = myData.get(2) * myData.get(2);
        double sum = v1 + v2 + v3;

        double magnitude =  Math.sqrt(sum);

        myData.set(0, myData.get(0) / magnitude);
        myData.set(1, myData.get(1) / magnitude);
        myData.set(2, myData.get(2) / magnitude);

        return myData;
    }

    public static void main(String[] args) {
        Vector<Double> myData = new Vector<>();
        myData.add(1.0);
        myData.add(2.0);
        myData.add(3.0);

        System.out.println("vector Magnitude : " + vectorMagnitude(myData));
    }
}

