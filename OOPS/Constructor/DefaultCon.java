public class DefaultCon{
    int a; 
    String str;
    // DefaultCon(){        // default constructor hai ye
    //     a=0;
    //     str=null;
    // }
    void show(){
        System.out.println(a + " "+ str);
    }
    public static void main(String[] a){
        DefaultCon d = new DefaultCon();
        d.show();

    }
}