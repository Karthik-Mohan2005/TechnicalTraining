class Raja{
    int mon;
    void money(){
        System.out.println("Raja has 10000");
        mon= 10000; 
    }
}
class Mohan extends Raja {
    int lan;
    void land(){
        System.out.println("Mohan has land");
        lan = 5;
    }
}
class Karthi extends Mohan {
    void name(){
        System.out.println("Karthi has name");
    }
}
class Nila extends Karthi {
    void daughter() {
        System.out.println("Daughter of karthi");
    } 
}
class Nilavan extends Karthi{
    void son(){
        System.out.println("Son of karthi");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Nilavan ni = new Nilavan();
        ni.son();
        ni.name();
        ni.land();
        ni.money();

        Nila nik = new Nila();
        nik.land();
        System.out.println(nik.lan);

    }
}