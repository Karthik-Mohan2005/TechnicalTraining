import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=3;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}