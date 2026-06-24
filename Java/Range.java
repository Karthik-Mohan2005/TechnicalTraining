import java.util.ArrayList;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = sc.nextInt();
        int right = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a>=left && a<=right){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
