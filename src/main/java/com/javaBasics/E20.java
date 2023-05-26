// Write a program that displays a menu with options 1. Add 2. Sub Based on the options
//chosen, read 2 numbers and perform the relevant operation. After performing the
//operation, the program should ask the user if he wants to continue. If the user presses y
//or Y, then the program should continue displaying the menu else the program should
//terminate.

package com.javaBasics;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        int number1 = 0,number2 = 0,result, choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Add\n2. Sub");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter first number: ");
                number1 = input.nextInt();
                System.out.println("Enter second number: ");
                number2 = input.nextInt();
                result = number1 + number2;
            } else {
                System.out.println("Enter first number: ");
                number1 = input.nextInt();
                System.out.println("Enter second number: ");
                number2 = input.nextInt();
                result = number1 - number2;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to continue? Y or N");

            input.nextLine();
            choice = input.nextLine().charAt(0);

        }while(choice == 'Y' || choice == 'y');
    }

}
