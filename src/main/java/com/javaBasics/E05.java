// Intialize a character variable in a program and if the value is alphabet then print
//"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
//Character"

package com.javaBasics;
import java.util.Scanner;

public class E05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character: ");
        char char1 = input.next().charAt(0);

        // if((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z'))
        if ((char1 >= 65 && char1 <= 90) || (char1 >= 97 && char1 <= 122))
            System.out.print("Alphabet");
        else if (char1 >= 48 && char1 <= 57)
            System.out.print("Digit");
        else
            System.out.print("Special Character");

        input.close();
    }
}
