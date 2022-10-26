package com.company;

import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
//        Get bit operation.(Retrieve a bit from specific position)

//        int n = 5;//0101
//        int pos = 3;
//        int bitMask = 1<<pos;
//        if((bitMask & n) != 0)
//            System.out.println("Bit is one.");
//        else
//            System.out.println("Bit is zero.");

//      Set bit operation.(convert 0 to 1)

//        int n = 5;//0101
//        int pos = 1;
//        int bitMask = 1<<pos;
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

//        Clear bit operation.(convert 1 to 0)

//        int n = 5;//0101
//        int pos = 0;
//        int bitMask = 1<<pos;
//        int newBitMask = ~(bitMask);
//        int newNumber = newBitMask & n;
//        System.out.println(newNumber);

//        Update bit operation.(convert 0 to 1 or 1 to 0)
        int change = sc.nextByte();
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1<<pos;
        if(change == 1) {//set operation.
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {//clear operation
            int newNumber = ~(bitMask) & n;
            System.out.println(newNumber);
        }
    }

}
