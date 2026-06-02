public class alternate{
    public static void reverseodd(int n){
        if(n<=0) return;
        
        reverseven(n-1);
        System.out.print(n-1+" ");
                
    }
    public static void reverseven(int n){
        if(n<=0) return;
        
        reverseodd(n-1);
        System.out.print((n+1)+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        reverseodd(n);        
    }
}
