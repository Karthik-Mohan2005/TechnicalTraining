import java.util.*;
class Subscriber {
    private String name;
    private Channel channel = new Channel();
    public Subscriber(String name){
        super();
        this.name = name;
    }
    public void update(){
        System.out.println("Hey "+name+" Video uploaded");
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
class Channel {
      List<Subscriber> subs = new ArrayList<>();
      private String title;

      public void subscribe(Subscriber sub){
          subs.add(sub);
      }
      public void unsubscribe(Subscriber sub){
          subs.remove(sub);
      }
      public void notifySubscriber(){
           for(Subscriber sub:subs){
                sub.update();
                System.out.println(title);
           }
      }
      public void upload(String title){
        this.title = title;
        notifySubscriber();
      }
}

public class Observer{
    public static void main(String[] args){
        Channel karthi = new Channel();
        Subscriber s1 = new Subscriber("Karthik");
        Subscriber s2 = new Subscriber("Mohan");
        karthi.subscribe(s1);
        karthi.subscribe(s2);

        s1.subscribeChannel(karthi);
        s2.subscribeChannel(karthi);

        karthi.upload("How to learn programming");
    }
}