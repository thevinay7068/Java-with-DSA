public class Stair {
    public static int nthWayToClimb(int n){
        if(n==1||n==2)
            return n;
        
         return nthWayToClimb(n-1)+nthWayToClimb(n-2);
        

    }
    public static void main(String[] args) {
       System.out.println( nthWayToClimb(5));
    }
    
}