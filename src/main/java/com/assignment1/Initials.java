package com.assignment1;

public class Initials {
    public static void main(String[] args) {
        System.out.println("********             **********     ");
        System.out.println("**     **            **        **   ");
        System.out.println("**    **             **         **   ");
        System.out.println("**  **               **          **  ");
        System.out.println("***                  **          **  ");
        System.out.println("**  **               **          **  ");
        System.out.println("**    **             **         **   ");
        System.out.println("**     **            **        **    ");
        System.out.println("*******              **********      ");

        System.out.println();
        System.out.println();
        System.out.println();

        int i, j, n = 8;

        for (i = 0; i <= n; i++) {
            System.out.printf("*");
            for (j = 0; j <= n / 2; j++) {
                if ((i == 0 || i == n - 1 || i == n / 2) && j < ((n / 2) - 2))
                    System.out.printf("*");
                else if (j == ((n / 2) - 2) && !(i == 0 || i == n - 1 || i == (n / 2)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
