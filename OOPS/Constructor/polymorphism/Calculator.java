// compile time polymorphism  (method overloading)

public class Calculator {
    void add(int a,int b){
        int sum =a+b;
        System.out.println(sum);

    }
    void add(int a,int b , double d){
        double sum =a+b+d;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(4,6);
        c.add(5,5,5.5);
    }
    
}
