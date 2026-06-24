import java.util.Scanner;

public class StringSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String r = sc.nextLine();
        r = r.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(i<r.length()){
                if(s.charAt(i) != r.charAt(i)){
                    System.out.println(s.charAt(i));
                    break;
                }
            }else{
                System.out.println(s.charAt(i));
            }
        }
            
    }
}

