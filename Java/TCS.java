import java.io.*;
public class TCS{
    public static int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) throws java.lang.Exception{
        /*
            1. Sum of the digit 
            2. Reverse a number 
            3. Digit count 
            4. Power of a and b
            5. Armstrong or not
            6. Palindrome or not 
            7. Prime or not 
            8. Range of prime
            9. Binary to decimal 
            10. Decimal to binary 
            11. Fibonacci series 
            12. Print Nth fibonacci 
            13. GCD and LCM
        */
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);*/
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.println(gcd(n1,n2));
        System.out.println((n1*n2)/gcd(n1,n2));*/
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        while(true){
            if(sum/10==0){
                break;
            }
            int r = 0;
            while(sum!=0){
                r+=sum%10;
                sum/=10;
            }
            sum=r;
        }
        System.out.println(sum);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n
    }
}