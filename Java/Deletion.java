import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Deletion {
    public static Node head = null;
    public static void insert(int ele){
        Node newnode = new Node(ele);
        if(head==null){
            head = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }

    }
    public static void display(){
        Node temp = head;
        if(head == null){
            System.out.println("No elements to be displayed.");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void delete(int ele){
        Node temp = head;
        if(head == null){
            System.out.println("No elements to be deleted.");
            return;
        }
        if(head.data==ele){
            head = head.next;
        }
        while(temp!=null && temp.next.data !=ele){
            temp = temp.next;
        }
        if(temp.next.next==null){
                temp.next = null;
                return;
        }
        temp.next = temp.next.next;

    }
    public static int sum(){
        Node temp = head;
        int sum = 0;
        while(temp!=null){
            sum = sum*10+temp.data;
            temp = temp.next;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        display();
        while(true){
            n=sc.nextInt();
            if(n==-1){
                break;
            }else{
                insert(n);
            }
        }
        display();
        int s = sum();
       System.out.println("Sum: " + s);
       String str = String.valueOf(s*2);
       System.out.println("Double of Sum: " + str);

        /*
        int del = sc.nextInt();

        System.out.println("----------------------------------------------");
        delete(del);
        System.out.println("----------------------------------------------");
        display();*/
    }
}