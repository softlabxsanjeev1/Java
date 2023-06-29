package Loops.Patterns;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Pattern_chll_1 {
    
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int size=no-1;

        //------------print 
        for(int row = 1; row < no; row++){
            for(int col = 1; col < no; col++){
                if(row == 1 || row == size || col == 1 || col == size){
                    System.out.print(col+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
