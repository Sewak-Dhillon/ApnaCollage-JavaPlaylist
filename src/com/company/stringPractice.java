package com.company;

public class stringPractice {
    public static void main(String[] args) {
        String[] arr = {"shan","courseware","dhillon","harsh","ashcan","arch"};
        int total = 0;
        for(String i : arr)
        {
            total += i.length();
        }
        System.out.println(total);
        String original = "gursewakdhillon2911996@gmail.com";
        String result = "";
        for (int i = 0;i<original.length();i++)
        {
            if(original.charAt(i) == '@')
                break;
            else
                result += original.charAt(i);

        }
        System.out.println(result);
    }
}
