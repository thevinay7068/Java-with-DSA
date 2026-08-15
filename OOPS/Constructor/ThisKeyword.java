// public class ThisKeyword{
//     int a;
//     ThisKeyword(int a){
//         a=a;
//     }
//     void show(){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         ThisKeyword r = new ThisKeyword(40);
//         r.show();
//     }
// }

// just know the value of this keyword


public class ThisKeyword{
    int a;
    ThisKeyword(int a){
       this.a=a;
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ThisKeyword r = new ThisKeyword(40);
        r.show();
    }
}