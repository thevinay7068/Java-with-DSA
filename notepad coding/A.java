
class A extends Thread{
    public void  run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Vinay");
        }
    }

}
class B{
    public static void main(String[] args) {
        A o = new A();
        o.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Sahani");
            
        }
    }
}