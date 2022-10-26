package com.company;

public class stringBuilder {

    public static StringBuilder reverse(StringBuilder original)
    {
        for(int i = 0;i<original.length()/2;i++)
        {
           int front = i;
           int back = original.length() -1 -i;

           char frontchar = original.charAt(front);
           char backchar = original.charAt(back);

           original.setCharAt(front,backchar);
           original.setCharAt(back,frontchar);
        }
        return original;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("apnacollage");

        for(int i = sb.length()-1;i>=0;i--)//length()
        {
            System.out.print(sb.charAt(i));//charAt()
        }
        System.out.println();
//        sb.setCharAt(0,'M');
//        System.out.println("\n"+sb);
//
//        sb.insert(1,"ff");
//        System.out.println(sb);
//
//        sb.append(" dhillon");
//        System.out.println(sb);
//
//        sb.delete(2,5);
//        System.out.println(sb);

       StringBuilder s = reverse(sb);
        System.out.println(s);


    }
}
