 class Notification{
    void send(){
        System.out.println("All notification send");
    }

}
class Email extends Notification{
    @Override
    void send(){
        super.send();
        System.out.println("Email  send");
    }

    

}
class SMS extends Notification{
    @Override
    void send(){
        System.out.println("SMS send");
    }

}
class Whatapp extends Notification{
    @Override
    void send(){
        System.out.println("SMS send on whatapps");
    }

}
public class Main1{
    public static void main(String [] a){
        Notification n;
        n = new Email();
        n.send();
        n = new SMS();
        n.send();
        n = new Whatapp();
        n.send();
    }
}
