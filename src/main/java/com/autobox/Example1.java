package com.autobox;

public class Example1 {
    public static void main(String[] args) {

        printNumber(7);  // automatically converts it to the Integer object.
    }

    public static void printNumber(Integer i) {
        System.out.println("You entered the number " + i);
    }
}
