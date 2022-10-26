package com.company;

public class recursionInJava {
//    1. Print number from 5 to 1 or 1 to 5;
    public static void printNum(int n)
    {
        if(n == 6)
            return;
        System.out.print(n +" ");
        printNum(n+1);
    }

//    2. Print sum of first n natural number.
    public static void noSum(int i,int n,int sum) {

        if(i == n){
            System.out.println("\nSum of first n natural number : " + (sum+n));
            return;
        }
        sum+=i;
        noSum(i+1,n,sum);
//        System.out.println(i);
    }

//    3.Print Fictorial of a Number.

    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

//    4. Print Fibonacci Series.

    public static void fibonacci(int n,int first,int second)
    {
        if(n == 0)
            return;
        System.out.print(first + " ");
        int next = first + second;
        first = second;
        second = next;
        fibonacci(n-1,first,second);

    }

//    5. Print x^n (stack height = n).

    public static int stackHeight(int n ,int x)
    {
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        else
            return x * stackHeight(n-1,x);
    }
//    6. Print x^n (stack height = log n).

    public static int stackHeightlogn(int n ,int x)
    {
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        else
            if(n % 2 ==0)
                return stackHeightlogn(n/2,x) * stackHeightlogn(n/2,x);
            else
                return stackHeightlogn(n/2,x) * stackHeightlogn(n/2,x) * x;
    }


    public static void main(String[] args) {
//        printNum(1);
//
//        noSum(1,5,0);
//
//        int fict = factorial(23);
//        System.out.println("23! = " + fict);
        System.out.print("Fibonacci Series : ");
        fibonacci(10,0,1);

        int power = stackHeightlogn(2,2);
        System.out.println("\n"+power);

    }
}
