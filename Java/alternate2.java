public class alternate2 {
    public static int reversefact(int n,int fa){
        if(n<=0) return fa;
        if(n%2==0){
            fa -=  fact(n);
        }else{
            fa+=fact(n);
        }
        return reversefact(n-1,fa);
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        int fa = 0;
        int ga = reversefact(n,fa);
        System.out.println(ga);

    }
}