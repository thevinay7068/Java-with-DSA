import java.util.*;
public class DynamicArray{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size,i;
    System.out.println("Entet the size of array");
     size = sc.nextInt();
    int a[] = new int[size];
     System.out.print("enter the element ");
    for(i=0;i<size;i++){
         
        a[i] = sc.nextInt();
        System.out.print("enter the next element ");
       
    
    }
     System.out.print("printed array ");
     for(i=0;i<size;i++){
         System.out.print(a[i] +" ");
         
     }
     
    
    
        
    }
}