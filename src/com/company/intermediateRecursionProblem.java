package com.company;

//1. Tower of Hanoi Problem.(Time complexity of tower of hanoi = O(2 raise to power n))

import java.util.HashSet;

public class intermediateRecursionProblem {
    public static int first = -1;
    public static int last = -1;
    public static int temp = 0;
    public static String newString = "";
    public static boolean[] map = new boolean[26];
    public static String[] keyComb = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void towerOfHanoi(int n,String src,String helper,String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer of Disk " + n + " from " + src +" to " + dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer of Disk " + n + " from " + src +" to " + dest);
        towerOfHanoi(n-1,helper,src,dest);

    }

//2. Reverse a String.(Time complexity is O(n).)
    public static void reverseString(String str,int size)
    {
        if(size == 0)
        {
            System.out.print(str.charAt(size));
            return;
        }
        System.out.print(str.charAt(size));
        reverseString(str,size-1);
    }

//3. Find the first and last occurrence of element in a string.(Time complexity is O(n).)

    public static void findOccurrence(String str,int index,char c)
    {

        if(index == str.length()) {
            System.out.println("First Occurrence of " + c + " is " + first);
            System.out.println("Last Occurrence of " + c + " is " + last);
            return;
        }
        char cha = str.charAt(index);
        if(cha == c)
        {
            if(first == -1)
            {
                first = index;
            }
            else
            {
                last = index;
            }
        }
        findOccurrence(str,index+1,c);
    }
//4. Check if array is sorted or not(Strictly increasing).(Time complexity is O(n).)
    public static boolean checkSorted(int arr[],int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }
        int first = arr[index];
        int next = arr[index+1];
        if(next <= first) {
            return false;
        }
        return checkSorted(arr,index+1);

    }
//5. Move all 'x' to end of String.(Time complexity is O(n).)

    public static void move(String str,int index)
    {
        if(index == str.length())
        {
            for (int i = 0;i<temp;i++)
            {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        if(curr == 'x')
        {
            temp++;
            move(str,index+1);
        }
        else {
            newString += curr;
            move(str,index+1);
        }
    }


//6. Remove duplicate values.(Time complexity is O(n).)
    public static void removeDuplicate(String str,int index,String newStr)
    {
        if(index == str.length())
        {
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(index) - 'a'])
        {
            removeDuplicate(str,index+1,newStr);
        }
        else
        {
            newStr += str.charAt(index);
            map[str.charAt(index)-'a'] = true;
            removeDuplicate(str,index+1,newStr);
        }
    }

//7. Print all subsequences of a String.(Time complexity is O(2 raise to power n, where n is length of String.))
    public static void subSequence(String str,int index,String strNew)
    {
        if(index == str.length())
        {
            System.out.println(strNew);
            return;
        }
        char currChar = str.charAt(index);

//        to be part of new String.
        subSequence(str,index+1,strNew + currChar);

//        or not to be part of new string.
        subSequence(str,index+1,strNew);
    }

//8.  Print all the unique subsequence of a String.
    public static void uniqueSubsequence(String str, int index, String newstr, HashSet<String> set)
    {
        if(index == str.length())
        {
            if(set.contains(newstr))
            {
                return;
            }
            else
            {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currChar = str.charAt(index);

//        to be part of new String.
        uniqueSubsequence(str,index+1,newstr + currChar,set);

//        or not to be part of new string.
        uniqueSubsequence(str,index+1,newstr,set);
    }

//9. Print keypad combination.
    public static void printcomb(String str,int index,String combination)
    {
        if(index == str.length())
        {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keyComb[currChar - '0'];

        for (int i = 0; i<mapping.length();i++)
        {
            printcomb(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
//    int n = 3;
//    towerOfHanoi(n,"S","H","D");


//    String str = "Gursewak";
//    reverseString(str,str.length()-1);


//    String s = "xdxkixkxsxdxmdc";
//    findOccurrence(s,0,'s');


//    int [] arr = {1,2,3,4,5,6,7,8,9};
//    boolean b = checkSorted(arr,0);
//    if(b)
//    {
//        System.out.println("Sorted");
//    }
//    else
//    {
//        System.out.println("Not Sorted");
//    }


//        String str = "xdxmdc";
//        move(str,0);


//        String str = "aabdbabsdffgkfdm";
//        removeDuplicate(str,0,"");

//        String s = "abc";
//        subSequence(s,0,"");

//        String s = "aaa";
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequence(s,0,"",set);

        String str = "239";
        printcomb(str,0,"");
    }
}
