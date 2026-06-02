public class Exception {
    public static void main(String[] args){
       try{
            int a=10;
            int b =10;
            int[] d =new int[5];
            System.out.println(a/b);
            System.out.println(d[10]);
            System.out.println("Hello World");
       }catch(ArithmeticException e){
            System.out.print(e+"\nDivision by zero");
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e+"\nArray index out of bounds");
       }finally{
            System.out.println("\nThis is finally block");
       }
        

    }
}