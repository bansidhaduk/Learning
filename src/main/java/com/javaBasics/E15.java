// Write a program to add all the values in a given number and print. Ex: 1234->10

package com.javaBasics;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the sum og digits : ");
        int number = input.nextInt();

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Sum : " + sum);

        input.close();
    }
}
