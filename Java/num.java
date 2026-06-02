import java.util.*;
public class num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        /*if(n<0){
            n=n*-1;
        }
        String t =Integer.toString(n) ;

        System.out.println(t.length());*/
        int t=n,a=0;
        while(t!=0){
            int r = t%10;
            a+= (r*r*r);
            t/=10;
        }
        if(a==n){
            System.out.print("Valid core");
        }else{
            System.out.print("Invalid core");
        }
    }
}