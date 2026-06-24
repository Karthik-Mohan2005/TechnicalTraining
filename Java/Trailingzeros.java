import java.util.Scanner;

public class Trailingzeros {
    public static int trailingzeros(int n){
        return n==0?0:n/5+trailingzeros(n/5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = trailingzeros(n);
        System.out.println(fact);
    }
}
