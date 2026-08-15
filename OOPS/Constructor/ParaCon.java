
public class ParaCon{
     int result;
   

    public ParaCon( int a , int b) {
        
        result = a+b;

       

    }
    void sum(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        ParaCon p = new ParaCon(10,20);
        p.sum();
    }
    
}