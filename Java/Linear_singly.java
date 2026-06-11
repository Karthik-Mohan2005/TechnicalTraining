class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class Linear_singly {
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
    public static boolean search(int val){
        if(head==null){
            System.out.println("Empty");
        }else{
            Node temp = head;
            while(temp!=null){
                if(temp.data==val){
                    return true;
                }
                temp=temp.next;
            }   
        }
        return false;
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
        System.out.println(search(60));
        System.out.println(search(400));
    }
}