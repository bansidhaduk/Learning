// Write a program to print first 5 values which are divisible by 2, 3, and 5.

package com.javaBasics;

public class E19 {
    public static void main(String[] args) {

        int count = 0;
        int i = 0;

        while (count != 5) {
            i++;
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
    }

}
