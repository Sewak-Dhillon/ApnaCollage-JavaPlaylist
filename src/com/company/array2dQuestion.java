package com.company;

import java.util.Scanner;

// Print the spiral order matrix as output for a given matrix of numbers.


//Input

//         1  5  7  9 10 11
//         6 10 12 13 20 21
//         9 25 29 30 32 41
//        15 55 59 63 68 70
//        40 70 79 81 95 105

//Output

// 1 5 7 9 10 11
// 21 41 70 105
// 95 81 79 70 40
// 15 9 6
// 10 12 13 20
// 32 68
// 63 59 55
// 25 29 30 29


public class array2dQuestion {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int arr[][] = new int[5][6];

        for(int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int row_start = 0;
        int row_end = arr.length-1;
        int col_start = 0;
        int col_end = arr[0].length-1;

        while (row_start <= row_end && col_start <= col_end)
        {
            for(int i = col_start;i <= col_end;i++)
            {
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;
            for (int i = row_start;i<=row_end;i++)
            {
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;
            for(int i = col_end;i>=col_start;i--)
            {
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
            for (int i = row_end;i>=row_start;i--)
            {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
}
