package com.company;

import java.util.Scanner;


public class arraysInJava {
//    Find min and max element from array.
    public static void minmax(int arr[])
    {
        int len = arr.length;
        int min = 0,max = 0;
        if(len == 1)
        {
         min = arr[0];
         max = arr[0];
        }
        else if(len == 2)
        {
            if(arr[0]>arr[1]) {
                max = arr[0];
                min = arr[1];
            }
            else {
                max = arr[1];
                min = arr[0];
            }
        }
        else
        {
            min = arr[0];
            max = arr[0];
            for(int i : arr)
            {
                if(i>max)
                    max = i;
                if(i<min)
                    min = i;
            }
        }
        System.out.println("Minimum value : "+min);
        System.out.println("Maximum value : "+max);

    }

//    check weather an array is sorted in ascending order or not.

    public static void sortAsc(int arr[])
    {
        boolean check = false;
        for(int i = 0;i < arr.length-1;i++)
        {
            if(arr[i] < arr[i+1])
                check = true;
            else
                check = false;
        }
        if(check)
        {
            System.out.println("Sorted in Ascending order.");
        }
        else
        {
            System.out.println("Not sorted.");
        }
    }

//    Search a number in 2D array.
    public static void searchInArray(int arr[][],int x)
    {
        for(int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[0].length;j++)
            {
                if(arr[i][j] == x)
                {
                    System.out.println(x + " is located at arr["+i+"]["+j+"] index." );
                    break;
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        boolean check = true;
//        System.out.print("Enter size of array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter some elements in array : ");
//        for(int i = 0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        minmax(arr);
//        sortAsc(arr);

        int arr[][] = new int[5][6];

        for(int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element you would like to search : ");
        int x = sc.nextInt();
        searchInArray(arr,x);



//        Linear Search.

//        System.out.print("Which element you would like to find in the array : ");
//        int srh = sc.nextInt();
//        for(int i = 0;i < n; i++)
//        {
//            if(arr[i] == srh)
//            {
//                System.out.println("Element is present at " + (i+1) + " index.");
//                check = false;
//                break;
//            }
//        }
//        if(check)
//            System.out.println("Element not found.");

    }
}
