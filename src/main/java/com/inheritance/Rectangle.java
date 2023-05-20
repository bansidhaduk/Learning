package com.inheritance;

public class Rectangle extends Shape {
    double width = 5;
    double  length = 10;

    @Override
    double getArea() {
        return 2 * (width + length);
    }
}
