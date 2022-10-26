package com.company;

import java.util.HashSet;
import java.util.Iterator;

//It is important data Structure because of its time complexity
//For all major operation are completed in constant time
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);//It will not added to set because set contain only unique elements.
//        Elements in set are unorderd.
//        System.out.println(set);
//        set.remove(20);
        if(set.contains(20))
        {
            System.out.println("Set contains 20.");
        }
        else{
            System.out.println("Not contains.");
        }
    int n = set.size();
        System.out.println(n);

        Iterator it = set.iterator();//It is a iterator used to traverse the set.
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        // hasNext() and next().

    }
}
