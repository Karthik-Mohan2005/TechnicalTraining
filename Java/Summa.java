import java.util.*;
public  class Summa{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isprime(i) && i!=1 && i!=0){
                System.out.print(i+" ");
            }
        }
        
    }
    public static boolean isprime(int i){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        }
}