import java.io.*;                                        
import java.util.*;                                      
public class span2OfArray {                              
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int min = (int)1e8;      
        int max = -(int)1e8;      

        for(int i = 0; i<n ; i++){
           if(arr[i]>max){
               max = arr[i];
           }
           if(arr[i]<min){
               min = arr[i];
           }
        }

        int span = max - min ; 
        System.out.println(span);


        }
}