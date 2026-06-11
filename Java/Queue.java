class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class Queue {
    public static Node front = null;
    public static Node rear = null;
    public static void enqueue(int val){
        Node newNode = new Node(val);
        if(front==null && rear==null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public static void display(){
        Node temp = front;
        if(front==null){
            System.out.println("Empty");
        }else if(front.next==null){
            System.out.println(front.data);
        }else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void dequeue(){
        if(front==null){
            System.out.println("Empty");
        }else{
            front = front.next;
        }
    }
    public static void main(String[] args) {
        enqueue(50);
        enqueue(40);
        enqueue(30);
        enqueue(20);
        enqueue(10);
        display();
        dequeue();
        display();
        dequeue();
        display();
        dequeue();
        display();
        enqueue(50);
        enqueue(40);
        display();
    }
}
