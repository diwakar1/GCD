package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
         num1 = input.nextInt();
        System.out.println("Enter another integer: ");
         num2 = input.nextInt();
        System.out.println("The greatest common divisior of two numbers is "+
                             " of these numbers is "+ getGcd(num1,num2));

    }
    public static int getGcd(int x, int y)
    {
        if (x%y==0)
            return y;
        else
            return getGcd(y,x%y);
    }
}
