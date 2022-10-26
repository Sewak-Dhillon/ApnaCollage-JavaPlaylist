public class doublyLInkedList {
    node head;
    static class node{
        int data;
        node prev;
        node next;
        node(int d) {data = d;}
    }

        // Adding a node in front of a linked list.
        public void push(int data){
            node newNode = new node(data);

            newNode.next = head;
            newNode.prev = null;

            if(head != null){
                head.prev = newNode;
            }

            head = newNode;
        }
        public void insertAfter(node prevNode,int data){
            if(prevNode == null){
                System.out.println("Given Previous node is null.");
                return;
            }
            node newNode = new node(data);
            newNode.next = prevNode.next;
            newNode.prev = prevNode;
            prevNode.next = newNode;

            if(newNode.next != null){
                newNode.next.prev = newNode;
            }
        }
        public void insertBefore(node prevNode,int data){
            if(prevNode == null){
                System.out.println("Given Previous node is null.");
                return;
            }
            node newNode = new node(data);
            newNode.prev = prevNode.prev;
            newNode.next = prevNode;
            prevNode.prev = newNode;

            if(newNode.prev != null){
                newNode.prev.next = newNode;
            }
        }
        void delete(int data){
            node temp = head;
            while(temp.data != data){
                temp = temp.next;
            }
            if(temp == head){
                temp.next.prev = null;
                head = temp.next;
                return;
            }
            if(temp.next == null){
                temp.prev.next = null;
                return;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        
        void append(int data){
            node newNode = new node(data);
            newNode.next = null;
            node last = head;
            if(head==null){
                newNode.prev = null;
                head = newNode;
                return;
            }
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
        public void display(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data + " " );
                temp = temp.next;
            }
        }
    public static void main(String[] args) {
        doublyLInkedList c = new doublyLInkedList();
        c.push(10);
        c.push(20);
        c.push(30);
        c.display();
        System.out.println();
        c.append(60);
        c.append(90);
        c.append(70);
        c.display();
        System.out.println();
        c.insertAfter(c.head,100);
        c.insertAfter(c.head,200);
        c.insertAfter(c.head,300);
        c.display();
        System.out.println();
        c.insertBefore(c.head.next.next.next, 1000);
        c.insertBefore(c.head.next, 3000);
        c.display();
        System.out.println();
        c.delete(30);
        c.delete(20);
        // c.delete(70);
        c.display();
    }
}
