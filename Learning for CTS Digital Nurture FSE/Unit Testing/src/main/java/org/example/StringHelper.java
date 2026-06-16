package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringHelper {
    public String swap(String str){
        char[] t = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length-2;i++){
            sb.append(t[i]);
        }
        sb.append(t[t.length-1]);
        sb.append(t[t.length-2]);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.isEmpty()){
            System.out.println(" ");
            return;
        }else if(str.length()==1){
            System.out.println(str);
        }else{
            StringHelper a = new StringHelper();
            String k = a.swap(str);
            System.out.println(k);
        }
    }
}