package com.polymorphism;

public class Circle implements Shape {
    double radius = 5;

    @Override
    public double calculateArea() {
        return (2 * 3.14 * radius);
    }
}
