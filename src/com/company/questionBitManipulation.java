package com.company;

import java.util.Scanner;

public class questionBitManipulation {
    public static void decimalToBinary(int num)
    {
        int arr[] = new int[32];
        int i = 0;
        while(num > 0)
        {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(arr[j]);
        }

    }
    public static void binaryToDecimal(String n)
    {
     String temp = n;
     int base = 0,value = 0;

     for(int i = temp.length()-1;i>=0;i--)
     {
         if(temp.charAt(i) == '1')
         {
             value += Math.pow(2,base);
         }
         base++;
     }
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        boolean check = true;
        int num = 5;
        int temp = 2;
        while(temp<num)
        {
            count++;
            temp *= 2;
            if (temp == num){
                System.out.println(num + " is equal to 2^"+count);
                check = false;
            }
        }
        if (check)
            System.out.println(num +" is not power of 2");
        decimalToBinary(5);
        binaryToDecimal("0111");
    }
}

