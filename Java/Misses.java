
import java.util.Scanner;

public class Misses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int miss = 0;
        for(char i : s.toCharArray()){
            if(i=='@' || i=='$' || i=='^') miss++;
        }
        System.out.println(miss);
    }
}
