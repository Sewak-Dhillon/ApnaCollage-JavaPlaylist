package com.company;

// Time Complexity	Worst Case	Average Case
// Search	           O(n)	        O(n)
// Insert	           O(1)	        O(1)
// Deletion	           O(1)         O(1)
public class linkedList {
    node head;
    static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            next = null;
        }
    }
    // Inserting element from starting
    void push(int num){
        node new_Node = new node(num);
        new_Node.next = head;
        head = new_Node;
    }
    // insert between the linked list
    void insertAfter(node prevNode , int data){

        if(prevNode == null){
            System.out.println("Previous Node can't be null.");
            return;
        }
        node new_Node = new node(data);
        new_Node.next = prevNode.next;
        prevNode.next = new_Node;

    }
    // Insert node at the end
    void append(int data){
        node newNode = new node(data);
        if(head == null){
            head = new node(data);
            return;
        }
        newNode.next = null;
        node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    void deletion(int key){
        node temp = head,prev = null;

        if(temp != null && temp.data == key ){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }

        prev.next = temp.next;
        
        
    }
    public void display(){
        node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
   public static void main(String[] args) {
    linkedList l = new linkedList();
    
    l.append(10);
    l.append(20);
    l.append(30);
    // l.push(300);
    // l.insertAfter(l.head.next,3030);
    l.display();
    l.deletion(20);
    System.out.println();
    l.display();
   } 
}
