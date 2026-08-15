// Delete the array's element of specific location
import java.util.*;
public class DeleteEle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        System.out.println("Enter the array's element:");
        for(int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the position of array to delete:");
        int pos=sc.nextInt();
        //left shipt of the array
        for(int i =pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.println("After deletion of array");
        for(int i= 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }

}