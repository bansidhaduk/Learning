// Write a program to check if a given number is Positive, Negative, or Zero.

package com.javaBasics;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Positive, Negative, or Zero : ");
        int number = input.nextInt();

        if(number > 0)
            System.out.println(number + " is positive number.");
        else if(number < 0)
            System.out.println(number + " is negative number.");
        else
            System.out.println(number + " is a zero.");

        input.close();
    }
}
