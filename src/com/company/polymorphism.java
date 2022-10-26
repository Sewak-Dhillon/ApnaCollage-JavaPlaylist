package com.company;

//Polymorphism means same name different work.
//Compile time polymorphism
//Run time polymorphism

class Stud{
    String name;
    int age;
    Stud(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display(String name)
    {
        System.out.println(name);
    }

    public void display(int age)
    {
        System.out.println(age);
    }

    public void display(String name,int age)
    {
        System.out.print(name + " " + age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Stud s1 = new Stud("Gursewak Singh",18);
        s1.display("Gursewak");
        s1.display(25);
        s1.display("Gursewak",25);
    }
}
