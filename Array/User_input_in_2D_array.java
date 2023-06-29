package Array;

import java.util.Scanner;
import java.lang.foreign.FunctionDescriptor;
import java.util.Arrays;       //-import Arrays class to use array print method

import javax.naming.NamingException;

public class User_input_in_2D_array {
    public static void main(String[] args) {

        // students
        // subjects
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter no of students = ");
        int students = scan.nextInt();
        System.out.print("Enter no of subjects = ");
        int subject = scan.nextInt();

        //-----2D array initialization
        int[][] result = new int [students][subject];
        
        //-loop to take array
        for(int row = 0; row < students; row++){
            System.out.println("Enter marks of student = "+(row+1));
            for(int col = 0; col < subject; col++){
                   result [row][col] = scan.nextInt();
            }
        }

        // array print  methods --
        System.out.println(Arrays.deepToString(result));
    }
    
}
