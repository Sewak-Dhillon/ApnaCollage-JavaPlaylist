package com.company;

class queue {
    int max;
    int front, rear;
    int arr[];
    int count;

    queue(int max) {
        this.max = max;
        this.arr = new int[max];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        if (front == 0 & rear == max - 1) {
            return true;
        } else
            return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
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
            arr[++rear] = num;
            System.out.println(num + " is added to Queue.");
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            int value = arr[0];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                System.out.println(value + " is deleted from the queue.");
            }
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
        }
        else{
            System.out.print("Elements in the Queue :");
            for(int i = front;i<=rear;i++){
                System.out.print(" " + arr[i]);
            }
            System.out.println();
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
            return arr[0];
        }
    }

}

public class queueDataStructure {

    public static void main(String[] args) {
        queue q = new queue(3);
        if(q.isEmpty()){
            System.out.println("Queue is Empty.");
        }
        if(q.isFull()){
            System.out.println("Queue is Full.");
        }
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.display();

//        q.deQueue();
        q.deQueue();
        q.enQueue(30);
        q.display();

        int num = q.peek();
        System.out.println(num);
    }
}
