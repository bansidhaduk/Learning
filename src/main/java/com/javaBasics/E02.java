// Write a program to check if a given number is odd or even.

package com.javaBasics;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is odd or even : ");
        int number = input.nextInt();

        if(number % 2 == 0)
            System.out.println(number + " is even number.");
        else
            System.out.println(number + " is odd number.");
    }
}
