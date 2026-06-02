public class alternate1 {
    public static void alternateeven(int n){
        if(n<=0 || n==1) return;
        alternateeven(n-2);
        System.out.print(n+ " ");
    }
    public static void alternateodd(int n){
        if(n<=0) return;
        alternateodd(n-2);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=10;
        alternateeven(n);
        alternateodd(n-1);
    }
}