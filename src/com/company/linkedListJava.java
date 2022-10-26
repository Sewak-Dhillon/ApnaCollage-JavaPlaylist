package com.company;
import  java.util.LinkedList;

public class linkedListJava {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.addFirst("Gursewak");
    list.addFirst("Singh");

        System.out.println(list);

    list.addLast("singh");
    list.addLast("19919");
    list.add("19919");

        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i) + "-->");
        }
        System.out.println("null");

        list.removeFirst();

        System.out.println(list);

        list.removeLast();

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
