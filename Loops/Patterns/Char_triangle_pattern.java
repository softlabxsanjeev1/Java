package Loops.Patterns;
import java.util.Scanner;

public class Char_triangle_pattern {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        char val = 'A';
        //-----------print--------
        for(int row = 1; row < no; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
    
}
        

