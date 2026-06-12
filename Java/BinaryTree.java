import java.util.*;
import java.util.Queue;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class BinaryTree {
    public static Node root = null;
    public static void insert(int data) {
        Node newNode = new Node(data);
        if(root==null){
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left==null){
                curr.left = newNode;
                return;
            }else{
                q.offer(curr.left);
            }

            if(curr.right==null){
                curr.right = newNode;
                return;
            }else{
                q.offer(curr.right);
            }
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void level_order(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
    }
    public static boolean search(int key){
        if(root==null){
            return false;
        }else{
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                Node curr = q.poll();
                if(curr.data==key){
                    return true;
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int ele = sc.nextInt();
            if(ele == -1) break;
            insert(ele);
        }
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        level_order(root);
        System.out.println();
        int key = sc.nextInt();
        System.out.println(search(key));
    }
}