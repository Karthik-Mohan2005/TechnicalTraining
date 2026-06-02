import java.util.*;
public class Loop{
    public static boolean isrepeat(int num){
        /*
        String n = Integer.toString(num);
        char[] a = n.toCharArray();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) return false;
            }
        }
        return true;
        */
       /*String n = Integer.toString(num);
       int[] a = new int[n.length()];
       int i=0;
       while(num!=0){
            a[i] = num%10;
            i++;
            num/=10;
        }
        
        for(int k=0;k<a.length-1;k++){
            for(int j=k+1;j<a.length;j++){
                if(a[k]==a[j]) return false;
            }
        }
        return true;*/
        HashMap<Integer,Integer> h =new HashMap<>();
        while(num!=0){
            int t = num%10;
            if(h.containsKey(t)){
                return false;
            }else{
                h.put(t,1);
            }
            num/=10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println();
        System.out.println();
        int ctr=0;
        for(int i=start;i<=end;i++){
            if(isrepeat(i)){
                System.out.println(i);
                ctr++;
            }
        }        
        System.out.println(ctr);
    }
}