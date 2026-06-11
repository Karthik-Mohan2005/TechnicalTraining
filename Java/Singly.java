class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Singly {
    public static Node head = null;
    public static void insert_beg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public static void insert_last(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }
    public static void insert_middle(int data,int pos){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            int ctr=1;
            pos = pos-1;
            Node temp = head;
            while(temp!=null){
                if(ctr==pos){
                    break;
                }
                temp=temp.next;
                ctr++;
                
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public static void display(){
        if(head==null){
            System.out.println("Empty");
        }else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void delete_beg(){
        if(head==null){
            System.out.println("Empty");
        }else{
            head = head.next;
        }
    }
    public static void delete_end(){
        if(head==null){
            System.out.println("Empty");
        }else{
            Node temp = head;
            while(temp!=null && temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public static void delete_middle(int pos){
        if(head==null){
            System.out.println("Empty");
        }else{
            int ctr=1;
            pos = pos-1;
            Node temp = head;
            while(temp!=null){
                if(ctr==pos){
                    break;
                }
                temp=temp.next;
                ctr++;
                
            }
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args){
        insert_beg(50);
        display();
        insert_last(20);
        display();
        insert_middle(10,2);
        display();
        insert_middle(100,3);
        display();
        insert_beg(30);
        display();
        insert_beg(40);
        display();
        insert_beg(500);
        display();
        insert_beg(60);
        display();
        insert_beg(70);
        display();
        delete_beg();
        display();
        delete_end();
        display();
        delete_middle(2);
        display();
        delete_beg();
        display();
        delete_end();
        display();
        delete_middle(2);
        display();
        delete_beg();
        display();
        delete_end();
        display();
    }
}