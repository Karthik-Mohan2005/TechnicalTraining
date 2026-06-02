/*public class Average{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        ArrayList<Integer> a =new ArrayList<>();
        while (true) { 
            
            int n =sc.nextInt();
            if(n==-1){
                break;
            }
            a.add(n);
            sum+=n;
            
        }
        // Collections.sort(a);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:a){
            if(i>max) max=i;
            if(i<min) min =i;
        }
        System.out.println("Maximum "+max);//a.get(a.size()-1));
        System.out.println("Minimum "+min);//a.get(0));
        System.out.println("Sum "+sum);
        double avg = sum/a.size();
        System.out.printf("Average %.2f",avg);
    }
}*/
import java.util.*;
public class Average{
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;
        int ctr=0;
        Scanner sc =new Scanner(System.in);
        while(true){
            int n =sc.nextInt();
            if(n==-1){
                break;
            }
            if(n>max) max=n;
            if(n<min) min =n;
            sum+=n;
            ctr++;
        }
        System.out.println("Maximum "+max);//a.get(a.size()-1));
        System.out.println("Minimum "+min);//a.get(0));
        System.out.println("Sum "+sum);
        double avg = (double)sum/ctr;
        System.out.printf("Average %.2f",avg);
        
    }
}