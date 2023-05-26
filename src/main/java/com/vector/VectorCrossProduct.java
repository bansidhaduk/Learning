package com.vector;

import java.util.Vector;

public class VectorCrossProduct {
    private static Vector<Double> computeCrossProduct(Vector<Double> v1, Vector<Double> v2) {
        Vector<Double> crossProduct = new Vector<>();

        Double p1 = (v1.get(1) * v2.get(2)) - (v1.get(2) * v2.get(1));
        Double p2 = (v1.get(0) * v2.get(1)) - (v1.get(1) * v2.get(0));
        Double p3 = (v1.get(2) * v2.get(0)) - (v1.get(0) * v2.get(2));

        crossProduct.add(0,p1);
        crossProduct.add(1,p2);
        crossProduct.add(2,p3);

        return crossProduct;
    }


    public static void main(String[] args) {
        Vector<Double> v1 = new Vector<>();
        v1.add(1.0);
        v1.add(2.0);
        v1.add(3.0);

        Vector<Double> v2 = new Vector<>();
        v2.add(3.0);
        v2.add(2.0);
        v2.add(1.0);

        Vector<Double> result = new Vector<>();
        result = computeCrossProduct(v1, v2);

        System.out.println("The cross product : " + result.get(0) + " " + result.get(1) + " " + result.get(2));
    }


}
