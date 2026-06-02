import java.util.*;
public class Days{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] c = s.split("-");
        for(String t:c){
            System.out.println(t);
        }
        
        HashMap<String,Integer> h = new LinkedHashMap<>();
        int year = Integer.parseInt(c[2]);
        h.put("Jan",31);
        if(year%4==0 && ((year%400==0)|| year%100!=0)) h.put("Feb",29);
        else h.put("Feb",28);
        h.put("Mar",31);
        h.put("Apr",30);
        h.put("May",31);
        h.put("Jun",30);
        h.put("July",31);
        h.put("Aug",31);
        h.put("Sep",30);
        h.put("Oct",31);
        h.put("Nov",30);
        h.put("Dec",31);
        String month = c[1];
        System.out.println(h+" "+month);
        int passed = 0,not_passed,f=0,days;
        for(Map.Entry<String,Integer> k:h.entrySet()){
                if(k.getKey().equals(month)){
                        f=1;
                }
                if(f==0) passed+=k.getValue();
        }
        passed+= Integer.parseInt(c[0]);
        if(h.get("Feb")==28) days=365;
        else days=366;
        not_passed= days-passed;
        System.out.println(passed + " "+not_passed);
    }
}