

public class PrintOnetoN {
    public static void main(String[] args) {
        print(1,8);
    }
    public static void print(int x, int n){ 
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
    
}
