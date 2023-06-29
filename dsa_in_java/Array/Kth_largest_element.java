package dsa_in_java.Array;
import java.util.Arrays;

public class Kth_largest_element {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,7,6,55,4};
        int k = 1;

        Arrays.sort(arr);
        //print sorted array
        System.out.print("Sorted array : ");
        for(int value : arr){
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.println("Last 2rd element : "+arr[arr.length-k]); 
        
    }   
}
