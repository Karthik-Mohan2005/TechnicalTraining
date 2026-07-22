import java.util.*;
public class CharacterExpansion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] t = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int pos = 0,c=0;
        for(int i=0;i<t.length;i++){
            if(Character.isDigit(t[i])){
                pos = i;
                int k = t[i]-'0';
                for(int j=0;j<k;j++){
                    for(int l=c;l<pos;l++){
                        for(int m=0;m<k;m++){
                            sb.append(t[l]);
                        }
                    }
                }
                c=pos+1;
            }
        }
        System.out.println(sb.toString());
    }
}
