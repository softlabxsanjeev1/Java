package Array.Array_challenge;
import java.util.Arrays;

public class Duplicate_in_array {
    public static void main(String[] args) {
        
        int arr[] = { 3, 5, 6, 5, 45, 3, 60, 70};           // --array initialization

        //-Array before reverse
        System.out.print("Array with Duplicate elements :  ");
        for (int value : arr) {
            System.out.print(+value+" ");
        }
        System.out.println();

        //----------find duplicate array
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+"");
                    break;
                }
            }
        }


        
    }
    
}
