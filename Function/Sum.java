package funtionORmethod;
import java.util.*;

public class Sum{
    public static int pro(int n1,int n2){
        int multi = n1*n2;
        return multi;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int multi = pro(n1, n2);
        System.out.println(multi);
    }
}