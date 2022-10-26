package com.company;

class queue1 {
    int max;
    int front, rear;
    int arr[];
    int count;

    queue1(int max) {
        this.max = max;
        this.arr = new int[max];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        if ((rear+1)%max == front) {
            return true;
        } else
            return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else
            return false;
    }

    public void enQueue(int num) {
        if (isFull()) {
            System.out.println("Queue is Full.");
        } else {
            if (front == -1) {
                front++;
            }
            rear = (rear+1)%max;
            arr[rear] = num;
//            System.out.println(num + " is added to Queue.");
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            int value = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
               front = (front+1)%max;
//                System.out.println(value + " is deleted from the queue.");
            }
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
            return arr[front];
        }
    }

}
public class circularQueue {
    public static void main(String[] args) {
    queue1 q = new queue1(5);
    q.enQueue(10);
    q.enQueue(60);
    q.enQueue(50);
    q.enQueue(40);
    q.enQueue(90);
//        System.out.println( q.peek());
  q.deQueue();
//        System.out.println( q.peek());
        q.enQueue(40);
//        q.enQueue(40);
//    q.deQueue();

//    System.out.println( q.peek());

//
    while (!q.isEmpty()){
        System.out.print(q.peek() + " ");
        q.deQueue();
    }
    }
}
