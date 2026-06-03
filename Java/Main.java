import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String c = sc.nextLine();
            a.add(c);
        }
        Collections.sort(a);
        for(String d : a){
            System.out.print(d+" ");
        }
    }
}