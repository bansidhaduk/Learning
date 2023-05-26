// Write a Java program to find if the given number is prime or not.

package com.javaBasics;
import static java.lang.System.exit;

public class E14 {
    public static void main(String[] args) {
        boolean isPrime = true;

        int number = Integer.parseInt(args[0]);

        if (number < 2) {
            System.out.println(number + " is neither prime nor composite");
            exit(0);
        }
        else {
            for(int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }
}
