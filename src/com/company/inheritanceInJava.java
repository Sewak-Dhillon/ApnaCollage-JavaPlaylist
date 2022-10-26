package com.company;

import bank.Bank;
//Inheritance increases reusability.

//Types of inheritance
//Single level inheritance

//class shape{ // Base-class or Parent class
//    String color;
//
//    public void area(){
//        System.out.println("display area.");
//    }
//}
//
//class traingle extends shape{ // Subclass or Child-class
//    public void area(int a,int b)
//    {
//        System.out.println("Area = " + 1/2 * a * b);
//    }
//}


//Multi-level inheritance

//class shape{ // Base-class or Parent class
//    String color;
//
//    public void area(){
//        System.out.println("display area.");
//    }
//}
//
//class traingle extends shape{ // Subclass or Child-class
//    public void area(int a,int b)
//    {
//        System.out.println("Area = " + 1/2 * a * b);
//    }
//}
//
//class EquilateralTraingle extends traingle{ // Subclass or Child-class
//    public void area(int a,int b)
//    {
//        System.out.println("Area = " + 1/2 * a * b);
//    }
//}

//Hierarchical inheritance

class shape{ // Base-class or Parent class
    String color;

    public void area(){
        System.out.println("display area.");
    }
}

class traingle extends shape{ // Subclass or Child-class
    public void area(int a,int b)
    {
        System.out.println("Area = " + 1/2 * a * b);
    }
}

class circle extends shape{ // Subclass or Child-class
    public void area(int a)
    {
        System.out.println("Area = " + (3.14) * a * a);
    }
}
public class inheritanceInJava {
    public static void main(String[] args) {
        Bank ac = new Bank();
        traingle t1 = new traingle();
        t1.color = "red";
    }
}


//Hybrid inheritance.
// One more inheritance exist Multiple inheritance but it is not present in java.
//that concept is implementend by the help of interfaces.