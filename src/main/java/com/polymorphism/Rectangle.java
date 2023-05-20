package com.polymorphism;

public class Rectangle implements Shape {
    double width = 5;
    double  length = 10;

    @Override
    public double calculateArea() {
        return 2 * (width + length);
    }
}
