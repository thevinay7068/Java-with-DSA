// public class Fibonacci {
//     public static int nthFibonacci(int n){
//         if(n==0||n==1)
//             return n;
        
//          return nthFibonacci(n-1)+nthFibonacci(n-2);
        

//     }
//     public static void main(String[] args) {
//        System.out.println( nthFibonacci(5));
//     }
    
// }





public class Fibonacci {

    public static int nthFibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            System.out.print(nthFibonacci(i) + " ");
        }
    }
}