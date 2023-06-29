package Loops.Patterns;

import java.util.Scanner;

public class Arrow_shape_pattern {
    public static void main(String[] args) {
        System.out.print("Enter size = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        //--------------upper part----------------------------
        for(int row = 1; row < size; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //------------------ lower part-----------------------
        for(int row = 1; row < size; row++){
            for(int col = 1; col < size-row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
