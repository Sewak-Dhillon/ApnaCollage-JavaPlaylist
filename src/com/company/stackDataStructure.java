package com.company;

class stackUsingArray {
    int top;
    static final int max = 1000;
    int[] arr = new int[max];

    stackUsingArray() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }
    boolean isFull() {
        return (top >= max);
    }

    boolean push(int num) {
        if (top >= max - 1) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            top += 1;
            arr[top] = num;
            return true;
        }
    }

    int pop() {
        int value = 0;
        if (top < 1) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            value = arr[top--];
            return value;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }
    }

    void display() {
        for (int i = top; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

public class stackDataStructure {
    stackNode root;

    static class stackNode {
        int data;
        stackNode next;

        stackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        stackNode newNode = new stackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            stackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " is pushed to stack");
    }

    public int pop() {
        int popped = Integer.MAX_VALUE;
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        } else
            return root.data;
    }

    public void display() {
        stackNode temp = root;
        if(isEmpty()){ System.out.println("Stack is Empty"); }
        else{
        System.out.print("Element present in Stack :");
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }
    }

    public static void main(String[] args) {
        stackUsingArray s = new stackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        if (s.isEmpty())
            System.out.println("Stack is Empty.");
        else
            System.out.println("Stack is not Empty.");

        int x = s.peek();
        if (x == 0)
            System.out.println("Stack Underflow");
        else
            System.out.println("Element on top of Stack is " + x);

        s.pop();
        s.pop();

        s.display();

        stackDataStructure sd = new stackDataStructure();
        sd.push(100);
        sd.push(200);
        sd.push(300);
        sd.push(400);
        sd.push(500);
        sd.display();
        
        System.out.println("\n"+sd.pop() + " is removed from the stack.");
        System.out.println("\n"+sd.pop() + " is removed from the stack.");
        sd.display();

        if(sd.peek() > Integer.MAX_VALUE){
            System.out.println("\n" + sd.peek() + " is present on top.");
        }


        
    }
}
