package com.company;

//Classes and objects are considered in programming to implement real world example.
//Java have its own garbage collector to release  the memory.
class pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing something.");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }

}


class Student{
    String name;
    int age;

    Student() //Without parameter constructor.
    {
        System.out.println("Constructer called.");
    }
    Student(String name,int age) // Parametrised Constructor
    {
        System.out.println("Constructer called.");
        this.name = name;
        this.age = age;
    }
    Student(Student s) // Copy Constructor
    {
        System.out.println("Constructer called.");
        this.name = s.name;
        this.age = s.age;
    }


    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class oopsConcept {
    public static void main(String[] args) {
    pen p1 = new pen(); // Object of pen class created.
//    p1.write();
    p1.color = "blue"; //Using dot we can access the properties and methods with the help of object.
    p1.type = "gel";

    pen p2 = new pen();
//    p2.write();
    p2.color = "red";
    p2.type = "ballpoint";

//    p1.printColor();
//    p2.printColor();

     Student s1 = new Student();
     Student s2 = new Student("Aman",25);
     s1.name = "Gursewak Singh";
     s1.age = 25;
     Student s3 = new Student(s2);

     s1.display();
//     s2.display();
     s3.display();

    }
}
