package Array.Array_challenge;

import java.util.Arrays;

//-------Swap array after comparision

public class Swap_two_ele_in_array {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 8, 45 };

        System.out.println("Array before swapping element.");
        for (int value : arr) {
            System.out.println(value);
        }

        // -------------Swap array using condition-Array swapping logic
        for(int i = 0; i < 4; i++){
            if(arr[i] == 8){
                int temp = arr[i];
                arr[i] = arr[1];
                arr[1] = temp;
                System.out.println(" -------- "+arr[i]+" replace with "+arr[1]);
            }
        }
        

        
        //print array after swaping
        System.out.println("Array after swapping element.");
        for (int values : arr) {
            System.out.println(values);
        }
    }

}
