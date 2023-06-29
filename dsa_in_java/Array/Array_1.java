package dsa_in_java.Array;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        //user defined array
    int arr[] = new int [5];

    System.out.print("Enter array values = ");
    Scanner scan = new Scanner(System.in);     
    // array input
    for(int i = 0; i<5;i++){
        arr[i] = scan.nextInt();
    }
    // print array
    for(int i = 0; i<5;i++){
        System.out.print(arr[i]+" ");
    }
        
    }    
}
