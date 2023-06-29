package Loops.Patterns;

import java.util.Scanner;
public class Characters_reverse_pattern {
    public static void main(String[] args) {
        System.out.print("Enter size here = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        char ch = 'A';

        for(int row =1; row < size; row++){
            //--------------loop for sapces ------------
            for(int sp = 1; sp < size-row; sp++){
                System.out.print("   ");
            }
            //-------------- loop for star --------------
            for(int alph = 1; alph <= row; alph++){
                System.out.print(" "+ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
