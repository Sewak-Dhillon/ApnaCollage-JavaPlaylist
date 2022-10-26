package com.company;
import java.util.HashMap;
import java.util.Map;


public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Gursewak Singh");
        map.put(2,"Gurkirat Singh");
        map.put(3,"Jashanpreet Singh");
        map.put(4,"Harshpreet Singh");
        map.put(5,"Arsh arora");

        System.out.println(map);

        map.put(3,"Sukhwinder kaur");

        System.out.println(map);

        for (Map.Entry<Integer,String> e: map.entrySet())
        {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " ");
            System.out.println();
        }
    }
}
