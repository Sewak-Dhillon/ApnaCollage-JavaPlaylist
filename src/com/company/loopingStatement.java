package com.company;

import java.util.Scanner;

public class loopingStatement {
    public static void main(String[] args) {
//        for loop

//        for(int i = 0;i<5;i++)
//        {
//            System.out.println((i+1)+". Hello world!");
//        }

//        Infinite for loop

//        for(;;)
//        {
//            System.out.println((1)+". Hello world!");
//        }

//        while  loop

//        int i = 1;
//        while (i<5)
//        {
//            System.out.println("Gursewak singh");
//            i++;
//        }

//        do-while loop

//        int j=0;
//        do{
//            System.out.println("Lopping statements");
//            j++;
//        }while (j<5);

//        sum of first n natural number

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for(int k=1;k<n;k++)
//        {
//            sum += k;
//        }

//        Print table of n.

//        for(int k=1;k<=10;k++)
//        {
//            System.out.println(n + " * " + k + " = "+ (n*k));
//        }
//        System.out.println("Sum of n Natural number:"+sum);

//        prime number or not
        int num = sc.nextInt();
        boolean check=true;
        for(int i = 2;i<num;i++)
        {
        if(num%i == 0)
        {
            check = false;
        }
        }
        if(check)
        {
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is a not prime number");
        }
    }
}
