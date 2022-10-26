package com.company;

import java.util.ArrayList;

public class advancedRecursionProblem {
    //1. Print all permutations of string(all possible combination). Time complexity is O(n!).

    public static void permutationCombination(String str,String permutation)
    {
        if(str.length() == 0)
        {
            System.out.println(permutation);
            return;
        }
        for(int i = 0;i<str.length();i++)
        {
            char curr = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);
            permutationCombination(newStr,permutation+curr);
        }
    }

//    2. Count total path in maze to move from (0,0) to (n,m).
//    Movement is possible form rightside or downwards
    public static int countPath(int i,int j,int n,int m)
    {
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        if(i == n || j == m)
        {
            return 0;
        }

//   move downward
        int downPaths = countPath(i+1,j,n,m);

//   move rightward
        int rightPaths = countPath(i,j+1,n,m);

        return downPaths + rightPaths;
    }


//    3. Place Tiles of size 1 * m in a floor of size n * m

    public static int placeTiles(int n,int m)
    {
        if(n == m)
        {
            return 2;
        }
        if(n < m)
        {
            return 1;
        }
//        vertically
        int vertical = placeTiles(n-m,m);

//        horizontally
        int horizontal = placeTiles(n-1,m);

        return vertical + horizontal;
    }

//    4. Find the number of ways in which you can invite n people to your party, single or in pair.

    public static int peopleInvite(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
//        single person
        int single = peopleInvite(n - 1);

//        paired person
        int pair = (n-1) * peopleInvite(n-2);

        return single + pair;
    }

//    5. Print all subsets of a set of first n natural number.

    public static void subset(int n,ArrayList<Integer> sub)
    {
        if(n == 0)
        {
            for (int i : sub)
            {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
//        if phela element aya
        sub.add(n);
        subset(n-1,sub);

//        if phela element nahi aya
        sub.remove(sub.size()-1);
        subset(n-1,sub);

    }
    public static void main(String[] args) {
//    permutationCombination("abc","");


//    int count = countPath(0,0,3,3);
//    System.out.println(count);

//    int count = placeTiles(4,2);
//    System.out.println(count);

//      int count = peopleInvite(4);
//        System.out.println(count);

        ArrayList<Integer> subset = new ArrayList<>();
        subset(3,subset);


    }
}


