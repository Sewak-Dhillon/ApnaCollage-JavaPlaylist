package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of x and y : "+ (x+y));
	// write your code here
//        Printing in Java
        System.out.println("Hello World");

//        Data type in Java
        int a=20,b=30;
        double weight = 25.52;
        String name = "Tony Stark";

//        Some Arthimetic operations.
        double radius = 3.14*a*a;
        System.out.println(radius);

//        Printing Table of 2
        for(int i = 1;i<=10;i++){
            System.out.println("2 * "+i+" = " + 2*i);
        }

//        Pattern
        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
    }
}
