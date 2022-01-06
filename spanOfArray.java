import java.io.*;
import java.util.*;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int min = Integer.MAX_VALUE;      // negetive infinite value is written as Integer.MAX_VALUE 
        int max = Integer.MIN_VALUE;      // positive infinite value is written as Integer.MIN_VALUE

        for(int i = 0; i<n ; i++){
            max = Math.max(max, arr[i]);   // Math.max compares both values, and tells which one is larger
            min = Math.min(min, arr[i]);
        }

        int span = max - min ; 
        System.out.println(span);


        }
}