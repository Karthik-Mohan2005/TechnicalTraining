import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
        System.out.println(rev);
    }
}
