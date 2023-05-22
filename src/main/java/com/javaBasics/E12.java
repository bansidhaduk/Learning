// Write a program to check if a given number is prime or not

package com.javaBasics;
import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        boolean isPrime = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not : ");
        int number = input.nextInt();

        if (number < 2)
            isPrime = false;
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

//        String result = isPrime ? "Prime" : "not Prime";
//        System.out.println (number + " is  " + result);

        input.close();
    }
}
