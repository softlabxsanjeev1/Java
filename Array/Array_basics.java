package Array;

import java.lang.reflect.Array;

public class Array_basics{

    public static void main(String[] args) {
        
        //Array declaration ways
        //1st            int[] myArray;
        //2nd            int myArray1[];
        //3rd            int[] marks = new int[5];    //----fix size of array


        int array[] = {1,67,24,29,34,58};
        System.out.println("Array element = "+array[3]);
        System.out.println();
        System.out.println("Array in straight oreder ----------");

        //------print all elements of array
        for(int index = 0; index<6;index++){
            System.out.print(array[index]+",");
        }

        System.out.println();System.out.println();
        System.out.println("Array elements in reverse order -------");
        
        //--------print array from reverse
        for(int i = 5; i >= 0;i--){
            System.out.print(array[i]+",");
        }
    }
}