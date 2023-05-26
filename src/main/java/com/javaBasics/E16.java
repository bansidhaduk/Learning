// Write a program to print * in Floyds format (using for and while loop) *

package com.javaBasics;

public class E16 {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("Please enter an integer number");
        else{
            int number = Integer.parseInt(args[0]);
            for (int i = 1 ; i <= number ; i++ )
            {
                for (int j = 1 ; j <= i ; j++ )
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}
