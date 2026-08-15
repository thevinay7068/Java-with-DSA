public class ApowB {
    public static int pow(int a,int b){
        if(b==0)
            return 1;
        return a*pow(a,b-1);
       

    }
     public static void main(String[] a){
           int p= pow(2,4);
           System.out.println(p);

        }
    
}



 // more efficient code



// public class ApowB {
//     public static int pow(int a,int b){
//         if(b==0)
//             return 1;
//         int call = pow(a,b/2);
//         if(b%2==0){
//             return call*pow(a,b/2);
//         }
//         else{
//             return call*a * pow(a,b/2);
//         }
       

//     }
//      public static void main(String[] a){
//            int p= pow(2,5);
//            System.out.println(p);

//         }
    
// }

