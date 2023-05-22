// Initialize two character variables in a program and display the characters in alphabetical
//order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
//second is e O/P:a,e
package com.javaBasics;

import java.util.Scanner;

public class E04 {
    public static void main (String[] args) {
        // char char1 = 'a';
        //  char2 = 'b';
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character 1 : ");
        char char1 = input.next().charAt(0);;
        System.out.print("Enter character 2 : ");
        char char2 = input.next().charAt(0);;

        if (char1 > char2)
            System.out.println(char2 + " , " + char1);
        else
            System.out.println(char1 + " , " + char2);

        input.close();
    }
}
