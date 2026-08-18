abstract  class Animal{
    abstract void sound(); // abstract class
    void eat(){         //nirmal method
        System.out.println("Animals are eat");
    }


}
class dog extends Animal{
    void sound(){
        System.out.println("dog barking");

    }
    public static void main(String[] args) {
         dog d = new dog();
         d.eat();
         d.sound();
    }

}
