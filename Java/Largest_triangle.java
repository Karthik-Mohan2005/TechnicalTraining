import java.util.Scanner;

public class Largest_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 2;
        double max = Double.MIN_VALUE;
        while(n-->0){
            int base = sc.nextInt();
            int height = sc.nextInt();
            max = Math.max(max,(base*height)/2);
        }
        System.out.printf("%.6f",max);
    }
}
