package com.company;

import java.util.Stack;

public class queueUsingTwoStacks {
    static class Q{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int num)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(num);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int remove()
        {
            if(s1.isEmpty())
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            else {
                return s1.pop();
            }
        }

        public static int peek()
        {
            if(s1.isEmpty())
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            else {
                return s1.peek();
            }
        }
    }
    public static void main(String[] args) {
        Q q = new Q();
        q.add(10);
        q.add(60);
        q.add(50);
        q.add(40);
        q.add(90);

        while (!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
