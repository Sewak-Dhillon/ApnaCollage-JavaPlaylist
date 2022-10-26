package com.company;


import java.util.Scanner;

public class programmingExercise1 {
    // 1. Calculate Average.
    public static double average(double... x){
    int length = x.length;
    double sum = 0.0;
    for(double i : x){
        sum += i;
    }
    return sum/length;
    }
//    2. Print sum of odd number from 1 to n;
    public static int oddSum(int n)
    {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2 != 0)
            {
                sum += i;
            }
        }
        return sum;
    }

//    3.Greatest of two number.
    public static int greatestNumber(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

//    4.Circumference of circle.
    public static double circle(float radius)
    {
        return 2*3.14*radius;
    }

//    5.Check Person is Eligible for driving.
    public static void check(int age)
    {
        if(age>=18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
    }

//    9. Fibonacci Series.
    public  static void fibonacci(int n)
    {
        int first = 0;
        int second = 1;
        int next = first + second;
        System.out.print(first);
        for(int i = 0;next < 21;i++)
        {
            System.out.print(" " + next);
            next = first + second;
            first = second;
            second = next;

        }
    }

//    10. Greatest common divisor.
    public static int GCD(int n ,int m)
    {
        if(n == 0)
            return m;
        if(m == 0)
            return n;

        if(n > m)
            return GCD(m,n%m);
        else
            return GCD(n,m%n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        double z = sc.nextDouble();
//        double avg = average(x,y,z);
//        System.out.println("Average : " + avg);


//        int n = sc.nextInt();
//        int sum = oddSum(n);
//        System.out.println("Sum of odd number from 1 to n : "+ sum);

//        int x =sc.nextInt();
//        int y =sc.nextInt();
//        int lrg = greatestNumber(x,y);
//        System.out.println("Greatest number : " + lrg);

//        float radius = sc.nextFloat();
//        double  cfre = circle(radius);
//        System.out.println("Circumference of circle : " + cfre);

//        int age = sc.nextInt();
//        check(age);

//        6. Write infinite loop using do-while.

//        do {
//            System.out.println("Hello World");
//        }while (true);

//        7. Count positive ,negative and zeroes entered by user.

//        int zeroCount = 0;
//        int negativeCount = 0;
//        int positiveCount = 0;
//        int check;
//        do {
//            int x = sc.nextInt();
//            if(x>0)
//                positiveCount++;
//            else if (x == 0)
//                zeroCount++;
//            else
//                negativeCount++;
//            System.out.print("Again want to enter a number 1 or 0 : ");
//            check = sc.nextInt();
//        }while(check == 1);
//        System.out.println(positiveCount + " Positive number entered.");
//        System.out.println(negativeCount + " Negative number entered.");
//        System.out.println(zeroCount + " Zeroes entered.");

//        8. Find x raise to power n;

//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        int temp = x;
//        for(int i = 1;i<n;i++)
//        {
//            x *= temp;
//        }
//        System.out.println(x);

//        fibonacci(10);


//        int gcd = GCD(18,24);
//        System.out.println(gcd);


    }
}
