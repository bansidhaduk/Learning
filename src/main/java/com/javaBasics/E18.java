// Write a Java program to find if the given number is palindrome or not

package com.javaBasics;
public class E18 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int reverse = 0;
        int temp = number;

        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        if (temp == reverse)
            System.out.println(temp + " is Palindrome.");
        else
            System.out.println(temp + " is not Palindrome.");
    }
}
