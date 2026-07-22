import java.util.*;
public class Duplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt(); 
        }
        int count = 0;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[i]==a[j]){
                        c++;
                        break;
                    }
                }
            }
            if(c==0) count++;
        }
        System.out.println(count);
    }
}