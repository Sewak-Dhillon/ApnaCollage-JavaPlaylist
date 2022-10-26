package com.company;

import java.sql.SQLOutput;

public class basicPatternQuestions {
    public static int fictorial(int i){
        if(i == 0)
            return 1;
        else
            return i*fictorial(i-1);
    }
    public static void main(String[] args) {
//        Solid Rectangle.
    //        * * * * *
    //        * * * * *
    //        * * * * *
    //        * * * * *


//        for(int i = 0; i < 4;i++){  // for loop for number of rows.
//            for(int j = 0;j < 5;j++){  // // for loop for number of columns.
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Hollow Rectangle.

//        * * * * *
//        *       *
//        *       *
//        * * * * *

//        for(int i = 1; i <= 4;i++){
//            for(int j = 1;j <= 5;j++){
//                if(i == 1 || j == 1 || i == 4 || j == 5) {
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        Half Pyramid.

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//
//        for(int i = 0;i <5;i++){
//            for(int j = 0;j <= i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Inverted Half Pyramid.

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//        for(int i = 0;i < 5;i++){
//            for(int j = 5;j > i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Inverted half pyramid rotated by 180deg.

//              *
//            * *
//          * * *
//        * * * *
//      * * * * *

//         for(int i = 0;i < 5;i++){
//            for(int k = 0;k < 5 - i;k++){
//                System.out.print("  ");
//            }
//            for(int j = 0;j <= i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
  // Half Pyramid with Number

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


//        for(int i = 1;i <6;i++){
//            for(int j = 1;j <= i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        Inverted Half Pyramid with Number

//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1


//        for(int i = 5
//            ;i >= 1;i--){
//            for(int j = 1;j <= i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        8th Pattern

//        1
//        2 3
//        4 5 6
//        7 8 9 10


//        int n = 0;
//    for(int i = 1;i<=4;i++){
//        for(int j = 0;j<i;j++){
//            n++;
//            System.out.print(n + " ");
//        }
//        System.out.println();
//    }


//        0-1 Traiangle Pattern

//
//        for(int i = 1;i <= 5;i++){
//            for(int j = 1;j <= i;j++){
//                if((i+j)%2 == 0)
//                System.out.print(1+" ");
//                else
//                System.out.print(0 + " ");
//            }
//            System.out.println();
//        }

//        Solid Rhombus Pattern

//             * * * * *
//            * * * * *
//           * * * * *
//          * * * * *
//         * * * * *


//        int n = 10;
//        for(int i = 0; i < n;i++){
//            for(int k = 1;k <= n - i;k++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k <= n;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Number Pyramid

//        int n = 9;
//        for(int i = 1;i <= n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=i;k++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        Palindromic number pyramid
//
//        int n = 9;
//        for(int i = 1;i<=n;i++){
//            for(int j = n;j >= i;j--){
//                System.out.print("  ");
//            }
//            for(int k = i;k >= 1;k--){
//                System.out.print(k + " ");
//            }
//            for(int k = 2;k <= i;k++){
//                    System.out.print(k + " ");
//            }
//            System.out.println();
//
//        }

//          Butterfly Pattern

//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************
//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *

//        int n = 6;
//        for(int i=1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Diamond Pattern

//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *
//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *


//        int n = 5;
//        for(int i = 1;i<=n;i++)
//        {
//            for(int j = 1;j<=n-i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j = 1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            for(int j = 2;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = n;i>=1;i--)
//        {
//            for(int j = 1;j<=n-i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j = 1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            for(int j = 2;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Hollow Butterfly
//    *          *
//    **        **
//    * *      * *
//    *  *    *  *
//    *   *  *   *
//    *    **    *
//    *    **    *
//    *   *  *   *
//    *  *    *  *
//    * *      * *
//    **        **
//    *          *

//        int n = 6;
//        for(int i=1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                if(i == j || j == 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                if(j==i)
//                    System.out.print("*");
//                else if((i+j) == i+1)
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--) {
//            for (int j = 1; j <= i; j++) {
//                if (i == j || j == 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if(j==i)
//                    System.out.print("*");
//                else if((i+j) == i+1)
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        Hollow Rhombus

//            *****
//           *   *
//          *   *
//         *   *
//        *****
//
//        int n = 5;
//        for(int i = 1; i <= n;i++){
//            for(int k = 1;k <= n - i;k++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k <= n;k++){
//                if(i==n || i == 1||k==n || k == 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        Half pyramid

//            1
//           12
//          123
//         1234
//        12345
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Inverted half pyramid
//
//        1 1 1 1 1
//        2 2 2 2
//        3 3 3
//        4 4
//        5
//        for(int i = 1;i<=6;i++){
//            for(int j = 1;j<=6-i;j++)
//            {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        Pascal 's triangle
//        1
//       1 1
//      1 2 1
//     1 3 3 1
//    1 4 6 4 1


//        nCr formula:
//
//        n ! / ( n – r ) ! r !
//
//                After using nCr formula, the pictorial representation becomes:
//
//           0C0
//        1C0   1C1
//     2C0   2C1   2C2
//  3C0   3C1   3C2   3C3
        int n = 4;
        for(int i = 0; i <= n;i++){
            for(int k = 0;k <= n - i;k++){
                System.out.print(" ");
            }
            for(int k = 0;k <=i;k++){
                System.out.print(" " + fictorial(i)/(fictorial(i - k)*fictorial(k)));
            }
            System.out.println();
        }
    }
}
