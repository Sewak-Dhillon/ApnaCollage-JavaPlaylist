package com.company;

//Space Complexity = O(1) constant complexity.

//Time Complexity = O(n).
public class reverseLinkedListUsingIterativeMethod {

    node1 head;
    static class node1{
        int data;
        node1 next;

        node1(int data){
            this.data = data;
            next = null;
        }
    }
    // Inserting element from starting
    void push(int num){
        node1 new_Node = new node1(num);
        new_Node.next = head;
        head = new_Node;
    }
    // insert between the linked list
    void insertAfter(node1 prevNode , int data){

        if(prevNode == null){
            System.out.println("Previous Node can't be null.");
            return;
        }
        node1 new_Node = new node1(data);
        new_Node.next = prevNode.next;
        prevNode.next = new_Node;

    }
    // Insert node at the end
    void append(int data){
        node1 newNode = new node1(data);
        if(head == null){
            head = new node1(data);
            return;
        }
        newNode.next = null;
        node1 last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    void deletion(int key){
        node1 temp = head,prev = null;

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

    public void reverse()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        node1 prevNode = head;
        node1 currNode = head.next;
        while(currNode != null)
        {
            node1 nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public node1 reverseRecursive(node1 head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
       node1 newNode = reverseRecursive(head.next);
       head.next.next = head;
       head.next = null;
       return newNode;
    }
    public void display(){
        node1 n = head;
        while(n!=null){
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    reverseLinkedListUsingIterativeMethod list = new reverseLinkedListUsingIterativeMethod();
    list.append(10);
    list.append(20);
    list.append(30);
    list.append(40);
    list.append(50);
    list.append(60);
    list.append(70);
    list.append(80);
    list.display();
    list.head=list.reverseRecursive(list.head);
        System.out.println();
    list.display();
    }
}
