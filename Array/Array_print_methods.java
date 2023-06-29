package Array;

import java.util.Arrays;

public class Array_print_methods {
    public static void main(String[] args) {

        //----array initialization--
        int arr1 [] = {2,4,5,6,7};

        
        // for loop

        //--------for each loop
        for( int value : arr1){
            System.out.println(value);
        }

        System.out.println();
        //--------with string method---
        String str = Arrays.toString(arr1);
        System.out.println(str);


        // Arrays.deepToString();
        //Arrays.asList();
    }
    
}
