//Write a program to convert from upper case to lower case and vice versa of an alphabet
//and print the old character and new character as shown in example (Ex: a->A, M->m).
package com.javaBasics;

import java.util.Scanner;

public class E07 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character: ");
        char inputChar = input.next().charAt(0);
        char outputChar;

        if(Character.isLowerCase(inputChar))
            outputChar = Character.toUpperCase(inputChar);
        else
            outputChar = Character.toLowerCase(inputChar);

        System.out.println(inputChar + "->" + outputChar);

    }
}
