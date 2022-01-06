import java.io.*;
import java.util.*;
public class barchart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
        
        }
        Barc(arr);
    }
public static int maximum(int [] arr) {
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length; i++){
    max = Math.max(max, arr[i]);
    }
    return max;
}    
public static void Barc(int []arr) {
    int height = maximum(arr);
    for(int h = height; h>=1; h--){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>=h){
                System.out.print("* \t");
            }
            else{
                System.out.print(" \t");
            }
        }
        System.out.println();
    }
}
}
