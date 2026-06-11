class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Doubly_using_Stack {
    public static Node top = null;
    public static void insert(int val){
        Node newNode = new Node(val);
        if(top==null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
    public static void display(){
        if(top==null){
            System.out.println("Empty");
        }else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void peek(){
        if(top==null){
            System.out.println("Empty");
        }else{
            System.out.print(top.data+ " ");
        }
        System.out.println();
    }
    public static void pop(){
        if(top==null){
            System.out.println("Empty");
        }else{
            System.out.println(top.data);
            top = top.next;
        }
    }
    public static void size(){
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            int ctr = 0;
            Node temp = top;
            while(temp!=null){
                ctr++;
                temp = temp.next;
            }
            System.out.println("Length: " +ctr);
        }
    }
    public static void main(String[] args){
        display();
        size();
        insert(10);
        insert(20);
        display();
        peek();
        insert(60);
        insert(50);
        display();
        size();
        peek();
        pop();
        peek();
        display();
        pop();
        peek();
        display();
        pop();
        peek();
        display();
        pop();
        peek();
        display();
    }
}