package com.company;
// Functioin are arranged in memory in form of stack.
public class functionInJava {
    public  static  int sumNum(int n , int m)
    {
        return m+n;
    }
    public  static  void isEven(int num)
    {
        if(num>0)
        {
            if (num % 2 == 0)
                System.out.println("Number is Even");
            else
                System.out.println("Number is Odd");
        }
        else {
            System.out.println("Please provide positive integers.");
        }
    }
    public  static  int factorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid Number.");
            return 0;
        }
        if(n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
    public  static  int multiplyNum(int n , int m)
    {
        return m*n;
    }
    public static void table(int n){
        for(int i = 1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void isPrime(int n)
    {
        boolean check = true;
        for(int i = 2;i<n;i++){
            if(n%i == 0)
                check = false;
        }
        if(!check)
            System.out.println("Not a Prime number.");
        else
            System.out.println("Prime number.");
    }
    public static void main(String[] args) {
        int sum = sumNum(20,56);
        int mul = multiplyNum(20,56);
        int fict = factorial(5);
        System.out.println("Multiplication of two numbers : "+mul);
        System.out.println("Sum of two numbers : "+sum);
        System.out.println("Factorial of 5 : "+ fict);
        isEven(61);
        table(5);
        isPrime(29);
    }
}
