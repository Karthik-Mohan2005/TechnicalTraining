class Node {
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Doubly {
    public static Node head = null;
    public static void insert_last(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public static void insert_beg(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public static void display(){
        if(head == null){
            System.out.println("Empty");
        }else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void delete_beg(){
        if(head == null){
            System.out.println("Empty");
        }else if(head.next == null){
            head = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public static void delete_end(){
        if(head == null){
            System.out.println("Empty");
        }else if(head.next == null){
            head = null;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }
    public static void main(String[] args) {
        display(); 
        insert_beg(5);
        insert_last(10);
        display();  
        insert_beg(15);
        insert_last(20);
        display();    
        insert_beg(25);
        insert_last(30);
        display();    
        insert_beg(35);
        insert_last(40);
        display(); 
        delete_beg();
        delete_end();
        display();  
        delete_beg();
        delete_end();
        display();  
        delete_beg();
        delete_end();
        display(); 
        delete_beg();
        delete_end();
        display();      
    }
}