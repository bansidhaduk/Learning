// Write a program to print even numbers between 23 and 57, each number should be
//printed in a separate row.

package com.javaBasics;

public class E11 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 23 and 57 are : ");

        for(int number = 23; number <= 57; number++) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
