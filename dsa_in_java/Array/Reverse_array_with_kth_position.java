package dsa_in_java.Array;

import javax.sound.midi.VoiceStatus;

public class Reverse_array_with_kth_position {
    
    // reverse method
    public static void reverse(int []array,int start,int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


    public static void print(int arr[], int size){
        System.out.print("Reverse Array : ");
        for(int value : arr){
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {12,4,5,6,7,3,2,13,14,15};
        int n = arr1.length;
        int k=4;
        // int arr2[] = new int [n];
        System.out.println("Length of array : "+n);
        reverse(arr1,0,n-1);
        //--print fun
        print(arr1, n-1);

        int arr2[] = new int[n];
        arr2 = arr1;        
        reverse(arr2,0,k-1);   // reverse sub rray 1
        reverse(arr2,k+1,n-1);       // reverse sub array2
        System.out.println();
        System.out.println("Revrse rotate array : ");
        print(arr2, n-1);
        

    }
}
