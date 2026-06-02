import java.util.*;
public class Division{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int curr=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%10!=0){
                int temp = a[i];
                for(int j=curr;j<i;j++){
                    a[j+1] = a[j];
                }
                a[curr] = temp;
                curr++;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}