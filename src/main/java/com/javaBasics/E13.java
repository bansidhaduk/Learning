// Write a program to print prime numbers between 10 and 99.

package com.javaBasics;

public class E13 {
    public static void main(String[] args) {
        boolean isPrime = true;

        for (int i = 10; i <= 99; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    isPrime = false;
                //prime=false
                if (!isPrime)
                    break;
            }
            if (isPrime)
                System.out.print(i + "\t");
        }
    }
}
