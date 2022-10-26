package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);//add() is used to add elements to list.
        list.add(15);
        list.add(20);

        System.out.println(list);

        System.out.println(list.get(0));//get() is used to access an elements from list.
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.add(2,18);

        System.out.println(list);

        list.set(2,50);//set() is used to change element from particular index in list.

        System.out.println(list);

        list.remove(0);//remove() is used to delete elements to list.

        System.out.println(list);

        list.size();

        Collections.sort(list);
        System.out.println(list);
    }
}
