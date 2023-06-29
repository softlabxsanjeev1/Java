package dsa_in_java.Array;

import java.util.Arrays;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        //--------------------array initialization
        int arr1[]= {12,26,5,3,9,18,15,17};
        int arr2[] = {7,8,6,10,34};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr3[] = new int[n1+n2];

        // insert arr1 ele in arr3
        int i=0;
        while(i<n1){
            arr3[i]=arr1[i];
            i++;
        }
        //insert arr2 ele in arr3 use i var with k
        int j = 0;
        while(j<n2){
            arr3[i] = arr2[j];
            j++;
            i++;
        }

        //sort array3
        Arrays.sort(arr3);
        //print arr3
        System.out.print("Array 3 : ");

        for(int k=0; k<arr3.length; k++){
            System.out.print(arr3[k]+" ");
        }
    }
}
