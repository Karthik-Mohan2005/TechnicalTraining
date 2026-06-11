public class StackArray {
    public static int[] stack = new int[10];
    public static int top = -1;
    public static void insert(int val){
        if(top<0){
            top++;
            stack[top] = val;
        }else{
            top++;
            if(top>=10){
                pop();
                top--;
            }
            stack[top] = val;
        }
    }
    public static void pop(){
        if(top<0){
            System.out.println("Stack is empty");
        }else{
            System.out.println(stack[top]);
            stack[top] = 0;
            top--;
        }
    }
    public static void display(){
        if(top<0){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void peek(){
        if(top<0){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top]);
        return;
    }
    public static void main(String[] args){
        insert(50);
        insert(20);
        insert(40);
        insert(90);
        display();
        pop();
        display();
        pop();
        display();
        peek();
        pop();
        display();
        pop();
        display();
        pop();
        display();
    }
}