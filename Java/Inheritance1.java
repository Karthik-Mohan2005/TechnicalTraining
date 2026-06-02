class Placement {
    void placement(){
        System.out.println("Java c++ c python");
    }
    void place(){
        System.out.println("Java");
    }
}
class batch1 extends Placement {
    @Override
    void placement(){
        System.out.println("Java");
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        batch1 karthi = new batch1();
        karthi.placement();
        Placement kar = new Placement();
        kar.placement();
        kar.place();
        karthi.place();
    }
}