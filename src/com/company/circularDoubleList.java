public class circularDoubleList {
    node head;
    
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
        }
    }
    void push(int data){
        if(head == null){
            node n1 = new node(data);
            n1.next = n1.prev = n1;
            head = n1;
            return;
        }
        node last = head.prev;
        node n2 = new node(data);
        n2.next = head;
        head.prev = n2;
        n2.prev = last;
        last.next = n2; 
    }
    void begin(int data){
        if(head == null){
            node n1 = new node(data);
            n1.next = n1.prev = n1;
            head = n1;
            return;
        }
        node last = head.prev;

        node newNode = new node(data);
        newNode.prev = last;
        last.next = newNode;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    void insertAfter(node prev,int data){
        node last = head.prev;
        if(prev == last){
            node newNode = new node(data);
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
            last.next = newNode;
            return;
        }
        node newNode = new node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next.prev = newNode;
    }
    void insertBefore(node prev,int data){
        node newNode = new node(data);
        newNode.next = prev;
        newNode.prev = prev.prev;
        prev.prev.next = newNode;
        prev.prev = newNode;
    }
    void display(){
        node temp = head;
        while(temp.next != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }
    void displayReverse(){
        node temp = head.prev;
        while(temp.prev != head.prev){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println(temp.data+" ");
    }

    public static void main(String[] args) {
        circularDoubleList c = new circularDoubleList();
        c.push(10);
        c.push(20);
        // c.display();
        c.begin(30);
        c.begin(40);
        c.display();
        c.insertBefore(c.head.prev,50);
        c.display();
        c.displayReverse();
        // c.insertAfter(c.head.next,50);
        // c.insertAfter(c.head,60);
        // c.insertAfter(c.head.prev,70);
        // c.display();
    }
}
