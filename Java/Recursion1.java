public class Recursion1{
    public static void recurse(int n){
        if(n==10){
            System.out.println(n);
        }else{
            System.out.println(n);
            recurse(n+1);
        }
    }
    public static void main(String[] args){
        int n=1;
        recurse(n);
    }
}