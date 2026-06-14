class Phone {
     private String os;
     private String processor;
     private int ram;
     private int camera;
     private double screensize;

     public Phone(String os,String processor,int ram,int camera,double screensize){
        super();
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.camera = camera;
        this.screensize = screensize;
     }
  
     
     @Override
     public String toString(){
        return "Phone [os = " + os+ ",ram = "+ram+" camera = "+camera+" processor = "+processor+" screensize = "+screensize+"]";
     }
}
class PhoneBuilder {
    private String os;
    private String processor;
    private int ram;
    private int camera;
    private double screensize;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
     }
     public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
     }
     public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
     }
     public PhoneBuilder setCamera(int camera){
        this.camera = camera;
        return this;
     }
     public PhoneBuilder setScreenSize(double screensize){
        this.screensize = screensize;
        return this;
     }
     public Phone getPhone(){
        return new Phone(os, processor, ram, camera, screensize);
     }

}
public class Builder_design_pattern {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(4).setScreenSize(5.5).getPhone();
        System.out.println(p);
    }

}