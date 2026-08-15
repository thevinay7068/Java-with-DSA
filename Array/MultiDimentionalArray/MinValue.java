

// find the minmum value out of the maximum  element of the 2d array
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MinValue {
    public static void main(String[] args) {
        // System.out.println("");
        int [][] arr = {{2,5,4},{5,6,9},{6,8,4}};
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<3;i++){
            int max = Integer.MIN_VALUE ;
            for(int j= 0;j<3;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            
            if(max<min){
                min = max;
            }
           
        }
         
        System.out.println(min);
    }
}