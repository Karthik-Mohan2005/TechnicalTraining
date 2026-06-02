public class Hollow{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int s=0;s<n;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        int t = n*2;
        for(int i=0;i<t;i++){
            if(i<n || i==t-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int s=0;s<n;s++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                if(j==0 || j==n-i-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
