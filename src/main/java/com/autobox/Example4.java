package com.autobox;
import java.lang.Integer;

public class Example4 {

    public static void main(String[] args) {
        Integer i = new Integer(100);
        printNumber(i);
    }

    public static void printNumber(int i) {
        System.out.println("You entered the number " + i);
    }
}
