package Array;
import java.util.Scanner;

public class User_input_in_array {
    public static void main(String[] args) {
        System.out.print("Enetr size of array = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        //----array intitialization;
        int marks[] = new int[size];               // --------- dynamic size
        //------loop to take array elements
        for(int i = 0; i < size; i++){
            marks[i] = scan.nextInt();
        }

        //----print array element-----
        for(int i = 0; i < size; i++){
            System.out.print("Marks = "+marks[i]+" ");
        }       
    
    }
}
