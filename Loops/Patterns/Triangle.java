package Loops.Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Enter size here = ");
     Scanner scan = new Scanner(System.in);
     int size = scan.nextInt();

     for(int row = 1; row < size; row++){
        for(int col = 1; col <= row; col++){
            System.out.print(" * ");
        }
        System.out.println();
     }
     
    }
    
}
