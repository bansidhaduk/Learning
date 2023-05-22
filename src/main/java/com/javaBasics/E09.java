//Write a program to print month in words, based on input month in numbers Example1:


package com.javaBasics;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter month number : ");
//        int monthNumber = input.nextInt();

        if (args.length == 0) {
            System.out.println("Please enter the month in numbers");
            System.exit(0);
        }

        int monthNumber = Integer.parseInt(args[0]);

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}
