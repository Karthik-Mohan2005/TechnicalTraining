class Car {
    private String name;
    private String model;
    private int year;
    private int number;
    public Car(){
        this.year = 2025;
    }
    public Car(String name,String model, int year,int number){
        this.name = name;
        this.model = model;
        this.year = year;
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void display(){
        System.out.println(name+" "+model+" "+" "+year+" "+number);
    }
}
public class OOPS1 {
    public static void main(String[] args){
        Car toyata = new Car("Toyato","AB12",2005,1234);
        toyata.display();
        Car suzuki  = new Car();
        suzuki.setName("Maruti");
        suzuki.setModel("5jknm");
        suzuki.setNumber(123);
        suzuki.setYear(2006);
        suzuki.display();

    }
}