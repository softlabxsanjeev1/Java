package dsa_in_java.Array;

import java.util.LinkedList;
import java.util.Queue;

public class Duplicate_zeros {
    public static void main(String[] args) {
        int arr[] = {2,4,0,5,6,0,4,0,8,0};

        //---print duplicate zerros if one zero found in array  (use queue)
    
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<arr.length; i++){
            q.add(arr[i]);
            if(arr[i] == 0)
            q.add(0);
            // System.out.println("In "+q);
            arr[i] = q.remove();
            // System.out.println("After Remove "+q);
        }

        // print array
        for(int value : arr){
            System.out.print(value+" ");
        }
        
        
    }
   
}
