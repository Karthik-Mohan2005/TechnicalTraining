import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=1;i<=n;i++){
            String temp = q.poll();
            System.out.println(temp);
            q.add(temp+"0");
            q.add(temp+"1");
        }
    }
}