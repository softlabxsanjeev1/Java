package Array;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Char_type_user_input {
   public static void main(String[] args) {
    System.out.print("Enter size of array = ");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    
    char arr1 [] = new char[size];     // array declaration

    // ---------- loop to take char input
    for(int i =0; i < size; i++){
        arr1[i] = scan.next().charAt(0);        
    }

    //----print array
    for(int i = 0; i < size; i++){
        System.out.print(arr1[i]+" ");
    }
   }    
}
