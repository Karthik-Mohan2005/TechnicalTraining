import java.util.Scanner;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class BST_implementation {
    public static Node root = null;
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int ele;
        while(true)
        {
            ele = input.nextInt();
            if(ele==-1)
                break;
            root = insertion(root,ele);
        }
       inorder(root);
       delete_node(root,60);
       System.out.println();
       inorder(root);
    }
    public static Node create_node(int val)
    {
        Node newnode = new Node(val);
        return newnode;
    }

    public static Node insertion(Node node ,int val)
    {
        if(node==null)
        {
            return create_node(val);
        }
        if(node.data > val)
            node.left = insertion(node.left,val);
        if(node.data < val)
            node.right = insertion(node.right,val);

        return node;
    }
    public static void inorder(Node node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }
    public static Node delete_node(Node node,int key){
        if(root==null){
            System.out.println("Tree is empty");
            return null;
        }
        if(key<node.data){
            node.left = delete_node(node.left,key);
        }
        else if(key>node.data){
            node.right = delete_node(node.right,key);
        }
        else{
            if(node.left==null && node.right==null){
                return null;
            }else if(node.left==null){
                return node.right;
            }
            else if(node.right==null){
                return node.left;
            }
            Node N = min_value(node.right);
            node.data = N.data;
            node.right = delete_node(node.right,N.data);
        }
        return node;
    }
    public static Node min_value(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

}



