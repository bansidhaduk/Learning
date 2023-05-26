// Write a program to reverse a given number and print

package com.javaBasics;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {

        int reverse = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the sum og digits : ");
        int number = input.nextInt();

        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }

        System.out.println("Reversed Number: " + reverse);

        input.close();
    }
}
