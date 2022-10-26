package com.company;
class node{
    int data;
    node next;
    node(int d)
    {
        this.data = d;
        next = null;
    }
}


class llQueue{
    static node head = null;
    static node tail = null;
public boolean isEmpty() {
        if (head == null && tail == null) {
        return true;
        } else
        return false;
        }

public void enQueue(int num) {
       node newNode = new node(num);
       if(tail == null)
       {
           head = tail = newNode;
       }
       tail.next = newNode;
       tail = newNode;
        }

public void deQueue() {
        if (isEmpty()) {
        System.out.println("Queue is Empty.");
        } else {
        int front = head.data;
        if(head==tail)
        {
            tail = null;
        }
        head = head.next;
        }
        }
public int peek()
        {
        if(isEmpty())
        {
        System.out.println("Queue is Empty.");
        return -1;
        }
        else {
        return head.data;
        }
        }

        }
public class QueueLinkedList {
    public static void main(String[] args) {
        llQueue q = new llQueue();
        q.enQueue(10);
        q.enQueue(60);
        q.enQueue(50);
        q.enQueue(40);
        q.enQueue(90);

        while (!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.deQueue();
        }
    }
}
