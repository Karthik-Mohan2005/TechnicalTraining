import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            ar.add(x);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar.get(i)>ar.get(j)){
                    int temp = ar.get(i);
                    ar.set(i,ar.get(j));
                    ar.set(j,temp);
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }

    }
}