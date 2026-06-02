import java.util.*;
public class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] t = s.split("-");
        int date = Integer.parseInt(t[0]);
        int month = Integer.parseInt(t[1]);
        int year = Integer.parseInt(t[2]);
        System.out.println(date+" "+month+" "+year);
        if(year>9999 ||year<1000){
            System.out.println("Invalid");
        }else if(date<=0 || date>=32){
            System.out.print("Not valid");
        }
        else if(month==4||month==6||month==9||month==11){
            if(date>=31 || date<=0){
                System.out.println("Not valid");
            }else{
                System.out.println("valid");
            }
        }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            if(date>=32 || date<=0){
                 System.out.println("Not valid");
            }else{
                System.out.println("valid");
            }
        }else if(month==2){
            if((year%4==0 &&year%100!=0)||(year%400==0)){
                if(date>=30 ||date<=0){
                    System.out.println("Not valid");
                }else{
                System.out.println("valid");
            }
                
            }
            if(!((year%4==0 &&year%100!=0)||(year%400==0))){
                if(date>=29 || date<=0){
                    System.out.println("Invalid");
                }else{
                System.out.println("valid");
            }
                }
        }else{
            System.out.println("Invalid");
        }

    }
}