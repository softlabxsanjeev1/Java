package Loops.Patterns;

import java.util.Scanner;

public class Diagonal_pattern {
    public static void main(String[] args) {
        System.out.print("Enetr size here = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        //-------------- print---
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == col || row + col == size + 1) {
                    System.out.print(" * ");                    
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
