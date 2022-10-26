package com.company;

import java.util.Scanner;

// String are immutable in java. String can't be modified or changed once they are defined.

public class stringInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Courseware";
        String secondName = "Singh";

//      Two approaches to get String input.
//        String s1 = sc.nextLine(); // It considers space.
//        System.out.println(s1);
//        String s2 = sc.next(); // It terminates when it encounters any space.
//        System.out.println(s2);

//        String concatenation.
        System.out.println(firstName + secondName);

//        String length.
        System.out.println(firstName.length());

//        String comparison.
//        s1 > s2 -> return +ve value.
//        s1 < s2 -> return -ve value.
//        s1 = s2 -> return 0.
        System.out.println(firstName.compareTo(secondName));

//      Retrieve individual value from string.
        for (int i = 0;i<firstName.length();i++)
        {
            System.out.println(firstName.charAt(i));
        }

//        Substrings in java.

        String sentence = "I live in Mehrauli";
//        substring(begin index,end index)
        System.out.println(sentence.substring(3,9));


//        ParseInt method of Integer class.

        String str = new String("123");
        int num = Integer.parseInt(str);//converting string to integer.
        System.out.println(num);

//        toString method of String class.

        int number =123;
        String st = Integer.toString(number);
        System.out.println(st);


    }
}
