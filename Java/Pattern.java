public class Pattern{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int s=0;s<n;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n*2;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int s=0;s<n;s++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
