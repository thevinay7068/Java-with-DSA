
import java.util.Scanner;

//package MultiDimentionalArray;
public class MultiDimentionalArray{
    public static void main(String [] a){
        int[][] arr = new int[3][3];
        System.out.println(arr.length + "*" + arr[0].length);
        for(int i= 0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] +" ");
            }
             System.out.println();
        }
       

    }

        
}   

