package Loops.Patterns;
import java.util.Scanner;

public class Char_pattrn {                  //------------Matrix of characters    
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        char ch = 'A';
        
        //-----------print--------
        for(int row = 1; row < no; row++){
        
            for(int col = 1; col < no; col++){
                System.out.print((ch)+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
