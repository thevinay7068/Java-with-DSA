abstract class Programming{
    abstract void Developer();   // abstract method
}
class html extends Programming{
    @Override
    void Developer(){
        System.out.println("Tim hamberger lee");
    }
}
class java extends Programming{
    @Override
    void Developer(){
        System.out.println("James Gosling");
    }
}
public class Main{
    public static void main(String[] args) {
        // html h = new html();
        // h.Developer();
        // java j = new java();
        // j.Developer();
        Programming h = new html();
        h.Developer();
        Programming j = new java();
        j.Developer();
    }
}
