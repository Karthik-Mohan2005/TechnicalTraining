interface OS {
    public void spec();
}
class Android implements OS{
    @Override
    public void spec(){
        System.out.println("Most powerful Os");
    }
}
class IOS implements OS{
    @Override
    public void spec(){
        System.out.println("Most secure Os");
    }
}
class Windows implements OS{
    @Override
    public void spec(){
        System.out.println("No longer used");
    }
}
class OperatingSystemFactory {
    public OS getInstance(String temp){
        if(temp.equals("Open")){
            return new Android();
        }else if(temp.equals("Closed")){
            return new IOS();
        }else{
            return new Windows();
        }
    }
}
public class System_Design {
    //Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }

}