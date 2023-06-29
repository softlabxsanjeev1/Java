package Array.Array_challenge;
import java.util.Arrays;

public class MIn_Max_Span_in_array {
    public static void main(String[] args) {
        
        int arr[] = { 13, 59, 66, 8, 23, 60, 70};    // --array initialization

        //-Array before reverse
        System.out.print("Array :  ");
        for (int value : arr) {
            System.out.print(+value+" ");
        }
        System.out.println();

        // find min max by direct method use Arrays.sort method
        // array.sort(arr)   -> sort ele in ascending order 
        // first = min;
        //last = max;

        //----------------find min and max with for each loop
        int min = arr[0];
        int max = arr[0];
        for(int values : arr){
            
            if(min > values){            
                min = values;
            }
            if(max < values){
                max = values;
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);

        //------span
        int span = max - min;
        System.out.println("Span : "+span);

    }
    
}
