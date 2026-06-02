class Car {
    void display() {
        System.out.println("This is a car.");
    }   
}
class Tata extends Car {
    void document() {
        System.out.println("Tata has documents.");
    }
}
class Nexon extends Tata {
    void name() {
        System.out.println("Nexon is the name of the car.");
    }
}

interface petrol {
    void petrol();
}
interface ev {
    void electric();
}
class Hybrid extends Car implements petrol, ev {
    public void petrol() {
        System.out.println("This car uses petrol.");
    }
    public void electric() {
        System.out.println("This car is electric.");
    }
}


public class Multiple {
    public static void main(String[] args) {
        Hybrid h = new Hybrid();
        h.display();
        h.petrol();
        h.electric();
    }
}