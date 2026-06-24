import java.util.Scanner;

public class Sum_of_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            if(r % 2 != 0){
                sum += r;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
