package com.company;

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        if else Statement.


//        int age = sc.nextInt();
//        if(age>18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }
//        int num = sc.nextInt();
//        if(num%2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if(x == y){
//            System.out.println("Equal");
//        }
//        else if(x>y){
//                System.out.println("Greater");
//            }
//            else{
//                System.out.println("Lesser");
//            }

//        Switch case Statement

//        int button = sc.nextInt();
//        switch (button){
//            case 1:
//                System.out.println("Hello");
//                break;
//            case 2:
//                System.out.println("Namaste");
//                break;
//            case 3:
//                System.out.println("Bonjour");
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }

//        Calculator

        System.out.print("Enter two numbers : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for modulus");
        System.out.println("Press 6 for exit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(a + " + "+ b +" = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - "+ b +" = " + (a-b));
                break;
            case 3:
                System.out.println(a + " * "+ b +" = " + (a*b));
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("Invalid values for Division as b can't be zero.");
                }
                else
                {
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                }
            case 5:
                if(b==0)
                {
                    System.out.println("Invalid values for Modulus as b can't be zero.");
                }
                else
                {
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                }
            case 6:
                System.out.println("Thank you");
                break;
        }
        }
    }

