import java.util.*;
public class Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                int a = sc.nextInt();
                max = Math.max(max,a);
            } 
            arr.add(max);
        }
        System.out.println(arr);
    }
}
