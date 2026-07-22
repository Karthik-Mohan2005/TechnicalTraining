import java.io.*;
public class Input{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int num = Integer.parseInt(n);
        System.out.println(num);
        String[] ch = br.readLine().split(" ");
        int[] a =new int[ch.length];
        for(int i=0;i<ch.length;i++){
            a[i] = Integer.parseInt(ch[i]);
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}