import java.util.*;
public class Summa2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int[] d = printSum(n1);
        System.out.println(d[0]);
        System.out.println(d[1]);
    }
    public static int[] printSum(int n1){
        int i=1;
        while (true) { 
            int t = n1*i;
            i++;
            if(t%2==0) return new int[]{t,i};
        }
    }
}
