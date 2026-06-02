public class Fibbo{
    public static int fibbo(int n){
        if(n==1)return 1;
        if(n==0) return 0;
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fibbo(n));
    }
}