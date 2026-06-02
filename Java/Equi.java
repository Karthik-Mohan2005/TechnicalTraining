import java.util.*;
public class Equi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1!=n2){
            System.out.println("invalid");
            return;
        }
        System.out.println("Enter the first array elements");
        int[] a1 = new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the second array elements");
        int[] a2 = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i] = sc.nextInt();
        }
        String[] c = new String[n1];
        String[] d = new String[n2];
        
        for(int i=0;i<n1;i++){
            String t = String.valueOf(a1[i]);
            char[]r = t.toCharArray();
            Arrays.sort(r);
            c[i] = new String(r);

            String p = String.valueOf(a2[i]);
            char[]q = p.toCharArray();
            Arrays.sort(q);
            d[i] = new String(q);
            System.out.println(c[i]+" "+d[i]);
        }
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            System.out.println("Equiarray");
        }else{
            System.out.println("Non equi array");
        }
    }
}