package com.dexter;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String FirstName = input.next();

        System.out.println("Enter Last name: ");
        String LastName = input.next();

        System.out.println("Enter Student: ");
        int StudentID = input.nextInt();

        System.out.println("Hello World, my name is "+ FirstName + " " + LastName + " " + StudentID);

        input.close();
    }
}
